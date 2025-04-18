public class FindSecondSmallest {
    public static int findSecondSmallest(int[] arr) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9, 3};
        System.out.println(findSecondSmallest(arr));
    }
}