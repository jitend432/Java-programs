import java.util.Scanner;

class EmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the loan amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter the annual interest rate : ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter time in year : ");
        int timeInYear = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 12 / 100;
        double emi = calculateEmi(loanAmount, monthlyInterestRate, timeInYear);

        System.out.println("Monthly EMI: " + emi);
    }

    public static double calculateEmi(double loanAmount, double monthlyInterestRate, int tenureInMonths) {
        double emi;
        emi = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, tenureInMonths))
                / (Math.pow(1 + monthlyInterestRate, tenureInMonths) - 1);
        return emi;
    }
}
