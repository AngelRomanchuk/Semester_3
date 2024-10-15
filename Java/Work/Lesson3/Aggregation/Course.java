package Java.Work.Lesson3Week.Aggregation;

public class Course {
    private String courseName;
    private Instructor instructor;
    private TextBook textBook;
    
    public Course(String courseName,Instructor instr, TextBook text)
    {
        this.courseName = courseName;
        this.instructor = instr;
        this.textBook = text;
    }
    public String getName() {
        return this.courseName;
    }
    public Instructor getInstructor() {
        return this.instructor;
    }
    public TextBook getTextBook() {
        return this.textBook;
    }
    public String toString() {
        return ("This course: " + this.courseName + " Is taught by the great: " + this.instructor + " Using this textbook:  " + this.textBook);
    }
}
