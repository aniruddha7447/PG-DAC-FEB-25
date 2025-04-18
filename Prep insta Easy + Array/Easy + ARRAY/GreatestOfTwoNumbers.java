public class GreatestOfTwoNumbers {
    public static int findGreatest(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(findGreatest(5, 3));
    }
}