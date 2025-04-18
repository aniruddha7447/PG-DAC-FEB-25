public class GreatestOfThreeNumbers {
    public static int findGreatest(int a, int b, int c) {
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }

    public static void main(String[] args) {
        System.out.println(findGreatest(5, 3, 7));
    }
}