import java.util.*;

public class AllProblems {

    /*// Problem 1
    public static void problem1(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        int index = 0;
        for (int num : arr) {
            if (num != 0) arr[index++] = num;
        }
        while (index < arr.length) arr[index++] = 0;

        System.out.println("Second largest element: " + second);
        System.out.print("Array after moving zeros: ");
        System.out.println(Arrays.toString(arr));
    }

    // Problem 2
    public static void problem2(String str1, String str2, String sentence) {
        boolean isAnagram = areAnagrams(str1, str2);
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        int vowels = 0, consonants = 0;
        for (char ch : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + isAnagram);
        System.out.println("Longest word: " + longest);
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for (int c : count) if (c != 0) return false;
        return true;
    }

    // Problem 3
    public static void problem3(int[] arr, int key, int[] peakArr) {
        int index = binarySearch(arr, key);
        int first = firstOccurrence(arr, key);
        int last = lastOccurrence(arr, key);
        int count = last - first + 1;
        int peak = findPeak(peakArr);

        System.out.println("Key found at index: " + index);
        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
        System.out.println("Total count of key: " + count);
        System.out.println("Peak element: " + peak);
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static int firstOccurrence(int[] arr, int key) {
        int low = 0, high = arr.length - 1, res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                res = mid;
                high = mid - 1;
            } else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return res;
    }

    public static int lastOccurrence(int[] arr, int key) {
        int low = 0, high = arr.length - 1, res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                res = mid;
                low = mid + 1;
            } else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return res;
    }

    public static int findPeak(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if ((i == 0 || arr[i] > arr[i - 1]) &&
                (i == n - 1 || arr[i] > arr[i + 1])) {
                return arr[i];
            }
        }
        return -1;
    }*/

    // Problem 4
    public static void problem4(int num1, String str, int num2, int fibIndex, int a, int b) {
        System.out.println("Is prime: " + isPrime(num1, 2));
        System.out.println("Is '" + str + "' a palindrome? " + isPalindrome(str, 0, str.length() - 1));
        System.out.println("Sum of digits of " + num2 + ": " + sumOfDigits(num2));
        System.out.println("Fibonacci(" + fibIndex + "): " + fibonacci(fibIndex));
        System.out.println(a + "^" + b + " = " + power(a, b));
    }

    public static boolean isPrime(int n, int i) {
        if (n <= 2) return n == 2;
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start + 1, end - 1);
    }

    public static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumOfDigits(n / 10);
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int power(int a, int b) {
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }

    // Problem 5
    /*public static void problem5() {
        int count = 0;
        int n = 4;
        for (int i = 0; i < n; i++)
            for (int j = 0; j <= i; j++)
                count++;
        System.out.println("Stars printed (n=4): " + count);

        int count2 = 0;
        n = 8;
        for (int i = 1; i <= n; i *= 2)
            for (int j = 0; j < n; j++)
                count2++;
        System.out.println("Iterations in pattern (n=8): " + count2);

        System.out.print("recHalf values (n=20): ");
        recHalf(20);
        System.out.println();

        System.out.println("fun total calls (n=3): " + totalFunCalls(3));

        int iterations = 0;
        n = 3;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    iterations++;
        System.out.println("Total iterations in tripleNested(n=3): " + iterations);
    }

    public static void recHalf(int n) {
        if (n <= 0) return;
        System.out.print(n + " ");
        recHalf(n / 2);
    }

    public static int totalFunCalls(int n) {
        if (n == 0) return 1;
        return totalFunCalls(n - 1) + totalFunCalls(n - 1);
    }*/

    public static void main(String[] args) {
        int[] arr1 = {10, 0, 5, 20, 0, 8, 15};
        //problem1(arr1);

        String str1 = "listen", str2 = "silent", sentence = "Practice makes a man perfect";
        //problem2(str1, str2, sentence);

        int[] sortedArr = {1, 3, 3, 3, 5, 6, 8}, peakArr = {1, 2, 18, 4, 5, 0};
        //problem3(sortedArr, 3, peakArr);

        problem4(7, "racecar", 1234, 6, 2, 5);

       // problem5();
    }
}
