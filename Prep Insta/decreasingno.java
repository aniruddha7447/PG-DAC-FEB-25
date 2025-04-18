package Practice;

import java.util.Scanner;

public class decreasingno {
	public static void decrease() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = n;i>=1;i--) {
			System.out.println(i);
		}
	} 
	public static void main(String[] args) {
		
		decrease();

	}

}
