import java.util.Scanner;

public class PollingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Define five social-consciousness issues
        String[] topics = {
            "Climate Change",
            "Education Reform",
            "Healthcare Access",
            "Animal Rights",
            "Poverty Reduction"
        };

        // Step 2: responses[row][column] = number of times each rating (1-10) was given
        int[][] responses = new int[topics.length][10];

        System.out.println("Welcome to the Social-Consciousness Poll!");
        System.out.println("Rate each issue from 1 (least important) to 10 (most important).");

        // Collect ratings from multiple users
        char moreUsers;
        do {
            for (int i = 0; i < topics.length; i++) {
                int rating = 0;
                do {
                    System.out.print("Rate \"" + topics[i] + "\": ");
                    rating = input.nextInt();
                } while (rating < 1 || rating > 10);
                responses[i][rating - 1]++; // store count in 2D array
            }
            System.out.print("Are there more users? (y/n): ");
            moreUsers = input.next().toLowerCase().charAt(0);
        } while (moreUsers == 'y');

        // Step 3: Display the results in a table
        System.out.println("\nPoll Results:");
        System.out.printf("%-20s", "Topic");
        for (int r = 1; r <= 10; r++) System.out.printf("%4d", r);
        System.out.printf("%8s\n", "Avg");

        int[] totals = new int[topics.length]; // total points per topic
        double[] averages = new double[topics.length];

        for (int i = 0; i < topics.length; i++) {
            System.out.printf("%-20s", topics[i]);
            int sum = 0;
            int count = 0;
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d", responses[i][j]);
                sum += responses[i][j] * (j + 1);
                count += responses[i][j];
            }
            double avg = count == 0 ? 0 : (double) sum / count;
            totals[i] = sum;
            averages[i] = avg;
            System.out.printf("%8.2f\n", avg);
        }

        // Step 4: Determine highest and lowest point totals
        int highestIndex = 0;
        int lowestIndex = 0;
        for (int i = 1; i < topics.length; i++) {
            if (totals[i] > totals[highestIndex]) highestIndex = i;
            if (totals[i] < totals[lowestIndex]) lowestIndex = i;
        }

        System.out.println("\nHighest point total:");
        System.out.println(topics[highestIndex] + " = " + totals[highestIndex] + " points");

        System.out.println("Lowest point total:");
        System.out.println(topics[lowestIndex] + " = " + totals[lowestIndex] + " points");
    }
}
