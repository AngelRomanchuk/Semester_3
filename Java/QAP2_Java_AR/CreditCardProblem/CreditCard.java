package CreditCardProblem;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit) {
        this.balance = new Money(0.0); // Initial balance is 0
        this.creditLimit = new Money(limit); // Use copy constructor for credit limit
        this.owner = newCardHolder; // Assign owner
    }

    // Get information
    public Money getBalance() {
        return new Money(balance);
    }
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }
    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
