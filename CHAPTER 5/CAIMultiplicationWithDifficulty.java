import java.security.SecureRandom;
import java.util.Scanner;

public class CAIMultiplicationWithDifficulty {

    private static SecureRandom random = new SecureRandom();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Multiplication Practice Program with Difficulty Levels!");

        while (true) {
            // Ask user for difficulty level
            int difficulty = 0;
            do {
                System.out.print("Enter difficulty level (1 = 1-digit, 2 = 2-digit, 3 = 3-digit, 4 = 4-digit): ");
                difficulty = input.nextInt();
                if (difficulty < 1 || difficulty > 4) {
                    System.out.println("Invalid level. Enter a number from 1 to 4.");
                }
            } while (difficulty < 1 || difficulty > 4);

            // One student session: 10 questions
            int correctCount = 0;
            int incorrectCount = 0;

            for (int i = 1; i <= 10; i++) {
                boolean correct = askQuestion(difficulty);
                if (correct) correctCount++;
                else incorrectCount++;
            }

            // Calculate percentage correct
            double percentage = (correctCount / 10.0) * 100;

            System.out.printf("You answered %d questions correctly and %d incorrectly.%n", correctCount, incorrectCount);
            System.out.printf("Your score: %.1f%% %n", percentage);

            if (percentage >= 75.0) {
                System.out.println("Congratulations, you are ready to go to the next level!");
            } else {
                System.out.println("Please ask your teacher for extra help.");
            }

            // Reset for next student
            System.out.print("Next student? (yes/no): ");
            String response = input.next().toLowerCase();
            if (!response.equals("yes") && !response.equals("y")) {
                System.out.println("Thank you for using the program!");
                break;
            }
        }
    }

    // Method to generate a new multiplication question based on difficulty
    public static boolean askQuestion(int difficulty) {
        int maxNumber = (int)Math.pow(10, difficulty) - 1; // Maximum number based on difficulty
        int minNumber = (difficulty == 1) ? 1 : (int)Math.pow(10, difficulty - 1); // Minimum number

        int number1 = minNumber + random.nextInt(maxNumber - minNumber + 1);
        int number2 = minNumber + random.nextInt(maxNumber - minNumber + 1);
        int correctAnswer = number1 * number2;
        int userAnswer;

        while (true) {
            System.out.print("How much is " + number1 + " times " + number2 + "? ");
            userAnswer = input.nextInt();

            if (userAnswer == correctAnswer) {
                displayCorrectResponse();
                return true;
            } else {
                displayIncorrectResponse();
            }
        }
    }

    // Randomized responses for correct answers
    public static void displayCorrectResponse() {
        int response = 1 + random.nextInt(4);
        switch (response) {
            case 1: System.out.println("Very good!"); break;
            case 2: System.out.println("Excellent!"); break;
            case 3: System.out.println("Nice work!"); break;
            case 4: System.out.println("Keep up the good work!"); break;
        }
    }

    // Randomized responses for incorrect answers
    public static void displayIncorrectResponse() {
        int response = 1 + random.nextInt(4);
        switch (response) {
            case 1: System.out.println("No. Please try again."); break;
            case 2: System.out.println("Wrong. Try once more."); break;
            case 3: System.out.println("Don't give up! No."); break;
            case 4: System.out.println("Keep trying."); break;
        }
    }
}
