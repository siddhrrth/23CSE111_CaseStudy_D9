package Java_Case_Study.JavaImplementation;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		Library library = new Library();
		try {
			library.loadData();
			
			library.addBook(new Book("B101","Harry Potter 1","J.K.Rowling", false));			
			library.addBook(new Book("B102","Harry Potter 2","J.K.Rowling", false));			
			library.addStudent(new Student("S101","Alice"));
			
			library.issueBook("B101");
			library.issueBook("B102");
			library.returnBook("B101");
			
			library.displayBooks();
		}
		catch (IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
	}
}
