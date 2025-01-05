package org.example;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public void start(Stage stage) throws Exception {
        IntegerProperty num = new SimpleIntegerProperty(0);
        Label display = new Label();
        display.textProperty().bind(num.asString());

        VBox vbox = new VBox();

        HBox zero = new HBox(display);
        zero.setAlignment(Pos.CENTER);

        HBox first = new HBox();
        VBox.setMargin(first, new Insets(10.0d));
        Button b1 = new Button("1");
        b1.setOnAction(actionEvent -> {num.set(1);});
        Button b2 = new Button("2");
        b2.setOnAction(actionEvent -> {num.set(2);});
        Button b3 = new Button("3");
        b3.setOnAction(actionEvent -> {num.set(3);});
        first.getChildren().addAll(b1, b2, b3);

        HBox second = new HBox();
        VBox.setMargin(second, new Insets(10.0d));
        Button b4 = new Button("4");
        b4.setOnAction(actionEvent -> {num.set(4);});
        Button b5 = new Button("5");
        b5.setOnAction(actionEvent -> {num.set(5);});
        Button b6 = new Button("6");
        b6.setOnAction(actionEvent -> {num.set(6);});
        second.getChildren().addAll(b4, b5, b6);

        HBox third = new HBox();
        VBox.setMargin(third, new Insets(10.0d));
        Button b7 = new Button("7");
        b7.setOnAction(actionEvent -> {num.set(7);});
        Button b8 = new Button("8");
        b8.setOnAction(actionEvent -> {num.set(8);});
        Button b9 = new Button("9");
        b9.setOnAction(actionEvent -> {num.set(9);});
        third.getChildren().addAll(b7, b8, b9);

        vbox.getChildren().addAll(zero, first, second, third);

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
