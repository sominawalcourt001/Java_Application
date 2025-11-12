import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberWithAttempts {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("Welcome to the Guess the Number Game!");

        while (playAgain) {
            // Random number between 1 and 1000
            int numberToGuess = random.nextInt(1000) + 1;
            int guess = 0;
            int attempts = 0;

            System.out.println("\nGuess a number between 1 and 1000:");

            // Loop until the user guesses correctly
            while (guess != numberToGuess) {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number!");
                    // Provide feedback based on the number of guesses
                    if (attempts < 10) {
                        System.out.println("Either you know the secret or you got lucky!");
                    } else if (attempts == 10) {
                        System.out.println("Aha! You know the secret!");
                    } else {
                        System.out.println("You should be able to do better!");
                        System.out.println("Why should it take no more than 10 guesses?");
                        System.out.println("With each good guess, you can eliminate half of the numbers.");
                    }
                }
            }

            System.out.println("Number of attempts: " + attempts);

            // Ask the player if they want to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String response = input.next().toLowerCase();
            playAgain = response.equals("yes") || response.equals("y");
        }

        System.out.println("Thank you for playing!");
        input.close();
    }
}
