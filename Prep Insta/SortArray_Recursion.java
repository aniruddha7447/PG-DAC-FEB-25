package Practice;

public class SortArray_Recursion {
	public static boolean sortarr(int arr[],int i) {
	if(i==arr.length-1){   //base case
		return true;
	}
	if(arr[i]>arr[i+1]) {
		return false;
	}
	return sortarr(arr,i+1);
	
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,10,5,6,7,8};
		System.out.println(sortarr(arr,0));
	}

}
