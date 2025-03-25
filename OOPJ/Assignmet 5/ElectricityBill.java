






import java.util.*;

class ElectricityBill{
	
	private String customerName;
	private double unitsConsumed, billAmount;
	
	
	ElectricityBill(String customerName, double unitsConsumed){
		this.unitsConsumed = unitsConsumed;
		this.customerName = customerName;
	}
	
	public void calculateBillAmount(){
		if(unitsConsumed < 0){
		throw new IllegalArgumentException();
		}else{
		billAmount = (unitsConsumed <= 100) ? (unitsConsumed*5) : (unitsConsumed <= 300) ? ((100*5) + ((unitsConsumed-100)*7)) : ((100*5+200*7) + ((unitsConsumed-300)*10));
		}
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
		
		
		try{
		System.out.println("Enter your Name : ");
		String customerName = sc.nextLine();
		
		System.out.println("Unit Consumed by you : ");
		double  unitsConsumed = sc.nextDouble();

		ElectricityBill eb = new ElectricityBill(customerName, unitsConsumed);
		
		eb.calculateBillAmount();

		}catch(IllegalArgumentException e){
			System.out.println("Please enter valid positive units consumed.");
		}catch(InputMismatchException e){
			System.out.println("Please enter a numeric value for units consumed.");
		}finally{
			
		}
		sc.close();
	}
}