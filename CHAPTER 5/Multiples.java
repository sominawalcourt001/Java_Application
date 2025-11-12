import java.util.Scanner;

public class Multiples {

    // Method to check if the second integer is a multiple of the first
    public static boolean isMultiple(int first, int second) {
        // A multiple means the remainder is zero when dividing the second by the first
        return second % first == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter pairs of integers (enter 0 to stop):");

        while (true) {
            System.out.print("\nEnter first integer: ");
            int num1 = input.nextInt();

            // Stop condition
            if (num1 == 0) {
                System.out.println("Program terminated.");
                break;
            }

            System.out.print("Enter second integer: ");
            int num2 = input.nextInt();

            // Call isMultiple method
            if (isMultiple(num1, num2)) {
                System.out.printf("%d is a multiple of %d.%n", num2, num1);
            } else {
                System.out.printf("%d is NOT a multiple of %d.%n", num2, num1);
            }
        }

        input.close();
    }
}
