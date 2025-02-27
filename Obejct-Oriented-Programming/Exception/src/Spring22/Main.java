// User-defined Exception class
class InvalidTxnException extends Exception {
    public InvalidTxnException(String message) {
        super(message);
    }
}

// CreditCard class
class CreditCard {
    private int balance;
    private int limit;

    // Constructor
    public CreditCard(int amount, int limit) throws InvalidTxnException {
        if (amount < 0) {
            throw new InvalidTxnException(amount + " is not a valid amount for the requested transaction");
        }
        this.balance = amount;
        this.limit = limit;
    }

    // Withdraw method
    public void withdraw(int amount) throws InvalidTxnException {
        if (amount < 0) {
            throw new InvalidTxnException(amount + " is not a valid amount for the requested transaction");
        }
        if (balance - amount < -limit) {
            throw new InvalidTxnException(amount + " cannot be withdrawn with current credit of " + balance + " for your limit of " + limit);
        }
        balance -= amount;
    }

    // Get current balance
    public int getBalance() {
        return balance;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        try {
            // Line 18: Attempting to create CreditCard with a negative amount
            CreditCard card = new CreditCard(-5000, 10000);
        } catch (InvalidTxnException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Line 25: Valid card creation, but invalid withdrawal
            CreditCard card = new CreditCard(7000, 10000);
            card.withdraw(4000); // Attempting to withdraw more than allowed
        } catch (InvalidTxnException e) {
            System.out.println(e.getMessage());
        }
    }
}
