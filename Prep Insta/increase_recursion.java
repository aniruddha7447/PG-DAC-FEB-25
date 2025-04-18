package Practice;

public class increase_recursion {
	public static void inc_rec(int n) {
		if(n==1) {
			System.out.println(1);
			return;
		}
		inc_rec(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		int n = 5;
		inc_rec(n);
	}

}
