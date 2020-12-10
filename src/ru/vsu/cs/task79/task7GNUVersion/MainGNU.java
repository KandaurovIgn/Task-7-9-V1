package task7GNUVersion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainGNU extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ModelData modelData = new ModelData();
        Listener listener = new Listener(modelData);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Frame.fxml"));
        loader.setController(listener);
        Parent root = loader.load();
        primaryStage.setTitle("Task 7 №10");
        primaryStage.setScene(new Scene(root, 623, 449));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
