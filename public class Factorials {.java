public class Factorials {
    public static void main(String[] args) {
        System.out.printf("%-10s%-25s%n", "Number", "Factorial");

        long factorial = 1;

        for (int n = 1; n <= 20; n++) {
            factorial *= n; // multiply by current number
            System.out.printf("%-10d%-25d%n", n, factorial);
        }
    }
}
