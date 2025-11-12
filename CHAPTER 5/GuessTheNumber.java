import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("Welcome to the Guess the Number Game!");

        while (playAgain) {
            // Random number between 1 and 1000
            int numberToGuess = random.nextInt(1000) + 1;
            int guess = 0;

            System.out.println("\nGuess a number between 1 and 1000:");

            // Loop until the user guesses correctly
            while (guess != numberToGuess) {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();

                if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number!");
                }
            }

            // Ask the player if they want to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String response = input.next().toLowerCase();
            playAgain = response.equals("yes") || response.equals("y");
        }

        System.out.println("Thank you for playing!");
        input.close();
    }
}
