# Demo Spring MVC Thymeleaf Spring Data JPA

This project is a simple demo of a **Spring Boot MVC** application using:
- **Spring Web** (for controllers)
- **Spring Data JPA** (for database access)
- **Thymeleaf** (for frontend rendering)
- **H2 Database** (in-memory database for development)
- **Bootstrap (via WebJars)** (for UI styling)
- **Lombok** (to reduce boilerplate code)
- **Gradle** as the build tool

---

## 🛠 Technologies

- Java 23
- Spring Boot 3.4.5
- Gradle
- Thymeleaf
- JPA (Hibernate)
- H2 Database / MySQL
- Bootstrap 5.3.5 (via WebJars)
- Lombok

---

## 📚 Project Structure

| Layer | Description |
|:------|:------------|
| `@Controller` | Manages HTTP requests and responses |
| `@Entity` | Maps Java classes to database tables |
| `@Repository` | Provides CRUD operations on entities |

---

## 📦 How to Run

1. Clone the project.
2. Open it in IntelliJ IDEA.
3. Make sure you have **Java 23** installed and selected.
4. Build the project (`Build > Build Project`).
5. Run the main class (`DemoApplication.java`).

---

## 🔗 Useful Endpoints

| URL | Description |
|:----|:------------|
| `/patients` | Displays a list of patients |

---

## ⚙️ Configuration

### application.properties example

```properties
# H2 Database (default)
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Thymeleaf
spring.thymeleaf.cache=false
```

🔵 If you use **MySQL**, change:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/yourdbname
spring.datasource.username=youruser
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

---

## 📄 Key Concepts

- **Controller** handles user input and web pages.
- **Repository** abstracts database interactions.
- **Entity** maps classes to database tables.
- **Dependency Injection** (`@Autowired`) simplifies object management.
- **Inversion of Control (IoC)** principle applied by Spring Boot.
- **Coupling** is kept **low** by depending on **interfaces** instead of **implementations**.

---

## 📢 Notes

- Always use **low coupling** and **high cohesion** in your design.
- The project is **Open for extension but closed for modification** (Open/Closed Principle).
- Lombok's `@Data` generates `getters`, `setters`, `toString`, `equals`, `hashCode` automatically.

---

Would you also like me to generate a quick diagram (Entity-Repository-Controller flow) that you can put inside the README? 🚀  
It can help **wow** your professor even more! 🎯
