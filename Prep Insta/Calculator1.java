package Practice;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1 :");
		int a =sc.nextInt();
		System.out.println("Enter Number 2 :");
		int b =sc.nextInt();
		System.out.println("Choose Operation :"
				+ "1. Addition "
				+ "2. Substraction "
				+ "3. Multiplication "
				+ "4. Division "
				+ "5. Modulo ");
		int operation =sc.nextInt();
		switch(operation) {
		case 1 : System.out.print("Addition is " + (a+b));
		break;
		case 2 : System.out.print("Sustraction is " + (a-b));
		break;
		case 3 : System.out.print("Multiplication is " + (a*b));
		break;
		case 4 : System.out.print("Division is " + (a/b));
		break;
		case 5 : System.out.print("Remainder is " + (a%b));
		break;
		 default :  System.out.println("Option is invalid");
		}
		
	}
}
