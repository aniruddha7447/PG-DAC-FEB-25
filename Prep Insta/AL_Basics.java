package Practice;
import java.util.*;
public class AL_Basics {

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		int E = list.get(4);
		System.out.println(E);
		list.remove(2);
		System.out.println(list);
		list.set(2, 3);//it will replace element
		System.out.println(list);
		System.out.println(list.contains(50));
		list.add(5,100);//60 will not remove
		System.out.println(list);
		System.out.println(list.size());

	}

}
