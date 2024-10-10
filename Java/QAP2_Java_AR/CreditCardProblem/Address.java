package CreditCardProblem;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructor
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // To String/Overide
    public String toString() {
        return "Address: " + street + ", " + city + ", " + state + " " + zip;
    }
}
