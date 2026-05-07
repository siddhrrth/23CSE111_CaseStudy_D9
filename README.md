# Library Management System

## Team Members
| Roll No | Name | Roles |
|---------|------|------|
| AM.SC.U4CSE25356 | Varun Nair | Library class, UML diagram (Phase 2 doc) |
| AM.SC.U4CSE25324 | Jeevan A Jacob | FileHandler class, UML diagram (Phase 2 doc), Main class|
| AM.SC.U4CSE25349 | Siddharth S | Book class, borrowRecord class, Phase 1 doc, Github documentation |
| AM.SC.U4CSE25342 | Prithew J Raj | Main class, Student class, Phase 1 doc, GitHub documentation |

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
| `Library` | Add, issue, return, delete books and manage records |
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
   directory as the compiled files (or will be auto created on first run).

<img width="1029" height="652" alt="image" src="https://github.com/user-attachments/assets/93c1fc0e-868b-4cdb-b40f-65a88f4fa2f9" />


Screenshots available in `/output`.

## Tools & Technologies Used
- **Language:** Java
- **Storage:** CSV files (`books.csv`, `borrow_Records.csv`)
- **Concepts:** Object Oriented Programming, File Handling
- **Tools:** VS Code

## Repository Structure

23CSE111_CaseStudy_D9/<br>
├── Phase1/       → Phase 1 document <br>
├── Phase2/       → Phase 2 document <br>
├── src/          → Java source code<br>
├── output/       → Sample output screenshots<br>
└── README.md<br>

## Course Info
**Course:** 23CSE111 – Object Oriented Programming  
**Batch:** S2 B.Tech CSE  
**Institution:** Amrita School of Computing, Amritapuri  
**Group:** D9
