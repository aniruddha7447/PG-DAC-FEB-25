import java.util.Scanner;

public class start {

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");	
		int n1=scan.nextInt();
		System.out.println("Enter second number");
		int n2=scan.nextInt();
		System.out.println("Enter third number");
		int n3=scan.nextInt();
		
		if(n1 >= n2 && n1 >= n3)
		{
			System.out.println("n1 is greater number");	
		}
		else if(n2 >= n3 && n2 >=n1)
		{
			System.out.println("n2 is greater number");
		}
		else
		{
			System.out.println("n3 is greater number");
		}		
	}public start() {
		// TODO Auto-generated constructor stub
	}
}
