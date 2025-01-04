package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public void start(Stage stage) throws Exception {
        VBox vbox = new VBox();

        HBox first = new HBox();
        VBox.setMargin(first, new Insets(10.0d));
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        first.getChildren().addAll(b1, b2, b3);

        HBox second = new HBox();
        VBox.setMargin(second, new Insets(10.0d));
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        second.getChildren().addAll(b4, b5, b6);

        HBox third = new HBox();
        VBox.setMargin(third, new Insets(10.0d));
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        third.getChildren().addAll(b7, b8, b9);

        vbox.getChildren().addAll(first, second, third);

        Scene scene = new Scene(vbox);
        // Put CSS stuff in resources folder
        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());
        System.out.println(getClass().getResource("/styles.css"));
        stage.setScene(scene);
        stage.setWidth(800);
        stage.setHeight(600);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
