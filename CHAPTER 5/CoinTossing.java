import java.util.Random;
import java.util.Scanner;

// Enum to represent the two sides of a coin
enum Coin {
    HEADS, TAILS
}

public class CoinTossing {

    private static Random random = new Random();

    // Method to simulate flipping the coin
    public static Coin flip() {
        return random.nextBoolean() ? Coin.HEADS : Coin.TAILS;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;

        System.out.println("Coin Tossing Simulator");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Toss Coin");
            System.out.println("2. Show Results");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    Coin result = flip();
                    System.out.println("Coin shows: " + result);
                    if (result == Coin.HEADS) {
                        headsCount++;
                    } else {
                        tailsCount++;
                    }
                    break;

                case 2:
                    System.out.println("\nResults:");
                    System.out.println("HEADS: " + headsCount);
                    System.out.println("TAILS: " + tailsCount);
                    break;

                case 3:
                    System.out.println("Exiting program.");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }
    }
}
