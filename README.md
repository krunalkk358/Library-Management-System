📚 Library Management System (Java)

A modular Library Management System (LMS) built using Core Java that demonstrates strong implementation of Object-Oriented Programming (OOP), SOLID principles, and Design Patterns.

This project simulates how a library manages books, patrons, lending operations, reservations, and recommendations in a clean and extensible architecture.

⚠️ This project focuses on core Java design and architecture.
Persistence layers like databases or APIs are intentionally excluded.

🚀 Features
📖 Book Management

Add new books to the library inventory

Remove books from the system

Update book details

Search books by:

Title

Author

ISBN

Track book availability

👤 Patron Management

Register new library members

Update patron information

Maintain patron borrowing history

Track active loans

🔄 Lending Process

Checkout books to patrons

Return borrowed books

Prevent duplicate checkouts

Track active loans

📦 Inventory Management

Track available books

Track borrowed books

Maintain centralized book inventory

🏢 Multi-Branch Library Support

Support multiple library branches

Maintain branch-specific book collections

Transfer books between branches

⏳ Reservation System

Allow patrons to reserve checked-out books

Maintain reservation queue

Notify patrons when a book becomes available

🤖 Recommendation System

Suggest books to patrons based on:

Borrowing history

Book availability

Implemented using the Strategy Design Pattern for flexible recommendation algorithms.

🧠 Design Principles

This project demonstrates strong software engineering practices.

Object-Oriented Programming (OOP)

✔ Encapsulation
✔ Inheritance
✔ Polymorphism
✔ Abstraction

SOLID Principles
Principle	Implementation
Single Responsibility	Each class handles a single responsibility
Open/Closed	Strategies allow new algorithms without modification
Liskov Substitution	Interfaces used across services
Interface Segregation	Focused interfaces
Dependency Inversion	Services depend on abstractions
🧩 Design Patterns Used
1️⃣ Factory Pattern

Used to create Book objects.

BookFactory

Benefits:

Centralized object creation

Cleaner object initialization

2️⃣ Observer Pattern

Used in the Reservation Notification System.

Subject → PatronNotifier
Observer → Patron

When a reserved book becomes available, the system notifies waiting patrons.

3️⃣ Strategy Pattern

Used in the Recommendation System.

Different recommendation algorithms can be implemented without modifying existing code.

Example:

RecommendationStrategy
└── HistoryBasedRecommendation
🏗️ Project Architecture
org.lbms
│
├── app
│    └── Main.java
│
├── model
│    ├── Book.java
│    ├── Patron.java
│    ├── Loan.java
│    └── Reservation.java
│
├── service
│    ├── BookService.java
│    ├── PatronService.java
│    ├── LendingService.java
│    ├── ReservationService.java
│    └── RecommendationService.java
│
├── repository
│    ├── BookRepository.java
│    └── PatronRepository.java
│
├── branch
│    └── LibraryBranch.java
│
├── factory
│    └── BookFactory.java
│
├── observer
│    ├── Observer.java
│    ├── Subject.java
│    └── PatronNotifier.java
│
├── strategy
│    ├── RecommendationStrategy.java
│    └── HistoryBasedRecommendation.java
│
└── util
└── LoggerUtil.java
⚙️ Technologies Used
Technology	Purpose
Java	Core programming language
Maven	Project management
Java Collections	Data structures
Java Logging	Event logging
OOP	System design
📂 Data Structures Used
Structure	Usage
HashMap	Book & Patron storage
ArrayList	Loan history
Queue	Reservation system
List	Recommendations
▶️ Running the Project
1️⃣ Clone Repository
git clone https://github.com/YOUR_USERNAME/library-management-system.git
2️⃣ Open in IntelliJ / Eclipse

Import as Maven Project.

3️⃣ Run Application

Run:

Main.java

Output:

Book checked out successfully
Book reserved successfully
Library System Running Successfully
📌 Example Workflow
1. Add Books
2. Register Patron
3. Checkout Book
4. Return Book
5. Reserve Book
6. Generate Recommendations
   🔮 Future Improvements

Possible enhancements:

REST API using Spring Boot

Database integration (MySQL / PostgreSQL)

Web UI with React

Authentication system

Fine calculation for overdue books

Admin dashboard

📊 UML (Conceptual)

Main Entities:

Book
Patron
Loan
Reservation
LibraryBranch

Services:

BookService
PatronService
LendingService
ReservationService
RecommendationService

Patterns:

Factory
Observer
Strategy
👨‍💻 Author

Krunal K. K.

Software Developer

📧 krunalkhobragade5@gmail.com

📞 +91 8624982605

📜 License

This project is intended for educational and learning purposes.