package plantenApp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/PlantToevoegen.fxml"));
        primaryStage.setTitle("Planten applicatie");
        primaryStage.setScene(new Scene(root, 1278, 858));
        primaryStage.show();
        primaryStage.setMaximized(true);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
