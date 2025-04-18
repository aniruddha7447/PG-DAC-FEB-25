package Practice;

public class factorial_recursion {
	public static int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		int fnm1 = fact(n-1);//Factorial of n minus 1(fnm1)
		int fn= n * fnm1;//Factorial of n(fn)
		return fn;
	}

	public static void main(String[] args) {
		int n = 5;	
		System.out.println(fact(n));
	}

}
