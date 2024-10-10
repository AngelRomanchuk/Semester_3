package CreditCardProblem;

public class Money {
    private long dollars;
    private long cents;

    // Constructors
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100);
    }
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Add, Substract this.amount from or to other.Amount
    public Money add(Money otherAmount) {
        long totalCents = (this.dollars * 100 + this.cents) + (otherAmount.dollars * 100 + otherAmount.cents);
        return new Money(totalCents / 100.0);
    }
    public Money subtract(Money otherAmount) {
        long totalCents = (this.dollars * 100 + this.cents) - (otherAmount.dollars * 100 + otherAmount.cents);
        return new Money(totalCents / 100.0);
    }


    public int compareTo(Money otherObject) {
        long thisTotalCents = this.dollars * 100 + this.cents;
        long otherTotalCents = otherObject.dollars * 100 + otherObject.cents;
        return Long.compare(thisTotalCents, otherTotalCents);
    }

    public boolean equals(Money other) {
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    // To String/Overide
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}
