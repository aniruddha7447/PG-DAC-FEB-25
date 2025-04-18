public class CalculateSum {
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9, 3};
        System.out.println(calculateSum(arr));
    }
}