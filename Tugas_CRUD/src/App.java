import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(App.class.getResource("Mhs.fxml"));
        Scene scene = new Scene(loader.load(), 1000, 500);
        stage.setScene(scene);
        stage.setTitle("Data Mahasiswa");
        stage.show();  
    }
    public static void main(String[] args){
        launch();
    }
}
