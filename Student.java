package Java_Case_Study.JavaImplementation;
public class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
    public String toCSV() {
    	return studentId + ","+name;
    }
    public static Student fromCSV(String line) {
    	String[] data= line.split(",");
    	return new Student(data[0],data[1]);
    }
}