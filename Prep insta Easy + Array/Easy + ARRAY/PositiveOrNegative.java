public class PositiveOrNegative {
    public static void checkNumber(int num) {
        if (num >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static void main(String[] args) {
        checkNumber(5);
    }
}