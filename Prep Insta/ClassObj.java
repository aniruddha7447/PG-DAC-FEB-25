package Practice;

public class ClassObj {

	public static void main(String[] args) {
		Pen p1 =new Pen();
		p1.setcolour("Green");
		System.out.println(p1.colour);
	}
	static class Pen{
	String colour;
	int tip;
	void setcolour(String newcolour) {
		colour = newcolour;
		
	}
	void setTip(int newtip) {
		tip = newtip;
	}
	
}
}
