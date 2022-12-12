FROM maven:3.8.5-openjdk-17-slim
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src src
#VOLUME can only be used while running the container (not in build section)
RUN mvn package
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "target/movie-0.0.1-SNAPSHOT.jar"]