module com.example.datamhs {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.datamhs to javafx.fxml;
    exports com.example.datamhs;
}