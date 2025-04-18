public class FindLargest {
    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9, 3};
        System.out.println(findLargest(arr));
    }
}