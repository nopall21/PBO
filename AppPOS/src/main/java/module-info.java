module com.example.apppos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.apppos to javafx.fxml;
    exports com.example.apppos;
}