import java.util.Random;
import java.util.Scanner;

public class CrapsWithWagering {

    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bankBalance = 1000;  // Initial bank balance

        System.out.println("Welcome to Craps! Your starting bank balance is $" + bankBalance);

        boolean playAgain = true;

        while (playAgain && bankBalance > 0) {
            // Prompt for a valid wager
            int wager = 0;
            do {
                System.out.print("Enter your wager: ");
                wager = input.nextInt();
                if (wager <= 0 || wager > bankBalance) {
                    System.out.println("Invalid wager. It must be positive and no more than your bank balance $" + bankBalance);
                }
            } while (wager <= 0 || wager > bankBalance);

            // Play one game of craps
            boolean playerWins = playCraps();

            // Adjust bank balance
            if (playerWins) {
                bankBalance += wager;
                System.out.println("You win! Your new bank balance is $" + bankBalance);
            } else {
                bankBalance -= wager;
                System.out.println("You lose. Your new bank balance is $" + bankBalance);
                if (bankBalance == 0) {
                    System.out.println("Sorry. You busted!");
                    break;
                }
            }

            // Display random chatter
            chatter();

            // Ask to play again
            if (bankBalance > 0) {
                System.out.print("Do you want to play again? (yes/no): ");
                String response = input.next().toLowerCase();
                playAgain = response.equals("yes") || response.equals("y");
            }
        }

        System.out.println("Thanks for playing! Your final bank balance is $" + bankBalance);
        input.close();
    }

    // Play a single game of craps
    public static boolean playCraps() {
        int sumOfDice = rollDice();
        int myPoint = 0;
        boolean gameStatus = false; // true if player wins, false if loses

        switch (sumOfDice) {
            case 7:
            case 11:
                gameStatus = true; // win on first roll
                break;
            case 2:
            case 3:
            case 12:
                gameStatus = false; // lose on first roll
                break;
            default:
                myPoint = sumOfDice;
                System.out.println("Point is " + myPoint);
                // Continue rolling
                while (true) {
                    sumOfDice = rollDice();
                    if (sumOfDice == myPoint) {
                        gameStatus = true; // player wins
                        break;
                    } else if (sumOfDice == 7) {
                        gameStatus = false; // player loses
                        break;
                    }
                }
                break;
        }
        return gameStatus;
    }

    // Roll two dice and display results
    public static int rollDice() {
        int die1 = 1 + random.nextInt(6);
        int die2 = 1 + random.nextInt(6);
        int sum = die1 + die2;
        System.out.println("Player rolled " + die1 + " + " + die2 + " = " + sum);
        return sum;
    }

    // Random chatter messages
    public static void chatter() {
        String[] messages = {
            "Oh, you're going for broke, huh?",
            "Aw c'mon, take a chance!",
            "You're up big. Now's the time to cash in your chips!",
            "Hmm, feeling lucky today?",
            "Don't give up yet!"
        };
        int index = random.nextInt(messages.length);
        System.out.println(messages[index]);
    }
}
