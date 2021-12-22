# SoccerTeam-App
Web app to organize soccer teams and their players using Spring Boot, Spring Data JPA, Hibernate, and MySql

## Technology Requirements
In order to run this app you must have the following technologies installed

- MySql ver(8.0.26)

<hr>

## Getting Started

### Cloning
You can clone this repository by using the following command:

``$ git clone https://github.com/davidbryan15/soccerteam-app.git``

### Updating DataSource properties
Prior to running this app you will need to ensure you use the sql file within the ``Sql`` folder and run the script in your MySql database

The script will allow your database to follow the same datasource properties listed within the app. 


### Running the App
You can then make your way into the root of this directory and run the app by using:

For Mac - ``$ ./mvnw spring-boot:run``

For Windows - ``mvnw spring-boot:run``

**Note**: If you receive a JAVA_HOME error please ensure your environment variable are set properly. Maven Wrapper looks for a JAVA_HOME variable within your System PATH to know what correct JDK to use when compiling this application.


<hr>

