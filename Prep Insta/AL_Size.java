package Practice;

import java.util.ArrayList;

public class AL_Size {
	public static void printAL(ArrayList<Integer>list) {
		for(int i =0;i<list.size();i++) {//do not use <= ---> OutOfBoud
			System.out.print(list.get(i)+ " ");
		}
	}

	public static void main(String[] args) {
		//to print the AL using the size of al 
		ArrayList<Integer>list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		printAL(list);
	}

}
