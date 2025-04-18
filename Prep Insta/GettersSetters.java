package Practice;

public class GettersSetters {
	static class Pen{
	private String colour;
	private int tip;
	//Getters
	String getcolour() {
		return this.colour;
	}
	int getTip() {
		return this.tip;
	}
	
	//Setters
	void setcolour(String newcolour) {
		colour = newcolour;
		
	}
	void setTip(int newtip) {
		this.tip = newtip;
	}
	
}
	public static void main(String[] args) {
		Pen p1 =new Pen();
		p1.setcolour("Green");
		System.out.println(p1.getcolour());
		p1.setTip(5);
		System.out.println(p1.getTip());
		p1.setcolour("yellow");
		
		System.out.println(p1.getcolour());
	}
}

	

