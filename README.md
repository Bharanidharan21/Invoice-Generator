# Invoice Generator Backend Application

Invoice Generator is a **Java backend application** developed using **Spring Boot and MySQL**. The system is designed to manage users, clients, invoices, invoice items, and payments through secure REST APIs.

The application follows a **relational database design** based on an **Enhanced Entity-Relationship (EER) diagram** and implements **industry-standard backend development practices**.

Note: Frontend development is currently in progress. This repository contains backend functionality only.

---

## Project Description

This backend system enables authenticated users to:
- Manage client information
- Create, update, and track invoices
- Add multiple items to an invoice
- Record and manage payments
- Maintain invoice status and payment history

---

## Database Design

The application uses a normalized relational database schema with the following entities:

### User
- id
- username
- email
- password
- role
- active

### Client
- id
- name
- company_name
- email
- phone_number
- address

### Invoice
- id
- invoice_number
- issue_date
- due_date
- status
- discount
- tax_amount
- total_amount
- client_id (foreign key)

Relationship: One client can have multiple invoices.

### Invoice Item
- id
- description
- quantity
- unit_price
- total
- invoice_id (foreign key)

Relationship: One invoice can have multiple invoice items.

### Payment
- id
- amount
- method
- payment_date
- reference
- invoice_id (foreign key)

Relationship: One invoice can have multiple payments.

---

## Technology Stack

### Backend Technologies
- Java
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA (Hibernate)
- MySQL
- Maven

### Frontend
- Under development
- Will consume REST APIs provided by the backend

---

## Application Architecture
src/main/java
├── controller
├── service
├── repository
├── model
├── security
└── InvoiceGeneratorApplication.java


---

## Configuration

Database configuration is managed through `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/invoice_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8081
```
Ensure that MySQL is running and the database is created before starting the application.

## How to Run the Application
   Using an IDE

- Import the project into IntelliJ IDEA, Eclipse, or Spring Tool Suite.

- Run InvoiceGeneratorApplication.java.

## Current Status

Backend development is complete and APIs are functional.
Frontend development is in progress and will be integrated in future updates.

## Planned Enhancements

- Frontend user interface integration

- Swagger API documentation

- Role-based access control

- PDF invoice generation

- Cloud deployment

# Author

BharaniDharan

Java Backend Developer

Spring Boot | REST APIs | MySQL
