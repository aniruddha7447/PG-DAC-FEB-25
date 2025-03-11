// Q1: Swap Two Numbers Using Bitwise XOR
/*public class SwapNumbersXOR {
    public static void main(String[] args) {
        int a = 5, b = 10;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}

// Q2: Check Even or Odd Using Bitwise &
public class EvenOddBitwise {
    public static void main(String[] args) {
        int num = 7;
        System.out.println((num & 1) == 0 ? "Even" : "Odd");
    }
}

// Q3: Sum of Digits of an Integer
public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1234, sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}

// Q4: Check Divisibility by 3 Without % or /
public class DivisibleByThree {
    public static void main(String[] args) {
        int num = 18;
        while (num > 3) {
            num -= 3;
        }
        System.out.println(num == 3 ? "Divisible by 3" : "Not divisible by 3");
    }
}

// Q5: Swap Two Numbers Using += and -= Operators
public class SwapUsingPlusMinus {
    public static void main(String[] args) {
        int a = 10, b = 20;
        a += b;
        b = a - b;
        a -= b;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}

// Q6: Find Largest of Three Numbers Using Ternary Operator
public class LargestOfThree {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 3;
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest number: " + largest);
    }
}

// Q7: Check Leap Year Using Logical Operators
public class LeapYearCheck {
    public static void main(String[] args) {
        int year = 2024;
        System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "Leap Year" : "Not a Leap Year");
    }
}

// Q8: Check if at Least Two Booleans Are True
public class TwoTrue {
    public static void main(String[] args) {
        boolean a = true, b = false, c = true;
        System.out.println((a && b) || (b && c) || (a && c));
    }
}

// Q9: Check If Number Is in Range 20-50 Without If-Else
public class NumberInRange {
    public static void main(String[] args) {
        int num = 30;
        System.out.println(num >= 20 && num <= 50);
    }
}

// Q10: Check If a Character Is Vowel or Consonant Using Ternary Operator
public class VowelConsonant {
    public static void main(String[] args) {
        char ch = 'e';
        System.out.println((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? "Vowel" : "Consonant");
    }
}

// Q11: Check If a Number Is a Power of 2 Using Bitwise Operators
public class PowerOfTwo {
    public static void main(String[] args) {
        int num = 16;
        System.out.println((num > 0 && (num & (num - 1)) == 0) ? "Power of 2" : "Not a power of 2");
    }
}

// Q12: Multiply a Number by 8 Without * or /
public class MultiplyByEight {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(num << 3);
    }
}

// Q13: Find Absolute Value Using Bitwise Operators
public class AbsoluteValueBitwise {
    public static void main(String[] args) {
        int num = -10;
        int mask = num >> 31;
        int abs = (num + mask) ^ mask;
        System.out.println("Absolute value: " + abs);
    }
}

// Q14: Count Number of 1s in Binary Representation
public class CountSetBits {
    public static void main(String[] args) {
        int num = 29, count = 0;
        while (num > 0) {
            num &= (num - 1);
            count++;
        }
        System.out.println("Number of 1s: " + count);
    }
}

// Q15: Swap Odd and Even Bits Using Bitwise Operators
public class SwapOddEvenBits {
    public static void main(String[] args) {
        int num = 23;
        int swapped = ((num & 0xAAAAAAAA) >> 1) | ((num & 0x55555555) << 1);
        System.out.println("Swapped bits: " + swapped);
    }
}

// Q16: Determine Number Sign Using Ternary Operator
public class NumberSign {
    public static void main(String[] args) {
        int num = -5;
        System.out.println((num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero");
    }
}

// Q17: Find Minimum of Four Numbers Using Nested Ternary Operators
public class MinOfFour {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 5, d = 15;
        int min = (a < b) ? ((a < c) ? ((a < d) ? a : d) : (c < d ? c : d)) : ((b < c) ? ((b < d) ? b : d) : (c < d ? c : d));
        System.out.println("Minimum number: " + min);
    }
}

// Q18: Check Pass or Fail Using Ternary Operator
public class PassFail {
    public static void main(String[] args) {
        int percentage = 35;
        System.out.println(percentage >= 40 ? "Pass" : "Fail");
    }
}

// Q19: Check Character Type Using Ternary Operator
public class CharType {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println((ch >= 'A' && ch <= 'Z') ? "Uppercase" : (ch >= 'a' && ch <= 'z') ? "Lowercase" : "Not a Letter");
    }
}*/

// Q20: Absolute Value Using Ternary Operator
public class AbsoluteValueTernary {
    public static void main(String[] args) {
        int num = -20;
        System.out.println((num < 0) ? -num : num);
    }
}
