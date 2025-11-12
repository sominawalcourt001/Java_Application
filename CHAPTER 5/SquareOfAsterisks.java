import java.util.Scanner;

public class SquareOfAsterisks {

    // Method to display a solid square of asterisks
    public static void squareOfAsterisks(int side) {
        // Outer loop for rows
        for (int i = 0; i < side; i++) {
            // Inner loop for columns
            for (int j = 0; j < side; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the square: ");
        int side = input.nextInt();

        System.out.println("\nThe square of asterisks:\n");
        squareOfAsterisks(side);

        input.close();
    }
}
