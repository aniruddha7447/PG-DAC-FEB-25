public class RemoveVowelsFromString {
    public static String removeVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        System.out.println(removeVowels("hello"));
    }
}