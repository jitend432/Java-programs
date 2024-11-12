import java.util.Scanner;
public class Pattern1 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter Range of pattern : ");
		int Range = input.nextInt();
		
		for( int i = 1; i <= Range; i++ ){
			
			for (int j = 1; j <= i; j++ ){
				System.out.print(" " + j);
			}
			System.out.println();
		}
	}
}

/*

 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 1 2 3 4 5 6
 1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8
 1 2 3 4 5 6 7 8 9
 1 2 3 4 5 6 7 8 9 10
 */