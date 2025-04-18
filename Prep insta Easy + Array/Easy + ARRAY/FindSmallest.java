public class FindSmallest {
    public static int findSmallest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9, 3};
        System.out.println(findSmallest(arr));
    }
}