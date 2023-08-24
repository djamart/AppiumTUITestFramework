# Appium 2 Automation Framework

This repository contains an Appium automation framework for testing mobile applications on Android devices. This README provides an overview of the framework, its prerequisites, dependencies, and instructions on how to run tests.

## Prerequisites

Before you can run the automation framework, make sure you have the following prerequisites installed on your system:

1. **Node.js and NPM**: You need Node.js and NPM installed. You can download and install them from [nodejs.org](https://nodejs.org/).

2. **Java 8**: Install Java version 8 on your system. You can download it from the [Oracle website](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) or use OpenJDK.

3. **Appium (Version 2)**: Install Appium version 2 globally using NPM.

`npm install -g appium`

4. **Appium Server**: Start the Appium server.

`appium`

5. **Android SDK**: You should have the Android SDK installed and configured.

6. **Appium Inspector (Optional)**: For inspecting app elements.

## Maven Dependencies

This framework uses the following Maven dependencies::

- **Appium Java Client (version 8.5.0)**: Appium's Java client library for interacting with Android apps.
- **TestNG (v6.14.3)**: Testing framework for Java.
- **Cucumber Java (v7.13.0)**: Cucumber for Java, a tool for writing human-readable test scenarios.
- **Cucumber TestNG (v7.13.0):** TestNG integration for Cucumber.
- **Cucumber Picocontainer (v7.13.0)**: Dependency injection for Cucumber.
- **Selenium Java (v4.11.0):** Selenium WebDriver bindings for Java.

## Instalation

1. Clone this repository to your local machine:

`git clone https://github.com/djamart/AppiumTUITestFramework.git`

2. Navigate to the project directory:

`cd AppiumTUITestFramework`

3. Make sure mvn is correctly installed:

```
C:\>mvn -v
Apache Maven 3.9.4 (dfbb324ad4a7c8fb0bf182e6d91b0ae20e3d2dd9)
Maven home: C:\apache-maven-3.9.4
Java version: 1.8.0_382, vendor: Temurin, runtime: C:\java8\jre
```
4. Install the Maven dependencies using the following command:

`mvn clean install`

## Configuration

1. Open the `global.properties` file in the `.\src\test\resources` directory.
2. Update the configuration settings according to your target application, devices, and test environment.
3. Make sure you have your device or emulator connected to the computer and is list when running the command:

`adb devices`

## Running Tests

You can run the tests using the following command:

`mvn test`

This command will execute the tests using Mocha and display the results in the terminal.

## Test Reports

Test reports will be generated in the `.\target\reports` directory after each test run.







