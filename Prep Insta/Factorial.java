package Practice;

public class Factorial {

	public static void main(String[] args) {
		int n=5;
		System.out.println(factorial(n));

	}
	public static int factorial(int n) {
		int f =1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}

}
