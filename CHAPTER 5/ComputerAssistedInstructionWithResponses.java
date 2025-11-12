import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstructionWithResponses {

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
                displayCorrectResponse();
                break; // Move on to next question
            } else {
                displayIncorrectResponse();
            }
        }
    }

    // Randomized responses for correct answers
    public static void displayCorrectResponse() {
        int response = 1 + random.nextInt(4); // 1-4
        switch (response) {
            case 1:
                System.out.println("Very good!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice work!");
                break;
            case 4:
                System.out.println("Keep up the good work!");
                break;
        }
    }

    // Randomized responses for incorrect answers
    public static void displayIncorrectResponse() {
        int response = 1 + random.nextInt(4); // 1-4
        switch (response) {
            case 1:
                System.out.println("No. Please try again.");
                break;
            case 2:
                System.out.println("Wrong. Try once more.");
                break;
            case 3:
                System.out.println("Don't give up! No.");
                break;
            case 4:
                System.out.println("Keep trying.");
                break;
        }
    }
}
