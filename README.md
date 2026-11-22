# Book Data JPA Project

## Project Overview

The **Book Data JPA Project** is a Spring Boot application developed to manage library book records using Spring Data JPA and Oracle Database.

This project demonstrates CRUD operations and derived query methods provided by Spring Data JPA without writing custom SQL queries.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- Oracle Database
- Maven

## Project Structure

```text
BookDataJpaProject
│
├── src/main/java/com/nit
│   ├── BookDataJpaProjectApplication.java
│   │
│   ├── entity
│   │   └── Book.java
│   │
│   ├── repository
│   │   └── BookRepository.java
│   │
│   └── service
│       └── BookService.java
│
├── src/main/resources
│   └── application.yaml
│
├── src/test
├── pom.xml
└── README.md
```

## Book Entity

The Book entity contains the following fields:

- id
- name
- author
- category
- price
- available

## Features

### 1. CRUD Operations

- Insert a single book.
- Insert multiple books.
- Find a book by ID.
- Display all books.
- Update book details.
- Delete a book by ID.
- Delete all books.
- Check whether a book exists.
- Count total books.

### 2. Derived Query Methods

The project demonstrates the following Spring Data JPA methods:

- `findByName()`
- `findByAuthor()`
- `findByCategory()`
- `findByPrice()`
- `findByAvailable()`
- `findByAuthorAndCategory()`
- `findByCategoryAndAvailable()`
- `findByPriceGreaterThan()`
- `findByPriceLessThan()`
- `findByPriceBetween()`
- `findByNameStartingWith()`
- `findByNameContaining()`
- `findByAuthorOrderByPriceAsc()`
- `findAllByOrderByPriceDesc()`

## Database Configuration

This project uses Oracle Database.

Update your `application.yaml` file with your database configuration:

```yaml
spring:
  datasource:
    url: jdbc:oracle:thin:@localhost:1521:free
    driver-class-name: oracle.jdbc.OracleDriver
    username: system
    password: ${DB_PASSWORD}

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        format_sql: true
```

Set the `DB_PASSWORD` environment variable with your Oracle database password before running the application.

## How to Run the Project

1. Clone the repository:

```bash
git clone https://github.com/S-ashi/BookDataJpaProject.git
```

2. Open the project in Eclipse or VS Code.

3. Configure your Oracle database credentials.

4. Build the project:

```bash
mvn clean install
```

5. Run the Spring Boot application:

```bash
mvn spring-boot:run
```

## Learning Outcomes

- Understanding Spring Boot project structure.
- Working with Spring Data JPA repositories.
- Performing database CRUD operations.
- Understanding derived query methods.
- Connecting Spring Boot with Oracle Database.
- Using Maven for project management.

## Author

**Sashikanta Dash**

GitHub: https://github.com/S-ashi
