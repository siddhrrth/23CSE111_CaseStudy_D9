import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Admin (Librarian)");
            System.out.println("2. Student");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int role = sc.nextInt();
            sc.nextLine();

            if (role == 1) {
                adminMenu(library, sc);

            } else if (role == 2) {
                studentMenu(library, sc);

            } else if (role == 3) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    // ADMIN MENU
    static void adminMenu(Library library, Scanner sc) {
        System.out.println("\n--- Admin Menu ---");
        System.out.println("1. View Books");
        System.out.println("2. Add Book");
        System.out.println("3. Issue Book");
        System.out.println("4. Return Book");
        System.out.print("Choice: ");

        int ch = sc.nextInt();
        sc.nextLine();

        switch (ch) {
            case 1:
                library.viewBooks();
                break;

            case 2:
                System.out.print("Book ID: ");
                String id = sc.nextLine();
                System.out.print("Title: ");
                String title = sc.nextLine();
                System.out.print("Author: ");
                String author = sc.nextLine();
                library.addBook(new Book(id, title, author, true));
                break;

            case 3:
                System.out.print("Student ID: ");
                String sid = sc.nextLine();
                System.out.print("Book ID: ");
                String bid = sc.nextLine();
                library.issueBook(sid, bid);
                break;

            case 4:
                System.out.print("Book ID: ");
                String bid2 = sc.nextLine();
                library.returnBook(bid2);
                break;

            default:
                System.out.println("Invalid option");
        }
    }

    // STUDENT MENU
    static void studentMenu(Library library, Scanner sc) {
        System.out.print("\nEnter Student ID: ");
        String studentId = sc.nextLine();

        System.out.println("\n--- Student Menu ---");
        System.out.println("1. View Available Books");
        System.out.println("2. View My Issued Books");
        System.out.print("Choice: ");

        int ch = sc.nextInt();
        sc.nextLine();

        switch (ch) {
            case 1:
                library.viewBooks();
                break;

            case 2:
                library.viewIssuedBooksByStudent(studentId);
                break;

            default:
                System.out.println("Invalid option");
        }
    }
}
