package Java.Work.LabTasks.Week2.Employee;

public class EmploeeTest {
    public static void main(String[] args) {
        Employee E1 = new Employee(111, "John", "Smith", 4500);
        Employee E2 = new Employee(222, "James", "Bob", 5000);

        System.out.println("Jhon's annual salary: "+E1.getAnnualSalary());
        System.out.println("James's annual salary: "+E2.getAnnualSalary());

        E1.raiseSalary(20);
        E2.raiseSalary(20);

        System.out.println("Jhon's annual salary after raise: "+E1.getAnnualSalary());
        System.out.println("James's annual salary after raise: "+E2.getAnnualSalary());
    }
}
