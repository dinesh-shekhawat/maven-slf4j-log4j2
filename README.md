# Maven Java Project with Mojo ExecJava Plugin

## Introduction
This project is a simple Maven Java project configured to run using the Mojo ExecJava Plugin. It provides a convenient setup for executing Java applications using Maven along with log4j2 integration with slf4j API.

## Prerequisites
Before you begin, ensure you have met the following requirements:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed on your machine.
- [Apache Maven](https://maven.apache.org/download.cgi) installed on your machine.

## Clone
1. To clone the repository, use the following command:
    ```bash
   git clone git@github.com:dinesh-shekhawat/maven-slf4j-log4j2.git

2. Navigate to the project directory:

   ```bash
   cd maven-slf4j-log4j2

3. Install the project dependencies:
    ```bash
    mvn clean compile install

4. Run the application:
    ```bash
    mvn clean compile exec:java

## Externalizing Log4j Configuration File
If you want to externalize the Log4j configuration file, you can pass it as a runtime argument using the `-Dlog4j.configurationFile` option. 

For example:
```bash
mvn clean compile exec:java -Dlog4j.configurationFile=logger-config-files/log4j2.xml

## Acknowledgments

- [Apache Maven](https://maven.apache.org/) for providing a powerful build automation tool for Java projects.
- [Java](https://www.java.com/) for its robustness and versatility in building scalable and reliable applications.
- [SLF4J](http://www.slf4j.org/) for providing a simple logging facade for various logging frameworks in Java.
- [Mojo ExecJava Plugin](https://www.mojohaus.org/exec-maven-plugin/) for enabling the execution of Java applications within the Maven build lifecycle.
