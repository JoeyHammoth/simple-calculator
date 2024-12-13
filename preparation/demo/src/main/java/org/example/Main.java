package org.example;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    private Parent createContent() {
        Rectangle box = new Rectangle(100, 50, Color.BLUE);
        Button button = new Button("Press Me", box);

        button.setOnAction(actionEvent -> {
            System.out.println("hello");
        });

        transform(button);

        return new Pane(button);
    }

    private void transform(Node box) {
        // Move box by 100 pixels in x axis and y axis
        box.setTranslateX(100);
        box.setTranslateY(100);

        // Make a node larger or smaller via a ratio in x or y axis
        box.setScaleX(1.5);
        box.setScaleY(1.5);

        // Rotate based on a given angle (degrees) in the z axis
        box.setRotate(30);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(createContent(), 300, 300, Color.RED);
        // Load and apply CSS file
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}