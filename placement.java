import java.util.Scanner;
 class Factorial {
public static void main (String [] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println(" Enter a number");
	int n = input.nextInt();
	int marks[] = new int [n];
	System.out.println("Enter Marks now = ");
	//int marks = input.nextInt();
	
	for(int i = 0; i<n ; i++) {
		
		marks[i] = input.nextInt();
	}
	int averageMarks = 0;
	for(int i = 0; i<n; i++) {
		averageMarks+=marks[i];
	}
	averageMarks/=n;
	System.out.println("Average Marks = "+averageMarks );
		
	   }
	 
   }

	
	


	


 