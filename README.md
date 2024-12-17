# Simple Calculator with JavaFX

This project is a simple calculator application built using JavaFX. It demonstrates how to build a graphical user interface (GUI) for a basic calculator with operations like addition, subtraction, multiplication, and division. Additionally, this calculator utilizes a custom package called `custom-java-math-library` for advanced mathematical operations that can be found [here](https://github.com/JoeyHammoth/custom-java-math-library).

## Features

- Basic arithmetic operations: addition, subtraction, multiplication, and division.
- Supports advanced operations through the `custom-java-math-library` package.
- Clean and responsive GUI using JavaFX.
- Exception handling for invalid input.

## Requirements

- Java 11 or later
- JavaFX SDK
- `custom-java-math-library` package

## Installation

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/yourusername/simple-calculator-javafx.git
   ```

2. Navigate into the project directory:
   ```bash
   cd simple-calculator-javafx
   ```

3. If you don't already have the `custom-java-math-library`, download or clone it:
   ```bash
   git clone https://github.com/yourusername/custom-java-math-library.git
   ```

4. Add the `custom-java-math-library` to your project:
   - In your IDE, add the `custom-java-math-library` as a dependency or include it in your project structure.

## Usage

1. Compile the project:
   ```bash
   javac -d bin src/com/calculator/*.java src/com/custommath/*.java
   ```

2. Run the application:
   ```bash
   java -cp "bin;path/to/javafx-sdk/lib/*" com.calculator.CalculatorApp
   ```

3. You can now use the calculator to perform basic and advanced mathematical operations. The advanced operations are handled by methods from the `custom-java-math-library`.

## Project Structure

```
simple-calculator-javafx/
├── src/
│   ├── com/
│   │   ├── calculator/
│   │   │   ├── CalculatorApp.java       # Main JavaFX Application
│   │   │   ├── CalculatorController.java # Controller for Calculator UI
│   │   └── custommath/
│   │       ├── AdvancedMath.java        # Custom Math Library for advanced operations
├── lib/
│   ├── javafx-sdk/                      # JavaFX SDK
├── README.md
└── pom.xml                              # If using Maven
```

## How It Works

- The `CalculatorApp.java` class is the main entry point of the JavaFX application, which loads the user interface.
- The `CalculatorController.java` handles the event-driven actions for calculator operations.
- The `AdvancedMath.java` class from the `custom-java-math-library` provides methods for advanced mathematical operations, such as calculating square roots, trigonometric functions, and other complex math functionalities.

## Example of Advanced Operations

In addition to basic arithmetic, you can use advanced operations like square roots or power calculations using the custom math library.

Example usage in `CalculatorController.java`:
```java
import com.custommath.AdvancedMath;

public class CalculatorController {
    public void handleSquareRoot() {
        double result = AdvancedMath.sqrt(16);  // Returns 4.0
        displayResult(result);
    }

    public void handlePower() {
        double result = AdvancedMath.pow(2, 3); // Returns 8.0
        displayResult(result);
    }
}
```

## Contributing

1. Fork this repository.
2. Create a feature branch (`git checkout -b feature-name`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-name`).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
