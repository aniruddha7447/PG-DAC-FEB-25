public class SumOfNumbersInRange {
    public static int calculateSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculateSum(1, 5));
    }
}