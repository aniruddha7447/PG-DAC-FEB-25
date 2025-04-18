package Practice;
import java.util.*;
public class AL_SortingAL {
	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		list.add(5);
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(6);
		Collections.sort(list);////Ascending Order
		System.out.print(list);
		System.out.println();
		Collections.sort(list,Collections.reverseOrder());///Reverse order
		System.out.print(list);
	}

}
