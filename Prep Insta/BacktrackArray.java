package Practice;

public class BacktrackArray {
	public static void btarr(int arr[],int i , int val) {
		//base case
		if(i==arr.length) {
			printArr(arr);
			return;
		}
		//recursion
		arr[i]=val;
		btarr(arr,i+1,val+1);
		//backtracking
		arr[i] = arr[i]-2;
	}
	public static void printArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " " );
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]=new int[5];
		btarr(arr,0,1);
		printArr(arr);
	}

}
