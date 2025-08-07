#Generate Build
FROM maven:3-eclipse-temurin-22-alpine AS build
WORKDIR /app
COPY pom.xml ./
COPY src ./src
RUN mvn clean package -DskipTests


#Dockerize
FROM eclipse-temurin:22.0.2_9-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/bibliotheque-0.0.1-SNAPSHOT.jar ./bibliotheque-backend.jar
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "bibliotheque-backend.jar"]

