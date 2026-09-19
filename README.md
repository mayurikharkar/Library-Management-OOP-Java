**Library Management System (based on OOPs Java)**

  # Library-Management-OOPs-Java
>>Library Management System - Java Project

A simple Java console-based Library Management System that uses core Object-Oriented Programming concepts like Encapsulation, Inheritance, Polymorphism, and Abstraction.

>Features
- Add Fiction & Non-Fiction Books
- Borrow and Return Books
- Search Books by Title or Author
- Display All Books

>>How to Run
1. Open the project in IntelliJ IDEA or any Java IDE.
2. Run the `LibrarySystem.java` file.
3. Follow the menu options in the console.

 >> Technologies Used
- Java
- Core OOP Concepts


The project showcases the four pillars of Object‑Oriented Programming — **Abstraction, Encapsulation, Inheritance, and Polymorphism** — while allowing users to add, search, borrow, and return books.

---

## Key Features

| # | Feature | OOP Concept | Class / Method |
|---|---------|-------------|----------------|
| 1 | Abstract `Book` superclass | **Abstraction** | `Book` (abstract) |
| 2 | `FictionBook` & `NonFictionBook` subclasses | **Inheritance** | `showDetails()` overrides |
| 3 | Private fields + getters/setters | **Encapsulation** | `Book` getters / `isBorrowed()` |
| 4 | Overridden `showDetails()` | **Polymorphism** | Each subclass prints its own info |
| 5 | Borrow / return with status tracking | State management | `borrow()`, `returnBook()` |
| 6 | Search by title or author (case‑insensitive) | Utility | `searchBooks()` |
| 7 | Simple menu‑driven CLI | User interaction | `LibrarySystem.start()` |

---

## 🗂 Project Structure
LibrarySystem/
└── LibrarySystem.java # Contains Book hierarchy & main menu
