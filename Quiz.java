import java.util.Scanner;
public class Quiz {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int answer = number1 + number2;
		int count = 0;
		System.out.print (number1 + " + " + number2 + " = " );
		//System.out.print("Enter you answer : " );
		int useranswer = input.nextInt();
		
		while(answer  !=  useranswer) {
			System.out.println("YOU ARE  WRONG TRY AGAIN");
			System.out.print (number1 + " + " + number2 + " = " );
			useranswer = input.nextInt();
			count = count + 1;
			}
			System.out.println("Your answer is : " + useranswer + " Which is correct ");
			System.out.println("You attempt " + count + " times ");
		
		
	}
}