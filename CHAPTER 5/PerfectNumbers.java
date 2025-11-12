public class PerfectNumbers {

    // Method to determine if a number is perfect
    public static boolean isPerfect(int number) {
        int sum = 0;

        // Sum all factors of number (excluding the number itself)
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number; // If sum of factors equals the number, it's perfect
    }

    // Method to display factors of a number (excluding the number itself)
    public static void displayFactors(int number) {
        System.out.print("Factors: ");
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:\n");

        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " is a perfect number. ");
                displayFactors(i);
            }
        }
    }
}
