****📚 Library Management System (OOP Demo in Java)****

A lightweight console‑based library manager written in **Java 17**.  
The project showcases the four pillars of Object‑Oriented Programming — **Abstraction, Encapsulation, Inheritance, and Polymorphism** — while allowing users to add, search, borrow, and return books.

---

## ✨ Key Features

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

## 🖥️ Tech Stack

| Layer | Technology |
|-------|------------|
| Language | Java 17 (works on 11+) |
| Build / Run | Plain `javac` & `java` or any IDE (IntelliJ, Eclipse) |
| Data Storage | In‑memory `ArrayList<Book>` (no DB) |

---

## 🗂 Project Structure

