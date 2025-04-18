package Practice;

public class Interfaces {

	public static void main(String[] args) {
		Queen q = new Queen();
		q.moves();
		Rook r = new Rook();
		r.moves();
		King k =new King();
		k.moves();
		Bear b = new Bear();
		b.eats();
	}

}
interface Herbivore{
	static void eats() {
		System.out.println("Eats only veg");
	}
}
interface Carnivore{
	static void eats() {
		System.out.println("Eats only non-veg");
	}
	
}
class Bear implements Herbivore,Carnivore{
	public void eats() {
		System.out.println("Eats Both");
	}
}
interface ChessPlayer{
	void moves();	
}
class Queen implements ChessPlayer{
	public void moves() {
		System.out.println("U,D,L,R,D");
	}
}
class Rook implements ChessPlayer{
	public void moves() {
		System.out.println("U,D,L,R");
	}
}
class King implements ChessPlayer{
	public void moves() {
		System.out.println("U,D,L,R,D,(only 1 step)");
	}
}