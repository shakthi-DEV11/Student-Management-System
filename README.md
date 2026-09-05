# Student Management System

A simple, console-based Java application for managing student records using object-oriented principles.

## Overview

This console-based application allows administrators to easily manage student information. The system supports full CRUD (Create, Read, Update, Delete) operations, allowing users to:
* Add new student records
* View all students
* Search for specific students by ID
* Update existing student information
* Delete student records
* Calculate student results based on marks
* Exit the application securely

## Features

* Add Student
* View Students
* Search Student
* Update Student
* Delete Student
* Calculate Result
* Input Validation
* Menu-Driven Console Interface

## Technologies Used

* Java
* Core Java
* OOP
* ArrayList
* Scanner
* Exception Handling

## Java Concepts Demonstrated

* **Classes & Objects**: Modeling the `Student` entity and `StudentManagementSystem` logic.
* **Encapsulation**: Securing data using private fields and providing public getters/setters.
* **Constructors**: Initializing student objects with required properties.
* **Methods**: Modularizing operations like calculating averages and rendering tables.
* **`this` keyword**: Resolving variable shadowing in constructors and setters.
* **Access Modifiers**: Restricting and allowing access correctly using `public` and `private`.
* **ArrayList**: Managing dynamic lists of student records.
* **Conditional Statements**: Validating input and calculating grades (`if-else`).
* **Loops**: Processing arrays of marks and maintaining the application menu (`while`, `for`).
* **Switch Statements**: Handling user menu choices.
* **Exception Handling**: Using `try-catch` blocks to gracefully handle `InputMismatchException`.

## System Flow

```text
Start
  ↓
Display Menu
  ↓
User Selects Operation
  ↓
Perform Operation
  ↓
Update Student Records
  ↓
Return to Menu
  ↓
Exit
```

## Application Menu

```text
========================================
       STUDENT MANAGEMENT SYSTEM
========================================
1. Add Student
2. View Students
3. Search Student
4. Update Student
5. Delete Student
6. Calculate Result
7. Exit
========================================
Enter your choice:
```

## Project Structure

```text
Student-Management-System/
│
├── Student.java
├── StudentManagementSystem.java
├── Main.java
├── .gitignore
└── README.md
```

## How to Run

Navigate to the project directory in your command line and run the following commands:

```bash
javac *.java
java Main
```

## Example Output

```text
========================================
       STUDENT MANAGEMENT SYSTEM
========================================
1. Add Student
2. View Students
3. Search Student
4. Update Student
5. Delete Student
6. Calculate Result
7. Exit
========================================
Enter your choice: 1
Enter Student ID: 101
Enter Student Name: Shakthi
Enter Student Age: 21
Enter Student Department: Computer Science
Enter number of subjects to input marks for: 3
Enter marks for subject 1: 85
Enter marks for subject 2: 90
Enter marks for subject 3: 88
Student added successfully!
```

## Learning Outcomes

Building this project provided hands-on experience with:
* Applying OOP concepts to a practical problem
* Managing objects using `ArrayList`
* Implementing CRUD operations
* Handling user input
* Applying validation and business rules
* Designing a menu-driven Java application

## Future Improvements

* Database integration using MySQL
* Login and authentication
* GUI using JavaFX
* REST API using Spring Boot
* Persistent student records
* Advanced search and filtering

## Author

**Shakthi Nagarajan**
* GitHub: [https://github.com/shakthi-DEV11](https://github.com/shakthi-DEV11)
* LinkedIn: [https://www.linkedin.com/in/shakthi-nagarajan-335387357/](https://www.linkedin.com/in/shakthi-nagarajan-335387357/)
