import java.util.Scanner;

public class DistanceBetweenPoints {

    // Method to calculate distance between two points (x1, y1) and (x2, y2)
    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy); // Euclidean distance formula
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter coordinates of the first point:");
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();

        System.out.println("Enter coordinates of the second point:");
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();

        // Calculate distance
        double dist = distance(x1, y1, x2, y2);

        // Display result
        System.out.printf("The distance between (%.2f, %.2f) and (%.2f, %.2f) is %.2f%n",
                x1, y1, x2, y2, dist);

        input.close();
    }
}
