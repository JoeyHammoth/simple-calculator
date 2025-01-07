package base;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Entry extends Application {
    public void start(Stage stage) throws Exception {
        Scene scene = Calculation.createCalcScene();
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene);
        stage.setWidth(800);
        stage.setHeight(400);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}