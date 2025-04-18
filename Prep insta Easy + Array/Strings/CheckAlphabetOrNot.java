public class CheckAlphabetOrNot {
    public static void checkCharacter(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        } else {
            System.out.println("Not an Alphabet");
        }
    }

    public static void main(String[] args) {
        checkCharacter('b');
    }
}