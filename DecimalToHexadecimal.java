import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = input.nextInt();

        String hexadecimal = decimalToHexadecimal(decimalNumber);

        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Hexadecimal: " + hexadecimal);
    }

    public static String decimalToHexadecimal(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder hexadecimal = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 16;
            hexadecimal.insert(0, getHexadecimalDigit(remainder));
            decimalNumber /= 16;
        }

        return hexadecimal.toString();
    }

    public static char getHexadecimalDigit(int value) {
        if (value < 10) {
            return (char) (value + '0');
        } else {
            return (char) (value - 10 + 'A');
        }
    }
}
