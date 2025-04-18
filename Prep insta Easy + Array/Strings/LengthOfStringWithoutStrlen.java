public class LengthOfStringWithoutStrlen {
    public static int getLength(String str) {
        int length = 0;
        while (str.charAt(length) != '\0') {
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(getLength("hello"));
    }
}