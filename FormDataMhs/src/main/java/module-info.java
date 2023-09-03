module com.example.formdatamhs {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.formdatamhs to javafx.fxml;
    exports com.example.formdatamhs;
}