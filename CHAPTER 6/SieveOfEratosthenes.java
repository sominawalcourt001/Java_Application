public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int size = 1000;
        boolean[] isPrime = new boolean[size];

        // Step a) Initialize all elements to true
        for (int i = 2; i < size; i++) {
            isPrime[i] = true;
        }

        // Step b) Sieve algorithm
        for (int i = 2; i * i < size; i++) { // check up to sqrt(size)
            if (isPrime[i]) { // if current index is prime
                // mark all multiples of i as non-prime
                for (int j = i * i; j < size; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Display prime numbers between 2 and 999
        System.out.println("Prime numbers between 2 and 999:");
        for (int i = 2; i < size; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
