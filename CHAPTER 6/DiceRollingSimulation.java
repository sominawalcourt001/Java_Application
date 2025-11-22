import java.util.Random;

public class DiceRollingSimulation {
    public static void main(String[] args) {

        Random random = new Random();
        int[] tally = new int[13]; // index 0 and 1 unused; sums 2-12

        int totalRolls = 36_000_000;

        for (int i = 0; i < totalRolls; i++) {
            int die1 = 1 + random.nextInt(6); // 1 to 6
            int die2 = 1 + random.nextInt(6); // 1 to 6
            int sum = die1 + die2;

            tally[sum]++;
        }

        // Display results
        System.out.println("Sum\tFrequency\tPercentage");
        System.out.println("--------------------------------");

        for (int sum = 2; sum <= 12; sum++) {
            double percentage = (double) tally[sum] / totalRolls * 100;
            System.out.printf("%2d\t%,d\t\t%.2f%%%n", sum, tally[sum], percentage);
        }
    }
}
