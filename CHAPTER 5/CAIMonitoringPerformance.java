import java.security.SecureRandom;
import java.util.Scanner;

public class CAIMonitoringPerformance {

    private static SecureRandom random = new SecureRandom();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Multiplication Practice Program!");
        
        while (true) {
            // Start a session for a student
            int correctCount = 0;
            int incorrectCount = 0;

            for (int i = 1; i <= 10; i++) {
                boolean correct = askQuestion();
                if (correct) {
                    correctCount++;
                } else {
                    incorrectCount++;
                }
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

            // Reset program for another student
            System.out.print("Next student? (yes/no): ");
            String response = input.next().toLowerCase();
            if (!response.equals("yes") && !response.equals("y")) {
                System.out.println("Thank you for using the program!");
                break;
            }
        }
    }

    // Method to generate one multiplication question
    public static boolean askQuestion() {
        int number1 = 1 + random.nextInt(9); // 1-9
        int number2 = 1 + random.nextInt(9); // 1-9
        int correctAnswer = number1 * number2;
        int userAnswer;

        while (true) {
            System.out.print("How much is " + number1 + " times " + number2 + "? ");
            userAnswer = input.nextInt();

            if (userAnswer == correctAnswer) {
                displayCorrectResponse();
                return true; // Question answered correctly
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
