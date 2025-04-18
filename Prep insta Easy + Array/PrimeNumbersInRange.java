public class PrimeNumbersInRange {
    public static void findPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i > 1) System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        findPrimes(1, 10);
    }
}