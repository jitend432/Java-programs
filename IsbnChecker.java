public class ISBNChecker {
    public static void main(String[] args) {
        String isbn = "0321356683"; // Replace with the ISBN number you want to check

        if (isValidISBN(isbn)) {
            System.out.println(isbn + " is a valid ISBN-10 number.");
        } else {
            System.out.println(isbn + " is not a valid ISBN-10 number.");
        }
    }

    public static boolean isValidISBN(String isbn) {
        // Remove any hyphens or spaces from the ISBN
        isbn = isbn.replaceAll("[\\-\\s]", "");

        // Check if the ISBN length is correct
        if (isbn.length() != 10) {
            return false;
        }

        // Check if each character is a digit or 'X' (the check digit)
        for (int i = 0; i < 10; i++) {
            char c = isbn.charAt(i);
            if (!Character.isDigit(c) && !(c == 'X' && i == 9)) {
                return false;
            }
        }

        // Calculate the weighted sum of the ISBN digits
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(isbn.charAt(i));
            sum += (digit * (10 - i));
        }

        // Calculate the check digit
        int checkDigit = Character.getNumericValue(isbn.charAt(9));
        if (isbn.charAt(9) == 'X') {
            checkDigit = 10;
        }

        // Check if the check digit is valid
        return (sum + checkDigit) % 11 == 0;
    }
}
