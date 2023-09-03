package com.example.datamhs;

import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Window;
import javafx.scene.control.Alert;
public class MhsController implements Initializable {
    @FXML
    private TextField tfNim;
    @FXML
    private TextField tfNama;
    @FXML
    private TextField tfProdi;
    @FXML
    private Button submitButton;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
    @FXML
    protected void daftar(ActionEvent event) {
        Window owner = submitButton.getScene().getWindow();
        if(tfNim.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
            "Isikan NIM");
            return;
        }
        if(tfNama.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
            "Isikan Nama");
            return;
        }
        if(tfProdi.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
            "Isikan Prodi");
            return;
        }
        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner,
                "Pendaftaran Berhasil!",
                "Welcome " + tfNama.getText());
    }
}