package Practice;

public class ArrIndx_recursion {
	public static int indxarr(int arr[],int key,int i) {
		if(arr[i]==arr.length) { //if no is no present in an array
			return -1;
		}
		if(arr[i]==key) { //Base Case
			return i;
		}
	return indxarr(arr,key, i+1);//i+1 is used for checking next indexes
	}
	public static void main(String[] args) {
		int arr[]= {1,3,6,7,5,10,1};
		System.out.println(indxarr(arr,6,0));

	}

}
