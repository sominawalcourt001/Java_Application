import java.util.Scanner;

public class QualityPoints {

    // Method to determine quality points based on student average
    public static int qualityPoints(double average) {
        if (average >= 90 && average <= 100) {
            return 4;
        } else if (average >= 80) {
            return 3;
        } else if (average >= 70) {
            return 2;
        } else if (average >= 60) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for student average
        System.out.print("Enter the student's average (0–100): ");
        double avg = input.nextDouble();

        // Get quality points
        int points = qualityPoints(avg);

        // Display result
        System.out.printf("The quality points for an average of %.2f is %d.%n", avg, points);

        input.close();
    }
}
