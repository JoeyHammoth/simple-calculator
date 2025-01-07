# Simple Calculator with JavaFX

This project is a simple calculator application built using JavaFX. It demonstrates how to build a graphical user interface (GUI) for a basic calculator with the following operations: addition, subtraction, multiplication, and division. 

## Features

- Basic arithmetic operations: addition, subtraction, multiplication, and division.
- Clean and responsive GUI using JavaFX.
- Exception handling for invalid input.

## Installation

1. Go to the latest release [here](https://github.com/JoeyHammoth/simple-calculator/releases/tag/v1.0).

### Installation (JAR):
2. Download the JAR file from the release section.
3. Make sure you have Java installed on your system (Java 8 or above).
4. Run JAR using the following command:
```
java -jar <JAR PATH>
```

### Installation (Mac):
2. Download the calculator zip file in the release section.
3. Unzip and run the executable.

## Project Structure
### UML Diagram
![UML DIAGRAM](diagram.png)
### Project Tree

```
.
├── dependency-reduced-pom.xml
├── out
│   └── artifacts
│       └── Calculator_jar
│           └── Calculator.jar
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── base
│   │   │       ├── Calculation.java
│   │   │       ├── Entry.java
│   │   │       └── Main.java
│   │   └── resources
│   │       ├── META-INF
│   │       │   └── MANIFEST.MF
│   │       └── style.css
│   └── test
│       └── java
└── target
    ├── Calculator-1.0-SNAPSHOT.jar
    ├── classes
    │   ├── META-INF
    │   │   └── MANIFEST.MF
    │   ├── base
    │   │   ├── Calculation.class
    │   │   ├── Entry.class
    │   │   └── Main.class
    │   └── style.css
    ├── generated-sources
    │   └── annotations
    ├── generated-test-sources
    │   └── test-annotations
    ├── maven-archiver
    │   └── pom.properties
    ├── maven-status
    │   └── maven-compiler-plugin
    │       ├── compile
    │       │   └── default-compile
    │       │       ├── createdFiles.lst
    │       │       └── inputFiles.lst
    │       └── testCompile
    │           └── default-testCompile
    │               ├── createdFiles.lst
    │               └── inputFiles.lst
    ├── original-Calculator-1.0-SNAPSHOT.jar
    └── test-classes
```
## How It Works
The three classes for this project are Main, Entry and Calculation. Calculation handles the entire UI and logic, Entry handles JavaFX scene setup and launch and Main acts as the main entrypoint used to package the project into a JAR executable using Maven.

## Contributing

1. Fork this repository.
2. Create a feature branch (`git checkout -b feature-name`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-name`).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
