package Java_Case_Study.JavaImplementation;

import java.io.*;
import java.util.*;

public class Library {
	private List<Book> books = new ArrayList<>();
	private List<Student> students = new ArrayList<>();
	
	
	private String BOOK_FILE = "books.csv";
	private String STUDENT_FILE = "students.csv";
	
    public Library() {
        createFileIfNotExists(BOOK_FILE);
        createFileIfNotExists(STUDENT_FILE);
    }

    private void createFileIfNotExists(String fileName) {
        try {
            File file = new File(fileName);
            if (!file.exists()) file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error creating file: " + fileName);
        }
    }
    
	public void loadData() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(BOOK_FILE));
		String line;
		while ((line=br.readLine())!=null) {
			books.add(Book.fromCSV(line));
		}
		br.close();
		
		br = new BufferedReader(new FileReader(STUDENT_FILE));
		while ((line=br.readLine())!=null) {
			students.add(Student.fromCSV(line));
		}
		br.close();
	}
	
	public void saveBooks() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(BOOK_FILE));
		for (Book b : books) {
			bw.write(b.toCSV());
			bw.newLine();
		}
		bw.close();
	}
	
	public void addBook(Book book) throws IOException {
		books.add(book);
		saveBooks();
	}
	
	public void addStudent(Student student) throws IOException{
		students.add(student);
		BufferedWriter bw = new BufferedWriter(new FileWriter(STUDENT_FILE, true));
		bw.write(student.toCSV());
		bw.newLine();
		bw.close();
	}
	
	public void issueBook(String bookId) throws IOException {
		for (Book b : books) {
			if (b.getBookId().equals(bookId) && b.isAvailable()) {
				b.setAvailable(false);
				break;
			}
		}
		saveBooks();
	}
	
	public void returnBook(String bookId) throws IOException {
		for (Book b : books) {
			if (b.getBookId().equals(bookId) && !b.isAvailable()) {
				b.setAvailable(true);
				break;
			}
		}
		saveBooks();
	}
	
	public void displayBooks() {
		for (Book b : books) {
			System.out.println(b.toCSV());
		}
	}
}
