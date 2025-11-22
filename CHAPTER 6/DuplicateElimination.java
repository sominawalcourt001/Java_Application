import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] unique = new int[5];  // smallest possible array
        int count = 0;              // number of unique values stored

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number (10–100): ");
            int value = input.nextInt();

            boolean duplicate = false;

            // Check if the number is already stored
            for (int j = 0; j < count; j++) {
                if (unique[j] == value) {
                    duplicate = true;
                    break;
                }
            }

            // If not a duplicate, store it
            if (!duplicate) {
                unique[count] = value;
                count++;
                System.out.println("Unique value added: " + value);
            } else {
                System.out.println("Duplicate ignored: " + value);
            }

            // Display current unique list
            System.out.print("Current unique values: ");
            for (int k = 0; k < count; k++) {
                System.out.print(unique[k] + " ");
            }
            System.out.println("\n");
        }
    }
}
