# Library Management System

## Team Members
| Roll No | Name |
|---------|------|
| AM.SC.U4CSE25356 | Varun Nair |
| AM.SC.U4CSE25349 | Siddharth S |
| AM.SC.U4CSE25324 | Jeevan A Jacob |
| AM.SC.U4CSE25342 | Prithew J Raj |

## Problem Description
At the start of a semester, students rush to borrow textbooks. Instead of
writing entries in a register, the librarian opens the system and searches
for the requested book. When issuing, the librarian enters the student ID
and book ID. The system checks availability — if available, it creates a
borrow record and marks the book unavailable. Students can log in to view
their currently held books and due dates. During returns, the librarian
processes the transaction and the system updates CSV records. The system
prevents issuing already-borrowed books and helps identify overdue returns,
improving discipline and efficiency.

## Classes & Responsibilities
| Class | Responsibility |
|-------|---------------|
| `Book` | Stores book info and availability status |
| `Student` | Stores student info and login credentials |
| `Library` | Core logic — add, issue, return, delete books and manage records |
| `Main` | User interaction, menus, and program flow |

## How to Run the Code

1. Clone the repository:
git clone https://github.com/siddhrrth/23CSE111_CaseStudy_D9.git
2. Navigate to the src folder:
cd src
3. Compile all Java files:
javac *.java
4. Run the main class:
java Main
5. Make sure `books.csv` and `borrows.csv` are present in the same
   directory as the compiled files (or will be auto-created on first run).
