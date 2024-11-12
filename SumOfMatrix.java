import java.util.Scanner;
public class SumOfMatrix  {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int m = input.nextInt();
		System.out.println("Enter number of column");
		int n = input.nextInt();
		
		int a[][] = new int[m][n];
		int b[][] = new int [m][n];
		
		for(int i = 0; i<m.length; i++) {
			for(int j = 0; i<n.length; )  {
				a[i][j] = input.nextInt();
				
			}
		}
		
		for(int i = 0; i<m.length; i++) {
			for(int j = 0; i<n.length; )  {
				b[i][j] = input.nextInt();
				
			}
		}
		
		int c[][] = new int[m][n];
		for(int i = 0; i<m.length; i++) {
			for(int j = 0; i<n.length; )  {
				c[i][j] = a[i][j] + b[i][j];
				
			}
		}
		
		
		
		
	}
}