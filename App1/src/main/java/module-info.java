module com.example.app1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.app1 to javafx.fxml;
    exports com.example.app1;
}