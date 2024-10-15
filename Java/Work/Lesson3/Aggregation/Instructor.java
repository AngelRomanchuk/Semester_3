package Java.Work.Lesson3Week.Aggregation;

public class Instructor {
    private String lastName;
    private String firstName;
    private String officeNumber;

    public Instructor(String fn, String ln, String offno)
    {
        this.firstName = fn;
        this.lastName = ln;
        this.officeNumber = offno;
    }
    public Instructor(Instructor object2)
    {
        this.firstName = object2.firstName;
        this.lastName = object2.lastName;
        this.officeNumber = object2.officeNumber;

    }
        public void set(String fn, String ln, String offno)
    {
        this.firstName = fn;
        this.lastName = ln;
        this.officeNumber = offno;
    }
    public String toString() {
        return (this.lastName + " " + this.firstName + ", Office Number: " + this.officeNumber);
    }
}
