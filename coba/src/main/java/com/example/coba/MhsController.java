package com.example.coba;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class MhsController implements Initializable{

    @FXML
    private Button cancel;

    @FXML
    private Button delete;

    @FXML
    private Button edit;

    @FXML
    private TextField idNama;

    @FXML
    private TextField idNim;

    @FXML
    private DatePicker idTglLahir;

    @FXML
    private Button save;

    @FXML
    private TableColumn<Mhs, LocalDate> tLahir;

    @FXML
    private TableColumn<Mhs, String> tNama;

    @FXML
    private TableColumn<Mhs, String> tNim;

    @FXML
    private Button tambah;

    @FXML
    private TableView<Mhs> tbMhs;

    int pilih;

    @FXML
    void btCancel(ActionEvent e) {
        idNim.setText("");
        idNama.setText("");
        idTglLahir.setValue(null);
    }

    @FXML
    void btEditData(ActionEvent e) {
        int idx = tbMhs.getSelectionModel().getSelectedIndex();
        idNim.setText(tbMhs.getItems().get(idx).getNim());
        idNama.setText(tbMhs.getItems().get(idx).getNama());
        idTglLahir.setValue(tbMhs.getItems().get(idx).getTgl_lahir());
    }

    @FXML
    void btHapusData(ActionEvent e) {
        int idx = tbMhs.getSelectionModel().getSelectedIndex();
        tbMhs.getItems().remove(idx);
    }

    @FXML
    void btSave(ActionEvent e) {
        int th=idTglLahir.getValue().getYear();
        int bl=idTglLahir.getValue().getMonthValue();
        int tg=idTglLahir.getValue().getDayOfMonth();
        Mhs m = new Mhs(idNim.getText(),idNama.getText(),
                LocalDate.of(th,bl,tg));
        int idx = tbMhs.getSelectionModel().getSelectedIndex();
        tbMhs.getItems().set(idx, m);
        idNim.setText("");
        idNama.setText("");
        idTglLahir.setValue(null);
    }

    @FXML
    void btTambahData(ActionEvent e) {
        int th=idTglLahir.getValue().getYear();
        int bl=idTglLahir.getValue().getMonthValue();
        int tg=idTglLahir.getValue().getDayOfMonth();
        if (pilih==0){
            Mhs m = new Mhs(idNim.getText(),idNama.getText(),
                    LocalDate.of(th,bl,tg));
            ObservableList<Mhs> listmhs = tbMhs.getItems();
            listmhs.addAll(m);
            tbMhs.setItems(listmhs);
        }
        idNim.setText("");
        idNama.setText("");
        idTglLahir.setValue(null);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tNim.setCellValueFactory(new
                PropertyValueFactory<Mhs,String>("nim"));
        tNama.setCellValueFactory(new
                PropertyValueFactory<Mhs,String>("nama"));
        tLahir.setCellValueFactory(new
                PropertyValueFactory<Mhs,LocalDate>("tgl_lahir"));
        pilih=0;
    }

}
