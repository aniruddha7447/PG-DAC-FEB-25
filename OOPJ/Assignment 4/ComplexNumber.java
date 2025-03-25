
/*
Q4. Complex Number Operations

Create a class to represent complex numbers. Include the following constructors:
	1. A default constructor that sets both real and imaginary parts to 0
	2. A constructor that initializes the real part only
	3. A constructor that initializes both real and imaginary parts

Also, write member functions to:
	● Add two complex numbers
	● Multiply two complex numbers

In the main() method:
	● Create two complex numbers: 3 + 2i and 4 - 2i
	● Display their sum and product
*/



class ComplexNumber{

	private int real, imaginary;
	
	ComplexNumber(){
		this.real = 0;
		this.imaginary = 0;
	}
	
	ComplexNumber(int real){
		this.real = real;
		this.imaginary = 0;
	}
	
	ComplexNumber(int real, int imaginary){
		this.real = real;
		this.imaginary = 0;
	}
	
	
	ComplexNumber add(ComplexNumber other){
		int newreal = this.real + other.real;
		int newimaginary = this.imaginary + other.imaginary;
		return new ComplexNumber(newreal, newimaginary);
	}
	
	ComplexNumber multiply(ComplexNumber other){
		int newreal = this.real * other.real + this.imaginary * other.imaginary;
		int newimaginary = this.real * other.imaginary + this.imaginary * other.real;
		return new ComplexNumber(newreal, newimaginary);
	}
	
	
	void display(){
		System.out.println(this.real + " " + (this.imaginary >= 0 ? "+" : "-") + " " + this.imaginary + "i");
	}




	public static void main(String args[]){
		ComplexNumber num1 = new ComplexNumber(3,2);
		ComplexNumber num2 = new ComplexNumber(4,-2);
	
	
		ComplexNumber sum = num1.add(num2);
		ComplexNumber product = num1.multiply(num2);	
	
		sum.display();
		product.display();
	}
}

