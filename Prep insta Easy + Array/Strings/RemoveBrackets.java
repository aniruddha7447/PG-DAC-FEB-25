public class RemoveBrackets {
    public static String removeBrackets(String str) {
        return str.replaceAll("[(){}\\[\\]]", "");
    }

    public static void main(String[] args) {
        System.out.println(removeBrackets("a + b(2 + c)"));
    }
}