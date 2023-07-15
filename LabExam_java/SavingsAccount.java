// Derived class - SavingsAccount
public class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.05; // 5% interest rate

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void applyInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest applied: $" + interest);
        System.out.println("Current balance: $" + balance);
    }
}