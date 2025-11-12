import java.util.Scanner;

public class Minimum3 {

    // Method to return the smallest of three floating-point numbers
    public static double minimum3(double a, double b, double c) {
        return Math.min(a, Math.min(b, c)); // Use Math.min to compare
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read three floating-point values from the user
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

        // Determine the smallest value
        double min = minimum3(num1, num2, num3);

        // Display the result
        System.out.printf("The smallest of %.2f, %.2f, and %.2f is %.2f%n", num1, num2, num3, min);

        input.close();
    }
}
