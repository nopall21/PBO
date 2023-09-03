module com.example.javacrud1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens com.example.javacrud1 to javafx.fxml;
    exports com.example.javacrud1;
}