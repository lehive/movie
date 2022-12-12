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

----
### Docker
 - build
   - docker build -f Dockerfile -t my-movie-app .
 - run
   - docker run -p 9010:8080 -it --rm my-movie-app
 - H2 Console
   - Sorry, remote connections ('webAllowOthers') are disabled on this server.