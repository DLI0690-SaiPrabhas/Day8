class InsufficientFundsException extends RuntimeException {
    InsufficientFundsException(String s) {
        super(s);
    }
}
class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Your balance is " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is " + balance);
        }
    }
}

public class ThrowingExceptions {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);

        try {
            System.out.println("Attempting to withdraw $1500...");
            account.withdraw(1500.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}