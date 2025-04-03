# Candidate Management System (Hibernate CRUD)

This project is a **Candidate Management System** built using Hibernate, implementing a **layered architecture** with CRUD (Create, Read, Update, Delete) operations.

## 📂 Project Structure

### 1️⃣ Entity Layer (`com.tka.entity`)
- Defines the `Candidate` entity with fields such as `c_id`, `name`,`partyname`,`state`,`assembly`,`gender`,and `age`.
- Uses Hibernate annotations for ORM mapping.

### 2️⃣ DAO Layer (`com.tka.dao`)
- Responsible for direct database interactions using Hibernate.
- Implements methods for CRUD operations:
  - `getAllCandidates()`
  - `insertcandidate()`
  - `updateCandidate()`
  - `saveorupdatecandidate()`
  - `deleteCandidate()`

### 3️⃣ Service Layer (`com.tka.service`)
- Acts as a bridge between the DAO and Controller layers.
- Contains business logic before calling DAO methods.

### 4️⃣ Controller Layer (`com.tka.controller`)
- Manages user inputs and forwards requests to the service layer.
- Suitable for both standalone Java applications and REST API integration.

### 5️⃣ Client (`com.tka.client`)
- Contains the main method to test CRUD operations.
- Calls the controller layer for demonstration.

## 🛠️ Technologies Used
- **Java 8+**
- **Hibernate (ORM)**
- **MySQL/PostgreSQL (Database)**
- **Maven (Dependency Management)**
- **Layered Architecture**

## 🚀 How to Run
1. Configure **hibernate.cfg.xml** with your database details.
2. Run the `Client` class to test CRUD operations.
3. (Optional) Use **Postman** if integrated with a REST API.

## 📌 Features
✔️ Add a new candidate  
✔️ Retrieve candidate details  
✔️ Update candidate information  
✔️ Delete a candidate  
✔️ List all candidates  

## 📎 GitHub Repository
🔗 **[Repository Link]** (Add your GitHub repo link here)
