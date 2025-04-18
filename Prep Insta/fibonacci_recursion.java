package Practice;

public class fibonacci_recursion {
	public static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int fibN1 = fib(n-1);
		int fibN2 = fib(n-2);
		int fibN = fibN1 + fibN2;
		return fibN;
	}

	public static void main(String[] args) {
		int n = 25;
		System.out.println(fib(n));

	}

}

