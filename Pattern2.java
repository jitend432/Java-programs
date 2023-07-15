import java.util.Scanner;
public class Pattern2 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter Range of pattern : ");
		int Range = input.nextInt();
		
		for( int i = 1; i <= Range; i++ ){
			System.out.println();
			for (int j = 1; j <= i; j++ ){
				System.out.print((char)(j+ 64)+ " ");
			}
		}
	}
}

/*

A
A B
A B C
A B C D
A B C D E
A B C D E F
A B C D E F G
A B C D E F G H
A B C D E F G H I
A B C D E F G H I J
*/