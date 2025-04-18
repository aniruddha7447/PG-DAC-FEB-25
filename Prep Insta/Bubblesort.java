package Practice;

public class Bubblesort {
	public static void bubblesort(int array[]) {
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-i-1;j++) {
				
				if(array[j]>array[j+1]) {
				//swap
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]= temp;
			}
		}
	}
}    
	public static void printarr(int array[]) {
	for (int k = 0; k < array.length; k++) {
        System.out.print(array[k] + " ");
	}
	System.out.println();
	}

	public static void main(String[] args) {
		int array[]= {3,5,6,2,4,1};
		bubblesort(array);
		printarr(array);
        }
		

	}

