import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;
import java.awt.*;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/DashBoard.fxml"))));
        stage.show();
    }

}