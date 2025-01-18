package base;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Entry point of the application. This class is used to start the JavaFX application.
 * It creates a new scene and sets the stylesheet for the scene.
 * The scene is then displayed on the stage.
 *
 * @see Calculation
 * @see javafx.application.Application
 * @see javafx.scene.Scene
 * @see javafx.stage.Stage
 * @see javafx.stage.Stage#setScene(javafx.scene.Scene)
 * @see javafx.stage.Stage#setWidth(double)
 * @see javafx.stage.Stage#setHeight(double)
 * @see javafx.stage.Stage#show()
 * @see javafx.scene.Scene#getStylesheets()
 *
 * @version 1.0
 * @since 1.0
 */
public class Entry extends Application {

    /**
     * Starts the JavaFX application. Creates a new scene and sets the stylesheet for the scene.
     *
     * @param stage The stage to display the scene on.
     * @throws Exception If an error occurs while starting the application.
     */
    public void start(Stage stage) throws Exception {
        Scene scene = Calculation.createCalcScene();
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene);
        stage.setWidth(800);
        stage.setHeight(400);
        stage.show();
    }

    /**
     * Main method to start the application. 
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        launch(args);
    }
}