public class FindFrequency {
    public static void findFrequency(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9, 3};
        findFrequency(arr);
    }
}