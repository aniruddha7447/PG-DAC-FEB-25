public class SumOfFirstNNaturalNumbers {
    public static int calculateSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(calculateSum(5));
    }
}