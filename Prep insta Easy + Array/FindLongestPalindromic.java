public class FindLongestPalindromic {
    public static int findLongestPalindromic(int[] arr) {
        int maxLength = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int length = j - i + 1;
                boolean isPalindromic = true;
                for (int k = 0; k < length / 2; k++) {
                    if (arr[i + k] != arr[j - k]) {
                        isPalindromic = false;
                        break;
                    }
                }
                if (isPalindromic && length > maxLength) {
                    maxLength = length;
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9, 3};
        System.out.println(findLongestPalindromic(arr));
    }
}