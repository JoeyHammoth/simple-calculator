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
    private Parent createContent() {
        Rectangle box = new Rectangle(100, 50, Color.RED);
        Button button = new Button("Press Me!", box);
        button.setOnAction(actionEvent -> System.out.println("Hello"));
        transform(button);
        return new Pane(button);
    }

    private void transform(Button box) {
        box.setTranslateX(100);
        box.setTranslateY(100);
    }

    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(createContent(), 300, 300));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}