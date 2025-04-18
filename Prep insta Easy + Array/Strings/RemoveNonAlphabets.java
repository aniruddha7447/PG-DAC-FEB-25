public class RemoveNonAlphabets {
    public static String removeNonAlphabets(String str) {
        return str.replaceAll("[^a-zA-Z]", "");
    }

    public static void main(String[] args) {
        System.out.println(removeNonAlphabets("hello123!"));
    }
}