import java.util.Scanner;

public class EvenOrOdd {

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;  // true if divisible by 2, false otherwise
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integers (enter 0 to stop):");

        while (true) {
            System.out.print("\nEnter an integer: ");
            int num = input.nextInt();

            // Stop condition
            if (num == 0) {
                System.out.println("Program terminated.");
                break;
            }

            // Check and display result
            if (isEven(num)) {
                System.out.printf("%d is even.%n", num);
            } else {
                System.out.printf("%d is odd.%n", num);
            }
        }

        input.close();
    }
}
