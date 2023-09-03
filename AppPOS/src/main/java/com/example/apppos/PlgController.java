package com.example.apppos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class PlgController implements Initializable {
    Stage stage;
    ObservableList<Pelanggan> listPlg = FXCollections.observableArrayList() ;
    //ObservableList<Produk> listBrg ;
    boolean flagAdd = true;
    @FXML
    private TableColumn<Pelanggan, String> cNama;
    @FXML
    private TableColumn<Pelanggan, String> cAlamat;
    @FXML
    private Button bAdd;
    @FXML
    private Button bCancel;
    @FXML
    private Button bDel;
    @FXML
    private Button bEdit;
    @FXML
    private Button bUpdate;
    @FXML
    private TextField tfNama;
    @FXML
    private TextField tfAlamat;
    @FXML
    private TextField tfidpelanggan;
    @FXML
    void add(ActionEvent event) {
        setButton(false,false,false,true,true);
        clearTeks();
        setTeks(true);
        tfidpelanggan.requestFocus();
    }
    @FXML
    void cancel(ActionEvent event) {
        setButton(true,true,true,false,false);
        clearTeks();
    }
    @FXML
    void del(ActionEvent event) {
        Connection conn = DBConnection.getConn();
        String sql="delete from pelanggan where idpelanggan=?";
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(sql);
            st.setString(1,tfidpelanggan.getText());
            st.executeUpdate();
            loadData();
            clearTeks();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML
    void edit(ActionEvent event) {
        flagAdd=false;
        setButton(false,false,false,true,true);
        setTeks(true);
        tfidpelanggan.setEditable(false);
        tfNama.requestFocus();
    }
    @FXML
    void update(ActionEvent event) {
        Connection conn = DBConnection.getConn();
        if (flagAdd){
            String sql="insert into pelanggan (idpelanggan,nama,alamat) values (?,?,?)";
            try {
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, tfidpelanggan.getText());
                st.setString(2,tfNama.getText());
                st.setString(3,tfAlamat.getText());
                st.executeUpdate();
                loadData();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            //do something..
        } else {
            String sql="update pelanggan set nama=?,alamat=? where idpelanggan=?";
            try {
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1,tfNama.getText());
                st.setString(2,tfAlamat.getText());
                st.setString(3,tfidpelanggan.getText());
                st.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        loadData();
        setButton(true,true,true,false,false);
        clearTeks();
    }

    @FXML
    private TableColumn<Pelanggan, String> idpelanggan;
    @FXML
    private TableColumn<Pelanggan, String> Nama;
    @FXML
    private TableView<Pelanggan> tbPelanggan;
    @FXML
    private Button btnPilih;
    @FXML
    private TextField tfKeyword;
    @FXML
    void pilih(ActionEvent event) {
        stage = (Stage) btnPilih.getScene().getWindow();
        Pelanggan b= tbPelanggan.getSelectionModel().getSelectedItem();
//b.setKode(tfkode.getText());
        stage.setUserData(b);
        stage.close();
    }
    @FXML
    void pilihPelanggan(MouseEvent event) {
        Pelanggan p= tbPelanggan.getSelectionModel().getSelectedItem();
        tfidpelanggan.setText(p.getIdpelanggan());
        tfNama.setText(p.getNama());
        tfAlamat.setText(p.getAlamat());
        //tfkode.setText(b.getKode());
        //MHS m = tbmhs.getSelectionModel().getSelectedItem();
    }
    void initTabel(){
        idpelanggan.setCellValueFactory(new PropertyValueFactory<Pelanggan,String>("idpelanggan"));
        cNama.setCellValueFactory(new PropertyValueFactory<Pelanggan,String>("nama"));
        cAlamat.setCellValueFactory(new PropertyValueFactory<Pelanggan,String>("alamat"));
    }
    void loadData(){
        listPlg = DBUtil.getDataPelanggan();
        tbPelanggan.setItems(listPlg);
    }
    void setFilter(){
        FilteredList<Pelanggan> filterData= new FilteredList<>(listPlg, b->true);
        tfKeyword.textProperty().addListener((observable,oldValue,newValue)->{
            filterData.setPredicate(Produk->{
                if (newValue.isEmpty() || newValue==null){
                    return true;
                }
                String searchKeyword=newValue.toLowerCase();
                if (Produk.getNama().toLowerCase().indexOf(searchKeyword)> -1){
                    return true;
                }else if (Produk.getIdpelanggan().toLowerCase().indexOf(searchKeyword)>-1){
                    return true;
                }else
                    return false;
            });
        });
        SortedList<Pelanggan> sortedData = new SortedList<>(filterData);
        sortedData.comparatorProperty().bind(tbPelanggan.comparatorProperty());
        tbPelanggan.setItems(sortedData);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initTabel();
        loadData();
        setFilter();
        setButton(true,true,true,false,false);
        setTeks(false);
    }

    protected void clearTeks(){
        tfidpelanggan.setText(null);
        tfNama.setText(null);
        tfAlamat.setText(null);
    }

    protected void setButton(Boolean b1,Boolean b2,Boolean b3,Boolean b4,Boolean b5){
        bAdd.setDisable(!b1);
        bEdit.setDisable(!b2);
        bDel.setDisable(!b3);
        bUpdate.setDisable(!b4);
        bCancel.setDisable(!b5);
    }
    protected void setTeks(Boolean b){
        tfidpelanggan.setEditable(b);
        tfNama.setEditable(b);
        tfAlamat.setEditable(b);
    }
}
