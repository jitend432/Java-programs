import java.util.Scanner;
public class Factorial {
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Type you number here");
	 int num = input.nextInt();
	 int factorial = 1;
	 for(int i = num; i>=1; i--) {
		 factorial = factorial*i;
	 	}
		 
		 System.out.println("Your Factorial is " +factorial);
	}
}