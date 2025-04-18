package Practice;

public class abstraction {
	public static void main(String args[]) {
		
		Horse h = new Horse();
		h.eat();
		h.walk();
		Chicken ch = new Chicken();
		ch.eat();
		ch.walk();
		
	}
	abstract static class Animal{
	void eat() {
		System.out.println("Eats");
	}
	abstract void walk();
}
	static class Horse extends Animal{
	void walk() {
		System.out.println("Walks on 4 legs");
	}
}
	static class Chicken extends Animal{
	void walk() {
		System.out.println("Walks on 2 legs");
	}
}
}
