package Practice;

public class tilingproblem {
	public static int tiling(int n) {// n is for 2 x n
		//BaseCase
		if(n == 0 || n == 1) {
			return 1;
		}
		//verical
		int fnm1 = tiling(n-1);
		//horizontal
		int fnm2 = tiling(n-2);
		
		int totaltilingways = fnm1 + fnm2 ;
		return totaltilingways;
		
	}

	public static void main(String[] args) {
		System.out.println(tiling(4));

	}

}
