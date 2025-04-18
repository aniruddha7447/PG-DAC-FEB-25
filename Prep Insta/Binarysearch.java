package Practice;

public class Binarysearch {
	public static int BinarySearch(int array[],int key){
		int start =0, end = array.length-1;
		
		while(start <= end) {
			int mid = (start + end)/2 ;
			if(array[mid] == key) {
				return mid;
			}
			if(array[mid]<key) {
				start = mid +1;
			}else {
				end = mid - 1;
		}
	}		
		return -1;
	
	}
	

	public static void main(String[] args) {
		int array[]= {8,10,12,21,27,34,42};
		int key = 27;
		System.out.println("Index of Element present in array : " + BinarySearch(array, key));

	}
	
}

