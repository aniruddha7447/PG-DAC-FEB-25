
/*
Q6. Electricity Bill Calculation – Java Program

Design a Java program to calculate the electricity bill for a customer based on the number
of units consumed. Implement a class named ElectricityBill with the following specifications:

Class: ElectricityBill
	Instance Variables
		● customerName (String): Name of the customer
		● unitsConsumed (double): Number of electricity units consumed
		● billAmount (double): The calculated bill amount

Constructor
		● A parameterized constructor to initialize the customerName and unitsConsumed fields.

Method
		● void calculateBillAmount(): This method calculates the electricity bill amount based on the following tariff rules:
			○ First 100 units: Rs. 5 per unit
			○ Next 200 units (i.e., 101 to 300): Rs. 7 per unit
			○ Remaining units (above 300): Rs. 10 per unit

Main Program
	In the main() method:
		1. Create an object of the ElectricityBill class.
		2. Set the customerName and unitsConsumed values (can be taken from user input or hardcoded).
		3. Call the calculateBillAmount() method to compute the bill.
		4. Display the customer's name, units consumed, and final bill amount. 
*/



import java.util.*;

class ElectricityBill{
	
	private String customerName;
	private double unitsConsumed, billAmount;
	
	
	ElectricityBill(String customerName, double unitsConsumed){
		this.unitsConsumed = unitsConsumed;
		this.customerName = customerName;
	}
	
	public void calculateBillAmount(){
		billAmount = (unitsConsumed <= 100) ? (unitsConsumed*5) : (unitsConsumed <= 300) ? ((100*5) + ((unitsConsumed-100)*7)) : ((100*5+200*7) + ((unitsConsumed-300)*10));
		display();
	}
	
	public void display(){
		System.out.println("Customer Name : " + customerName);
		System.out.println("Total Units Consumed by " + customerName + " : " + unitsConsumed);
		System.out.println("Final Bill Amount : " + billAmount);
		
	}
	
}

class ElectricityBillDemo{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name : ");
		String customerName = sc.nextLine();
		
		System.out.println("Unit Consumed by you : ");
		double  unitsConsumed = sc.nextDouble();
		
		ElectricityBill eb = new ElectricityBill(customerName, unitsConsumed);
		
		eb.calculateBillAmount();
	}
}