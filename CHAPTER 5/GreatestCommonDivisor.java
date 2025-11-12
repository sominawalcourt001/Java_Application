import java.util.Scanner;

public class GreatestCommonDivisor {

    // Method to compute the  GreatestCommonDivisor using Euclid's algorithm
    public static int  greatestcommondivisor(int a, int b) {
        // Ensure numbers are positive
        a = Math.abs(a);
        b = Math.abs(b);

        // Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read two integers from the user
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        // Compute  GreatestCommonDivisor
        int result =  greatestcommondivisor(num1, num2);

        // Display the result
        System.out.printf("The greatest common divisor of %d and %d is %d.%n", num1, num2, result);

        input.close();
    }
}
