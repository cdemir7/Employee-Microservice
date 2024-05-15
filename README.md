# Employee Management System

## Database Table

![alt text](https://github.com/cdemir7/Employee-Microservice/blob/main/images/db1.png)

![alt text](https://github.com/cdemir7/Employee-Microservice/blob/main/images/db2.png)

---

## Technologies
* Java 22
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL
* Lombok
* Swagger
* Validation

---

## Project Structure
The project includes the following components:
* ENTITY
* REPOSITORY
* DTO / REQUEST-RESPONSE
* MAPPER
* SERVICE
* CONTROLLER

---

## Running the Application
Since the project is developed with Spring Boot, you can follow the steps below to run the application:
1. Clone the source code of the project to your computer.
2. Create your MySQL database and update the connection information in the application.properties file.
3. Open the project in an IDE (IntelliJ IDEA, Eclipse, etc.).
4. Find the EmployeeMicroserviceApplication class and run it.

Once the application is started, you can access the API at http://localhost:8080/swagger-ui/index.html#/

---
## Endpoints
Below is a list of basic endpoints provided by the API:

| Endpoint | HTTP Method | Description |
| -------- | ----------- | ----------- |
| `/api/employees/{id}` | GET    | Bring the employee who matches the specified identity |
| `/api/employees/{id}` | PUT    | Update the employee that matches the specified ID     |
| `/api/employees/{id}` | DELETE | Delete the employee matching the specified ID         |
| `/api/employees`      | GET    | List all employees                                    |
| `/api/employees`      | POST   | Add new employee                                      |

