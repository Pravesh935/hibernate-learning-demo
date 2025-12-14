# Hibernate Learning Demo

This repository contains my complete **Hibernate ORM learning journey** using **Advance Java** and **PostgreSQL**.
It includes different Hibernate relationship mappings along with a **mini project**.

---

## 🔹 Repository Overview

This project is created to practice and understand:
- Hibernate ORM
- JPA annotations
- Entity relationships
- Real-world database mapping scenarios

The repository contains multiple demo packages and one highlighted mini project.

---

## 🔹 Technologies Used

- Java (Advance Java)
- Hibernate ORM (JPA)
- PostgreSQL Database
- Eclipse IDE
- Maven

---

## 🔹 Folder Structure

hibernatedemo
│
├── src/main/java
│ ├── one_to_one
│ ├── one_to_many
│ ├── many_to_one
│ ├── many_to_many
│ ├── one_to_many_and_many_to_one
│ ├── ont_to_one_bidirectional
│ └── Task2 ⭐
│ ├── Actor.java
│ ├── Movies.java
│ ├── Delete.java
│ └── ProgramDriver.java
│
├── src/main/resources
│ └── META-INF
│ └── persistence.xml
│
└── pom.xml


---

## ⭐ Mini Project – Actor Movie Mapping (Task2)

### 🔸 Project Description

**Task2** is a mini project that demonstrates a **Many-to-Many relationship** between **Actors** and **Movies** using Hibernate ORM.

### 🔸 Business Logic

- One Actor can work in multiple Movies
- One Movie can have multiple Actors
- Relationship is managed using Hibernate annotations
- Join table is automatically created by Hibernate

---

## 🔹 Concepts Implemented in Task2

- `@Entity`
- `@Id`
- `@ManyToMany`
- Collection mapping using `List`
- EntityManager & EntityTransaction
- Persistence Unit configuration
- Cascade operations

---

## 🔹 How Task2 Works

1. Hibernate configuration is loaded using `persistence.xml`
2. Actor and Movie objects are created
3. Relationships are set using Java collections
4. Data is persisted using `EntityManager`
5. Hibernate automatically generates SQL and join tables

---

## 🔹 How to Run the Project

1. Clone the repository
2. Open the project in Eclipse
3. Update database credentials in `persistence.xml`
4. Create PostgreSQL database
5. Run `ProgramDriver.java`
6. Check tables and data in PostgreSQL

---

## 🔹 Output

- Hibernate auto-generates tables
- Join table created for many-to-many mapping
- Actors and Movies data inserted successfully
- Console logs show Hibernate-generated SQL

---

## 🔹 Learning Outcome

Through this repository, I learned:
- How Hibernate manages entity relationships
- Difference between JDBC and Hibernate
- Real-world database mapping using ORM
- Best practices for backend persistence

---

## 🔹 Author

**Pravesh Kumar**  
Advance Java | Hibernate ORM | Backend Development
