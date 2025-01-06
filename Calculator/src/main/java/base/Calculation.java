package base;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Calculation {
    public static Scene createCalcScene() {
        double result = 0;

        StringProperty displayContent = new SimpleStringProperty("");
        Label display = new Label();
        display.textProperty().bind(displayContent);

        VBox vbox = new VBox();

        HBox zero = new HBox(display);
        zero.setAlignment(Pos.CENTER);

        HBox first = new HBox();
        VBox.setMargin(first, new Insets(10.0d));
        Button b1 = new Button("1");
        b1.setOnAction(actionEvent -> {displayContent.set(displayContent.toString() + "1");});
        Button b2 = new Button("2");
        b2.setOnAction(actionEvent -> {displayContent.set(displayContent.toString() + "2");});
        Button b3 = new Button("3");
        b3.setOnAction(actionEvent -> {displayContent.set(displayContent.toString() + "3");});
        Button bPlus = new Button("+");
        bPlus.setOnAction(actionEvent -> {displayContent.set(displayContent.toString() + "+");});
        Button bMinus = new Button("-");
        bMinus.setOnAction(actionEvent -> {displayContent.set(displayContent.toString() + "-");});
        first.getChildren().addAll(b1, b2, b3, bPlus, bMinus);

        HBox second = new HBox();
        VBox.setMargin(second, new Insets(10.0d));
        Button b4 = new Button("4");
        b4.setOnAction(actionEvent -> {displayContent.set(displayContent.toString() + "4");});
        Button b5 = new Button("5");
        b5.setOnAction(actionEvent -> {displayContent.set(displayContent.toString() + "5");});
        Button b6 = new Button("6");
        b6.setOnAction(actionEvent -> {displayContent.set(displayContent.toString() + "6");});
        Button bProduct = new Button("×");
        bProduct.setOnAction(actionEvent -> {displayContent.set(displayContent.toString() + "×");});
        Button bQuotient = new Button("÷");
        bQuotient.setOnAction(actionEvent -> {displayContent.set(displayContent.toString() + "÷");});
        second.getChildren().addAll(b4, b5, b6, bProduct, bQuotient);

        HBox third = new HBox();
        VBox.setMargin(second, new Insets(10.0d));
        Button b7 = new Button("7");
        b7.setOnAction(actionEvent -> {displayContent.set(displayContent.toString() + "7");});
        Button b8 = new Button("8");
        b8.setOnAction(actionEvent -> {displayContent.set(displayContent.toString() + "8");});
        Button b9 = new Button("9");
        b9.setOnAction(actionEvent -> {displayContent.set(displayContent.toString() + "9");});
        Button b0 = new Button("0");
        b0.setOnAction(actionEvent -> {displayContent.set(displayContent.toString() + "0");});
        Button bDecimal = new Button(".");
        bDecimal.setOnAction(actionEvent -> {displayContent.set(displayContent.toString() + ".");});
        third.getChildren().addAll(b7, b8, b9, b0, bDecimal);

        Button bEquals = new Button("=");
        HBox fourth = new HBox(bEquals);
        fourth.setAlignment(Pos.CENTER);

        vbox.getChildren().addAll(zero, first, second, third, fourth);

        Scene scene = new Scene(vbox);
        return scene;
    }
}
