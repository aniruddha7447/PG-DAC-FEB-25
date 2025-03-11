public class DoubleToInt {
    public static void main(String[] args) {
        double num = 99.99;
        int convertedNum = (int) num; // Explicit narrowing

        System.out.println("Original double value: " + num);
        System.out.println("Converted to int: " + convertedNum);
    }
}
