package com.example.apppos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Button btnLogin;
    @FXML
    private Button btnsignUp;
    @FXML
    private TextField tfPassword;
    @FXML
    private TextField tfUser;
    @FXML
    public void prosesLogin(ActionEvent e){
        DBUtil.loginUser(e,tfUser.getText(),tfPassword.getText());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnsignUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // TODO Auto-generated method stub
                DBUtil.changeScene(event, "signUp.fxml", "SignUP", null);
            }
        });
    }


}
