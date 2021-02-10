#Spring Boot Application/Cubereum

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java™ Platform, Standard Edition Development Kit 
* [Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
* [MySQL](https://www.mysql.com/) - Open-Source Relational Database Management System


## External Tools Used

* [Postman](https://www.getpostman.com/) - API Development Environment (Testing Docmentation)

## To-Do

- [x] RESTful Web Service (CRUD)
- [x] MSYSQL (RDBMS)
- [x] JUnit Test

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.Cubereum.CubereumApplication` class from your IDE.

- Download the zip.
- Unzip the zip file (if you downloaded one)
- Open Command Prompt and Change directory (cd) to folder containing pom.xml
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right Click on the file and Run as Java Application

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
### JUnit Test
```
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
			<exclusions>
				<exclusion>
					<groupId>org.junit.vintage</groupId>
					<artifactId>junit-vintage-engine</artifactId>
				</exclusion>
			</exclusions>
		</dependency>
```

Automated dependency updates done via [Dependabot](https://dependabot.com/)

### Actuator

To monitor and manage your application

|  URL |  Method |
|----------|--------------|
|`http://localhost:8080/api/createAndUpdaetUser`  | POST |
|`http://localhost:8080/api/allUser`    | GET |
|`http://localhost:8080/userById`      | GET |
|`http://localhost:8080/deleteById`| DELETE |
|`http://localhost:8080/userBymobileNumber` | GET |
|`http://localhost:8080/userByuserName` | GET |

### URLs

|  URL |  Method | Remarks |
|----------|--------------|--------------|
|`http://localhost:8080/api/createAndUpdaetUser`  | POST ||
|`http://localhost:8080/api/allUser`    | GET ||
|`http://localhost:8080/userById`      | GET ||
|`http://localhost:8080/deleteById`| DELETE ||
|`http://localhost:8080/userBymobileNumber` | GET ||
|`http://localhost:8080/userByuserName` | GET ||

## Documentation

* [Postman Collection](https://documenter.getpostman.com/view/2449187/RWTiwzb2) - online, with code auto-generated snippets in cURL, jQuery, Ruby,Python Requests, Node, PHP and Go programming languages
* [Postman Collection](https://github.com/AnanthaRajuC/Spring-Boot-Application-Template/blob/master/Spring%20Boot%20Template.postman_collection.json) - offline


## Files and Directories

The project (a.k.a. project directory) has a particular directory structure. A representative project is shown below:

```
.
├── Spring Elements
├── src
│   └── main
│       └── java
│           ├── com.Cubereum
│           ├── com.Cubereum.Controller
│           ├── com.Cubereum.Models
│           ├── com.Cubereum.Repositary
│           ├── com.Cubereum.Service
│           └── com.Cubereum.ServiceImp
├── src
│   └── main
│       └── resources
│           └── static
│           ├── templates
│           ├── application.properties

├── src
│   └── test
│       └── java
├── JRE System Library
├── Maven Dependencies
├── bin
├── logs
│   └── application.log
├── src
├── target
│   └──application-0.0.1-SNAPSHOT
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## packages

- `models` — to hold our entities;
- `repositories` — to communicate with the database;
- `services` — to hold our business logic;
- `controllers` — to listen to the client;

- `resources/` - Contains all the static resources, templates and property files.
- `resources/static` - contains static resources such as css, js and images.
- `resources/templates` - contains server-side templates which are rendered by Spring.
- `resources/application.properties` - It contains application-wide properties. Spring reads the properties defined in this file to configure your application. You can define server’s default port, server’s context path, database URLs etc, in this file.

- `test/` - contains unit and integration tests

- `pom.xml` - contains all the project dependencies
 
## Resources

* [My API Lifecycle Checklist and Scorecard](https://dzone.com/articles/my-api-lifecycle-checklist-and-scorecard)
* [HTTP Status Codes](https://www.restapitutorial.com/httpstatuscodes.html)
* [Common application properties](https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html)
