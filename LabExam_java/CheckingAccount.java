// Derived class - CheckingAccount
public class CheckingAccount extends Account {
    private static final double MAX_WITHDRAWAL_LIMIT = 500; // $500 maximum withdrawal limit per day

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance && amount <= MAX_WITHDRAWAL_LIMIT) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Current balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or exceeded maximum withdrawal limit");
        }
    }
}