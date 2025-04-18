package Practice;

public class diagonalsum2 {
	public static int diagonalsum(int matrics [][]) {
		int sum = 0;
		for(int i=0;i<=matrics.length;i++) {
			//pd
				sum += matrics[i][i];
				if(i != matrics.length-1-i) {
				sum+=matrics[i][matrics.length-i-1];
			}
		}	
		return sum;
	}
	

	public static void main(String[] args) {
		int[][] matrics = {
	            {1,2,3,4},
	            {5,6,7,8},
	            {9,10,11,12},
	            {13,14,15,16}
	        };
		diagonalsum(matrics);

	}

}
