package Java.Work.LabTasks.Week2.Employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String getName(){
        String name = firstName + " " + lastName;
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    public int raiseSalary(int percent) {
        this.salary += (int)(salary * (percent / 100.0));
        return this.salary;
    }

    // toString
    public String toString(){
        return "Employee[id="+id+", name="+getName()+", salary="+salary+"]";
    }
}
