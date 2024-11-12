import java.util.Scanner;
public class Max {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first numbers : ");
		int firstnumber = input.nextInt();
		System.out.print("Enter second numbers : ");
		int secondnumber = input.nextInt();
		System.out.print("Enter third numbers : ");
		
		
		int thirdnumber = input.nextInt();
		
		if((firstnumber >= secondnumber) && (firstnumber >= thirdnumber)){
			
				if((secondnumber >= thirdnumber)) {
				System.out.println("First Max : " + firstnumber +  " Second  Max : " + secondnumber);
				}else{
				System.out.println("First Max : " + firstnumber +  " Second  Max : " + thirdnumber);
			}
		}
		if((secondnumber >= firstnumber) && (secondnumber >= thirdnumber)){
			
				if((firstnumber >= thirdnumber)) {
				System.out.println("First Max : " + secondnumber +  " Second  Max : " + firstnumber);
				}else{
				System.out.println("First Max : " + secondnumber +  " Second  Max : " + thirdnumber);
			}
		}
		if((thirdnumber >= firstnumber) && (thirdnumber >= secondnumber)){
			
				if((firstnumber >= secondnumber)) {
				System.out.println("First Max : " + thirdnumber +  " Second  Max : " + firstnumber);
				}else{
				System.out.println("First Max : " + thirdnumber +  " Second  Max : " + secondnumber);
			}
		}
		
		
	}
}