package CreditCardProblem;

public class Person {
    private String firstName;
    private String lastName;
    private Address home;

    // Constructor
    public Person(String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

    // To String/Overide
    public String toString() {
        return "Person: " + lastName + " " + firstName + ", " + home.toString();
    }
}
