# [Servlet & JSP Part 2](https://brianjleeofcl-jsp-contacts.herokuapp.com/users)

September 28, 2017

This application is an ongoing series of practice applications for Java based web applications.
The purpose of this application is to combine JSP and servlets with persistence on the server.
The end goal is to familiarize with the technologies that frameworks such as Spring and Spring MVC is based on.

## Development
run `bash init.sh` to start the development server. 
Application is available at `localhost:5000/users/`

## Dependencies

- Java 8
- PostgreSQL

- Gradle
- ~~Gretty~~ removed for deployment purposes, uses [webapp runner](https://github.com/jsimone/webapp-runner) & Tomcat 8.5 on production 

- JPA: Hibernate 5.2
- JSTL 1.2

- Unit Testing: JUnit

## TODO
- CRUD: implement update and delete.