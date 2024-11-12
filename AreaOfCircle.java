import java.util.Scanner;
public class AreaOfCircle {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
			System.out.println("Enter any radius");
			double radius = input.nextDouble();
			double area = 3.141 * radius * radius;
			System.out.println("Area of circle is : " + area);
	}
}