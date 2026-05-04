package Java_Case_Study.JavaImplementation;
public class Book {
    private String bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String bookId, String title,String author,boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public String toCSV() {
    	return bookId + ","+title+","+author+","+isAvailable;
    }
    public static Book fromCSV(String line) {
    	String[] data = line.split(",");
    	return new Book(data[0], data[1], data[2], Boolean.parseBoolean(data[3]));
    }
}
