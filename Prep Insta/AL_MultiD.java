package Practice;

import java.util.*;

public class AL_MultiD {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
		
		ArrayList<Integer>List1=new ArrayList<>();
		List1.add(2);
		List1.add(4);
		MainList.add(List1);
		
		ArrayList<Integer>List2 = new ArrayList<>();
		List2.add(1);
		List2.add(3);
		MainList.add(List2);
		
	///Printing Lists One by one 
		
		for(int i = 0; i<MainList.size(); i++) {
			ArrayList<Integer> CurrentList = MainList.get(i);
			for(int j = 0; j< CurrentList.size(); j++) {
				System.out.print(CurrentList.get(j) + " ");
			}
			System.out.println();
		}
		
	

	}

}
