# spring-boot
Simple application using spring boot, hibernate and postgreSQL as a database

create database "postgres" to run the application and create a file in target/classes/com/br/springboot/application.properties and set this parameters

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

spring.datasource.username=postgres

spring.datasource.password="password_database"

spring.datasource.url=jdbc:postgresql://localhost:5432/postgres

spring.jpa.hibernate.ddl-auto=update

spring.jpa.hibernate.show-sql=true
