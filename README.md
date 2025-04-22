[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/Vha2oDVP)
# Assignment-9-PBLJ

# 🌿 Spring & Hibernate Interactive Assignment

Welcome to the **Spring & Hibernate Assignment**! This project helps you learn how to build powerful Java applications using **Spring for Dependency Injection (DI)** and **Hibernate ORM** for database interaction and transaction management. The assignment is structured in three levels: Easy, Medium, and Hard.

---

## 📚 Project Structure

The assignment is divided as follows:

### ✅ Easy Level: Spring Dependency Injection (Java Config)

**Objective:**  
Create a basic Spring application demonstrating **Dependency Injection** using Java-based configuration with `@Configuration` and `@Bean` annotations.

📁 Requirements:
1. Define a `Course` class with `courseName` and `duration`.
2. Define a `Student` class with `name` and a reference to `Course`.
3. Use `@Configuration` and `@Bean` annotations to inject dependencies.
4. Load Spring context in the `main` method and print student details.

🛠 Tech Stack:
- Java
- Spring Core
- Java-based Configuration (no XML)

---

### 🛠 Medium Level: Hibernate CRUD Operations

**Objective:**  
Build a **Hibernate-based** application to perform CRUD operations on a Student entity using Hibernate ORM with MySQL.

📁 Requirements:
1. Configure Hibernate using `hibernate.cfg.xml`.
2. Create a `Student` entity class with `id`, `name`, and `age`.
3. Use `SessionFactory` to perform CRUD operations.
4. Test the functionality with sample data.

🛠 Tech Stack:
- Hibernate ORM
- MySQL
- Java SE

---

### 💳 Hard Level: Spring + Hibernate Transaction Management

**Objective:**  
Create a banking system using Spring and Hibernate to transfer money between accounts. Ensure that all transactions are atomic.

📁 Requirements:
1. Use Spring configuration with Hibernate integration.
2. Define two entity classes: `Account` and `Transaction`.
3. Use Hibernate Transaction Management.
4. Rollback if a transaction fails.
5. Demonstrate both successful and failed transactions.

🛠 Tech Stack:
- Spring Framework
- Hibernate ORM
- MySQL
- Java

---

## 🚀 Getting Started

### Prerequisites

- Java (JDK 8+)
- Maven or Gradle
- MySQL
- Any IDE (IntelliJ, Eclipse)
- Spring Core and Hibernate dependencies

### Sample Hibernate Configuration (`hibernate.cfg.xml`)

```xml
<hibernate-configuration>
 <session-factory>
   <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
   <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/your_db</property>
   <property name="hibernate.connection.username">root</property>
   <property name="hibernate.connection.password">password</property>
   <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
   <property name="hibernate.hbm2ddl.auto">update</property>
   <property name="show_sql">true</property>
 </session-factory>
</hibernate-configuration>
```

---

## 📌 Folder Structure

```
├── easy/
│   ├── Student.java
│   ├── Course.java
│   ├── AppConfig.java
│   └── Main.java

├── medium/
│   ├── Student.java
│   ├── HibernateUtil.java
│   ├── StudentDao.java
│   └── TestCRUD.java

├── hard/
│   ├── Account.java
│   ├── Transaction.java
│   ├── BankService.java
│   ├── BankServiceImpl.java
│   └── TestTransaction.java
```

---

## 💡 Learning Outcomes

- Understand Spring DI with Java configuration
- Perform basic CRUD operations using Hibernate
- Manage complex transactions with Spring + Hibernate
- Learn to rollback on failure using transaction management

---

## 🙌 Contribution Guide

- Fork the repository
- Create your feature branch: `git checkout -b my-feature`
- Commit your changes
- Push and create a pull request

---

## 🧠 Tips

- Make sure to test each level separately
- Use logs to understand transaction flow
- Try throwing runtime exceptions to test rollback behavior

---

**Happy Coding! 🌱**
