public class MainAccount {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 1000);
        CheckingAccount checkingAccount = new CheckingAccount("CA001", 2000);
        BusinessAccount businessAccount = new BusinessAccount("BA001", 5000, "ABC Company");

        // Demonstrate SavingsAccount behavior
        System.out.println("Savings Account - Initial Balance: $" + savingsAccount.getBalance());
        savingsAccount.deposit(500);
        savingsAccount.applyInterest();

        // Demonstrate CheckingAccount behavior
        System.out.println("Checking Account - Initial Balance: $" + checkingAccount.getBalance());
        checkingAccount.withdraw(200);
        checkingAccount.withdraw(600);

        // Demonstrate BusinessAccount behavior
        System.out.println("Business Account - Initial Balance: $" + businessAccount.getBalance());
        businessAccount.applyMonthlyMaintenanceFee();
    }
}
