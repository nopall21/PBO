package com.example.datamhs;

import javafx.scene.Parent;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Fmhs.fxml"));
        Scene sc = new Scene(root, 500, 400);
        stage.setTitle("Aplikasi Form Pendaftaran - FXML");
        stage.setScene(sc);
        stage.show();
    }

}