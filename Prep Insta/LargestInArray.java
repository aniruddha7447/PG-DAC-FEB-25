package Practice;

public class LargestInArray {
	public static int largestnum(int array[]) {
		int largest = Integer.MIN_VALUE;
		for(int i =0;i<array.length;i++) {
			if(largest < array[i]) {
			largest = array[i];
			}
		}return largest;
	}

	public static void main(String[] args) {
		int array [] = {-1,4,6,2,3};
		System.out.println("Largest number in array is " + (largestnum(array)));

	}

}
