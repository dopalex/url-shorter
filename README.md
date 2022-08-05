# Library Application

## Descriptions
This simple web application mimics the operation of an online link shortening service.

## Project structure
Project is built on a three-tier architecture:

1. Presentation layer (controllers);
2. Application layer (service);
3. Data access layer (DAO);

## Technologies stack

- Java 11
- REST
- Spring Boot
- Spring WEB
- Spring Security
- Apache Maven
- H2 Database (In-memory database)



## How to run project
1. Clone this project
2. Run project.

## How to use
1. Log in to get started
- username: Bob
- password: 12345
- request like:
```
{"urlFull":"YOUR_URL"}
```
You will get short url.
```
{"urlShort": "YOUR_SHORT_URL" }
```
2. Use Postman
