public class PrimeNumbers {

    // (a) Method to check if a number is prime using upper limit n/2
    public static boolean isPrimeHalf(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false; // divisible by a number other than 1 and itself
        }
        return true;
    }

    // (a) Method to check if a number is prime using upper limit sqrt(n)
    public static boolean isPrimeSqrt(int n) {
        if (n < 2) return false;

        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int limit = 10000;

        System.out.println("Primes less than " + limit + " using n/2 method:");
        int countHalf = 0;
        for (int i = 2; i < limit; i++) {
            if (isPrimeHalf(i)) {
                System.out.print(i + " ");
                countHalf++;
            }
        }
        System.out.println("\nTotal primes found: " + countHalf);

        System.out.println("\nPrimes less than " + limit + " using sqrt(n) method:");
        int countSqrt = 0;
        for (int i = 2; i < limit; i++) {
            if (isPrimeSqrt(i)) {
                System.out.print(i + " ");
                countSqrt++;
            }
        }
        System.out.println("\nTotal primes found: " + countSqrt);
    }
}
