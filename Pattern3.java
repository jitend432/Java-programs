import java.util.Scanner;
public class Pattern3 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter Range of pattern : ");
		int Range = input.nextInt();
		
		for( int i = 1; i <= Range; i++ ){
			
			for (int j = 1; j <= (Range-i); j++ ){
				System.out.print( " ");
			}
			for (int k = 1; k <= i; k++ ){
				System.out.print(k+ " ");
			}
			for (int l = i-1;  l>=i ; l-- ){
				System.out.print(l+ " ");
			}
			System.out.println();
			
			
		}
		for( int i = 1; i <= Range; i++ ){
			
			for (int j = 1; j <= (Range-i); j++ ){
				System.out.print( " ");
			}
			for (int k = 1; k <= i; k++ ){
				System.out.print(k+ " ");
			}
			for (int l = i-1;  l>=i ; l-- ){
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		
		for( int i = 1; i <= 10; i++ ){
			
			for (int j = 1; j <=2; j++ ){
				System.out.print("     |");
			}
			System.out.println( );
		}
			
		
	}
}