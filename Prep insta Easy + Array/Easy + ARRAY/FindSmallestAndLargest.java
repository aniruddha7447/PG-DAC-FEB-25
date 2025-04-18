public class FindSmallestAndLargest {
    public static void findSmallestAndLargest(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9, 3};
        findSmallestAndLargest(arr);
    }
}