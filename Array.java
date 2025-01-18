import java.util.Scanner;
public class Array  {
	public static void main (String [] args) {
		Scanner input  = new Scanner (System.in);
		System.out.println("Enter size of an array");
			int n = input.nextInt();
			input.nextLine();
			String [] arr = new String[n];
			System.out.println("Enter your string now");
			//String real = input.nextLine();
			
			for(int i = 0; i<n; i++) {
				arr[i] = input.nextLine();
				//System.out.println(i);	
			}
			System.out.println("You have Entered the following string");
			for(String str : arr) {
				System.out.print("[" + str +"]");

			}

		}
	}
	