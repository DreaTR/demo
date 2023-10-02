# Project name

Web Service

## Description

Provide a short description explaining the what, why, and how of your project. Use the following questions
as a guide:

- What was your motivation?
To have the opportunity to set up and configure an Apache Kafka cluster as well as manage the data flow 
from one web API to a Java Maven application and a MySQL database.

- Why did you build this project? (Note: the answer is not "Because it was a homework assignment.")
To bring together all the knowledge we have learned during the course and show that we can create an
application that uses tests, Apache Kafka-luster, web API and database to ensure that the application 
works as it should. 
The program must handle a Maven Java application where the user can enter data into a form (GUI or 
console). This data is sent in JSON format to a localhost Web API. A Kafka Cluster that uses a producer 
to listen to Web API and retrieve incoming data. The data must be saved in a Topic. Via two Consumers, 
the data must be sent back to Java the application as confirmation and also saved in a local MySQL 
database.

- What problem does it solve? 
Apache Kafka is a distributed streaming platform used for to manage and process large amounts of data in
real time. It is often used to build scalable and reliable data flows between different applications and 
systems.

- What did you learn?
Writing robust tests for individual classes in a larger application and set up and configure an Apache 
Kafka cluster and manage the data flow from a web API to a Java Maven application and MySQL database.
- 
## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [Credits](#credits)
- [License](#license)

## Installation
- Operating system: Windows, Mac, Linux
- JDK 20 (Java Development Kit)
- Intellij IDEA Community Edition 2023.2
- Git
- Github
- Apache Kafka 3.5.1 
- Postman (windows 64-bit)
- MySQL Installer 8.0.34 (Workbench)

[Dependencys]
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-data-jpa</artifactId>
<version>3.1.3</version>

<groupId>com.mysql</groupId>
<artifactId>mysql-connector-j</artifactId>
<version>8.0.33</version>

<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter-api</artifactId>
<version>5.10.0</version>

<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter-api</artifactId>
<version>5.9.3</version>
<scope>test</scope>

## Usage

[Command prompt]
Type cmd in the search field an open two terminals.

[Connect to Kafka server]
Start the zookeeper service (terminal 1)
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Start the Kafka-broker service (terminal 2)
.\bin\windows\kafka-server-start.bat .\config\server.properties

[Database]
1: Start MySQL Workbench
2: Connect to MySQL Server by entering password

[Application]
Run application in Intellij

[Postman, to connect to a API Network]
1: Open postman
2: Select API Network
3: Select Post and write HTTP url http://localhost:8080/api/v1/kafka/publish
4: Select Body -> raw -> JSON format. Type message and send
Go back to Intellij's console and a message will be seen there 

These steps are just for one module project (demo)

## To run the complete project with two modules (demo & newdemorootprod)

[Connect to Kafka server]

[Application]
1: Run DemoApplication in Demo package in background and run Main class in NewDemoRootProd package
2: Stop the Main class, then DemoApplication

[Terminate Kafka]
1: Stop the producer and consumer clients with Ctrl-C (only for running module project demo) 
2: Stop the Kafka broker server with Ctrl-C 
3: Lastly, stop the ZooKeeper server with Ctrl-C and choice Y/N for alternative

Clone the project
```bash 
https://github.com/DreaTR/demo.git
https://github.com/DreaTR/DemoNewRootProd.git
```

Go to the project directory
```bash 
https://github.com/DreaTR/demo
https://github.com/DreaTR/DemoNewRootProd
```

## Credits

* [junit jupiter 5](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter/5.7.0)

## License

## Badges

![badmath](https://img.shields.io/github/languages/top/lernantino/badmath)


## Features


## How to Contribute


## Tests
The project also includes two test cases to verify proper functionality of the database and Kafka Server 
class. The tests are contained in the DatabaseTest (Demo package ) and KafkaTest (DemoNewRootProd package).
The test classes use the JUnit 5 framework. To run the tests, JUnit 5 must be properly configured in the 
project and then run the test methods in the DatabaseTest and KafkaTest class.




