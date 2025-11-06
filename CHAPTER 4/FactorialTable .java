public class FactorialTable {
    public static void main(String[] args) {
        System.out.printf("%-10s%-25s%n", "Number", "Factorial");
        System.out.println("--------------------------------------");

        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-10d%-25d%n", i, factorial(i));
        }
    }

    // method to calculate factorial using long
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
