package Practice;

public class Binomial {

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int ans = binomialCoefficient(n, r);
        System.out.println(ans);
    }

    public static int binomialCoefficient(int n, int r) {
        int nFact = factorial(n);
        int rFact = factorial(r);
        int qFact = factorial(n - r);
        return nFact / (rFact * qFact);
    }

    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
