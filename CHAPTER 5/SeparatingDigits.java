import java.util.Scanner;

public class SeparatingDigits {

    // (a) Method to calculate integer quotient of a divided by b
    public static int integerQuotient(int a, int b) {
        return a / b;   // Integer division automatically truncates the decimal part
    }

    // (b) Method to calculate integer remainder of a divided by b
    public static int integerRemainder(int a, int b) {
        return a % b;   // Remainder operator gives the leftover part
    }

    // (c) Method to display digits separated by two spaces
    public static void displayDigits(int number) {
        if (number < 1 || number > 99999) {
            System.out.println("Number must be between 1 and 99999.");
            return;
        }

        // Find the divisor to extract digits starting from the highest place
        int divisor = 1;
        while (number / divisor >= 10) {
            divisor *= 10;
        }

        // Extract and display each digit
        while (divisor >= 1) {
            int digit = integerQuotient(number, divisor);
            System.out.print(digit + "  "); // Two spaces between digits
            number = integerRemainder(number, divisor);
            divisor /= 10;
        }

        System.out.println(); // Move to next line
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for an integer
        System.out.print("Enter an integer between 1 and 99999: ");
        int num = input.nextInt();

        // Display digits separated by spaces
        System.out.println("\nDigits separated by two spaces:");
        displayDigits(num);

        input.close();
    }
}
