package com.example.apppos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable  {

    @FXML
    private Button btnLogin;
    @FXML
    private Button btnSignUp;
    @FXML
    private TextField tfPassword;
    @FXML
    private TextField tfUser;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnSignUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
        // TODO Auto-generated method stub
                if (!tfUser.getText().trim().isEmpty()
                        && !tfPassword.getText().trim().isEmpty()) {
                    DBUtil.signUpUser(event, tfUser.getText(),
                            tfPassword.getText());
                } else {
                    System.out.println("please fill all information");
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("please fill all information");
                    alert.show();
                }
            }
        });
        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            // TODO Auto-generated method stub
                DBUtil.changeScene(event, "Login.fxml", "Login", null);
            }
        });
    }

}
