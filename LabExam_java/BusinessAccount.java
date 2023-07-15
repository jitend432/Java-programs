// Derived class - BusinessAccount
public class BusinessAccount extends Account {
    private static final double MONTHLY_MAINTENANCE_FEE = 50; // $50 monthly maintenance fee

    private String companyName;

    public BusinessAccount(String accountNumber, double balance, String companyName) {
        super(accountNumber, balance);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void applyMonthlyMaintenanceFee() {
        balance -= MONTHLY_MAINTENANCE_FEE;
        System.out.println("Monthly maintenance fee applied: $" + MONTHLY_MAINTENANCE_FEE);
        System.out.println("Current balance: $" + balance);
    }
}