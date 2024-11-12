import java.util.Scanner;
public class Pattern4 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter Range of pattern : ");
		int Range = input.nextInt();
		
		for( int i = 1; i <= Range; i++ ){
			
			for (int j = 1; j<= (Range-i); j++ ){
				System.out.print("  ");
			}
			for (int k = 1; k<= i; k++ ){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}



/*

 *  *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *
 *  *  *  *  *  *
 *  *  *  *  *
 *  *  *  *
 *  *  *
 *  *
 *
 */