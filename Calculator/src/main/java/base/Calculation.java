package base;

import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.math.BigDecimal;

/**
 * This class is used to create the calculator scene. It contains methods to generate the solution
 * and create the calculator scene.
 *
 * @see javafx.beans.property.SimpleStringProperty
 * @see javafx.beans.property.StringProperty
 * @see javafx.geometry.Insets
 * @see javafx.geometry.Pos
 * @see javafx.scene.Scene
 * @see javafx.scene.control.Button
 * @see javafx.scene.control.Label
 * @see javafx.scene.layout.HBox
 * @see javafx.scene.layout.VBox
 * @see javafx.application.Platform
 * @see java.math.BigDecimal
 *
 * @version 1.0
 * @since 1.0
 */
public class Calculation {

    /**
     * This method generates the solution for the given expression. It splits the expression into
     * elements and performs the operation based on the operator. It then sets the result to the
     * display.
     *
     * @return Scene The scene for the calculator.
     */
    public static Scene createCalcScene() {
        StringProperty displayContent = new SimpleStringProperty("");
        Label display = new Label();
        display.textProperty().bind(displayContent);

        VBox vbox = new VBox();

        HBox zero = new HBox(display);
        zero.setAlignment(Pos.CENTER);

        HBox first = new HBox();
        VBox.setMargin(first, new Insets(10.0d));
        Button b1 = new Button("1");
        b1.setOnAction(actionEvent -> {displayContent.set(displayContent.get() + "1");});
        Button b2 = new Button("2");
        b2.setOnAction(actionEvent -> {displayContent.set(displayContent.get() + "2");});
        Button b3 = new Button("3");
        b3.setOnAction(actionEvent -> {displayContent.set(displayContent.get() + "3");});
        Button bPlus = new Button("+");
        bPlus.setOnAction(actionEvent -> {displayContent.set(displayContent.get() + " + ");});
        Button bMinus = new Button("-");
        bMinus.setOnAction(actionEvent -> {displayContent.set(displayContent.get() + " - ");});
        first.getChildren().addAll(b1, b2, b3, bPlus, bMinus);

        HBox second = new HBox();
        VBox.setMargin(second, new Insets(10.0d));
        Button b4 = new Button("4");
        b4.setOnAction(actionEvent -> {displayContent.set(displayContent.get() + "4");});
        Button b5 = new Button("5");
        b5.setOnAction(actionEvent -> {displayContent.set(displayContent.get() + "5");});
        Button b6 = new Button("6");
        b6.setOnAction(actionEvent -> {displayContent.set(displayContent.get() + "6");});
        Button bProduct = new Button("×");
        bProduct.setOnAction(actionEvent -> {displayContent.set(displayContent.get() + " × ");});
        Button bQuotient = new Button("÷");
        bQuotient.setOnAction(actionEvent -> {displayContent.set(displayContent.get() + " ÷ ");});
        second.getChildren().addAll(b4, b5, b6, bProduct, bQuotient);

        HBox third = new HBox();
        VBox.setMargin(third, new Insets(10.0d));
        Button b7 = new Button("7");
        b7.setOnAction(actionEvent -> {displayContent.set(displayContent.get() + "7");});
        Button b8 = new Button("8");
        b8.setOnAction(actionEvent -> {displayContent.set(displayContent.get() + "8");});
        Button b9 = new Button("9");
        b9.setOnAction(actionEvent -> {displayContent.set(displayContent.get() + "9");});
        Button b0 = new Button("0");
        b0.setOnAction(actionEvent -> {displayContent.set(displayContent.get() + "0");});
        Button bDecimal = new Button(".");
        bDecimal.setOnAction(actionEvent -> {displayContent.set(displayContent.get() + ".");});
        third.getChildren().addAll(b7, b8, b9, b0, bDecimal);

        Button bEquals = new Button("=");
        bEquals.setOnAction(actionEvent -> {generateSol(displayContent);});

        Button bClear = new Button("Clear");
        bClear.setOnAction(actionEvent -> {displayContent.set("");});

        Button bBack = new Button("Back");
        bBack.setOnAction(actionEvent -> {displayContent.set(displayContent.get().
                substring(0, displayContent.get().length() - 1));});

        Button bExit = new Button("Exit");
        bExit.setOnAction(actionEvent -> {Platform.exit();});

        HBox fourth = new HBox();
        fourth.getChildren().addAll(bEquals, bClear, bBack, bExit);
        VBox.setMargin(fourth, new Insets(10.0d));

        vbox.getChildren().addAll(zero, first, second, third, fourth);

        Scene scene = new Scene(vbox);
        return scene;
    }

    /**
     * This method generates the solution for the given expression. It splits the expression into
     * elements and performs the operation based on the operator. It then sets the result to the
     * display.
     *
     * @param displayContent The display content to generate the solution for.
     *                       It contains the expression to evaluate.
     *                       The result is set to the display.
     *                       If an error occurs, an error message is set to the display.
     *                       The display content is updated with the result or error message.
     *
     */
    public static void generateSol(StringProperty displayContent) {
        boolean error = false;
        String[] elements = displayContent.get().split(" ");
        char op = '0';
        double result = 0;
        for (String str : elements) {
            if (!str.equals("+") && !str.equals("-") && !str.equals("×") && !str.equals("÷")) {
                if (op == '0' || op == '+') {
                    try {
                        result += Double.parseDouble(str);
                    } catch (Exception e) {
                        error = true;
                        break;
                    }
                } else if (op == '-') {
                    try {
                        result -= Double.parseDouble(str);
                    } catch (Exception e) {
                        error = true;
                        break;
                    }
                } else if (op == '×') {
                    try {
                        result *= Double.parseDouble(str);
                    } catch (Exception e) {
                        error = true;
                        break;
                    }
                } else if (op == '÷') {
                    try {
                        result /= Double.parseDouble(str);
                    } catch (Exception e) {
                        error = true;
                        break;
                    }
                }
            } else {
                op = switch (str) {
                    case "+" -> '+';
                    case "-" -> '-';
                    case "×" -> '×';
                    case "÷" -> '÷';
                    default -> op;
                };
            }
        }
        if (error) {
            displayContent.set("Error! Please clear and try again!");
        } else {
            displayContent.set(String.valueOf(result));
        }
    }
}
