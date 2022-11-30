This application is related to movie db. With the current solution it is possible to:
 - search movie by id
 - list all movies
 - add a movie

Postman request collection can be found at root of this application:
 - Movie_database_app.postman_collection.json

---
- H2 Database - General
  - This application were initialized with H2 in-memory database. H2 should be replaced in future with example PostgreSQL (for the production readiness).
  - [H2 Database Features](http://www.h2database.com/html/features.html)


- H2 Database GUI - localhost
  - GUI can be accessed while the application is running
  - url: http://localhost:8080/h2
  - JDBC URL: jdbc:h2:mem:movie
  - User Name: sa
  - Password: \<empty\>
----