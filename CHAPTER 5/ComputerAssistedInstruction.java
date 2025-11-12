import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {

    private static SecureRandom random = new SecureRandom();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Multiplication Practice Program!");

        while (true) {
            askQuestion();
        }
    }

    // Method to generate a new multiplication question
    public static void askQuestion() {
        int number1 = 1 + random.nextInt(9); // 1-9
        int number2 = 1 + random.nextInt(9); // 1-9
        int correctAnswer = number1 * number2;
        int userAnswer;

        while (true) {
            System.out.print("How much is " + number1 + " times " + number2 + "? ");
            userAnswer = input.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Very good!");
                break; // Move on to next question
            } else {
                System.out.println("No. Please try again.");
            }
        }
    }
}
