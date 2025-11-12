import java.security.SecureRandom;
import java.util.Scanner;

public class CAIArithmeticProblems {

    private static SecureRandom random = new SecureRandom();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Computer-Assisted Instruction Program!");

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

            // Ask user for type of arithmetic problem
            int problemType = 0;
            do {
                System.out.println("Select problem type:");
                System.out.println("1 = Addition");
                System.out.println("2 = Subtraction");
                System.out.println("3 = Multiplication");
                System.out.println("4 = Division");
                System.out.println("5 = Random mixture");
                System.out.print("Enter choice (1-5): ");
                problemType = input.nextInt();
                if (problemType < 1 || problemType > 5) {
                    System.out.println("Invalid choice. Enter 1-5.");
                }
            } while (problemType < 1 || problemType > 5);

            // One student session: 10 questions
            int correctCount = 0;
            int incorrectCount = 0;

            for (int i = 1; i <= 10; i++) {
                boolean correct = askQuestion(difficulty, problemType);
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

    // Generate a random number based on difficulty
    private static int generateNumber(int difficulty) {
        int maxNumber = (int) Math.pow(10, difficulty) - 1;
        int minNumber = (difficulty == 1) ? 1 : (int) Math.pow(10, difficulty - 1);
        return minNumber + random.nextInt(maxNumber - minNumber + 1);
    }

    // Ask one arithmetic question
    public static boolean askQuestion(int difficulty, int problemType) {
        int type = problemType;
        if (problemType == 5) { // random mixture
            type = 1 + random.nextInt(4); // 1-4
        }

        int number1 = generateNumber(difficulty);
        int number2 = generateNumber(difficulty);

        // Ensure no division by zero
        if (type == 4 && number2 == 0) {
            number2 = 1;
        }

        double correctAnswer = 0.0;
        String operationSymbol = "";
        switch (type) {
            case 1:
                correctAnswer = number1 + number2;
                operationSymbol = "+";
                break;
            case 2:
                correctAnswer = number1 - number2;
                operationSymbol = "-";
                break;
            case 3:
                correctAnswer = number1 * number2;
                operationSymbol = "×";
                break;
            case 4:
                correctAnswer = ((double) number1) / number2;
                operationSymbol = "÷";
                break;
        }

        double userAnswer;
        while (true) {
            System.out.print("How much is " + number1 + " " + operationSymbol + " " + number2 + "? ");
            userAnswer = input.nextDouble();

            // For division, accept answers within 0.01 tolerance
            if ((type == 4 && Math.abs(userAnswer - correctAnswer) < 0.01) || (userAnswer == correctAnswer)) {
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
