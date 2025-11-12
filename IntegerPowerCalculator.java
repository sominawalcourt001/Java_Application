import java.util.Scanner;

public class IntegerPowerCalculator {

    // Method to calculate base^exponent
    public static int integerPower(int base, int exponent) {
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base (integer): ");
        int base = input.nextInt();

        System.out.print("Enter the exponent (positive integer): ");
        int exponent = input.nextInt();

        if (exponent <= 0) {
            System.out.println("Exponent must be a positive, nonzero integer.");
        } else {
            int power = integerPower(base, exponent);
            System.out.printf("%d to the power of %d is %d%n", base, exponent, power);
        }

        input.close();
    }
}
