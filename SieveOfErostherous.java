public class SieveOfErostherous {
    public static void main(String[] args) {
        int n = 20;

        boolean[] isPrime = new boolean[n + 1];

        // Assume all numbers are prime initially
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Sieve
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Print primes
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}