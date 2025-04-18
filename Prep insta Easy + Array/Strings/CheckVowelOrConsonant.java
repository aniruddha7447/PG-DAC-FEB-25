public class CheckVowelOrConsonant {
    public static void checkCharacter(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }

    public static void main(String[] args) {
        checkCharacter('b');
    }
}