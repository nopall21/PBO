import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws FileNotFoundException {
        VBox root = new VBox();
        root.setAligment(Pos.CENTER);
        Button bOk = new Button("OK");
        Button bCancel = new Button("Cancel");
        FileInputStream inputStream = new FileInputStream("D:\\PBO\\Latihan1\\img\\foto.jpg");
        Image image = new Image(inputStream);
        ImageView im = new ImageView(image);
        im.setFitWidth(100);
        im.setFitHeigth(100);
        Label lb = new Label("Fakultas Ilmu Komputer");

    }
}