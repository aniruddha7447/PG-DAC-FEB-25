public class SortByFrequency {
    public static void sortByFrequency(int[] arr) {
        int[] freq = new int[arr.length];
        int[] temp = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            freq[i] = 0;
            for (int j = 0; j < arr.length; j++) {
                if (temp[j] == arr[i]) {
                    freq[i]++;
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (freq[i] < freq[j]) {
                    int tempFreq = freq[i];
                    freq[i] = freq[j];
                    freq[j] = tempFreq;
                    int tempVal = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempVal;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9, 3};
        sortByFrequency(arr);
    }
}