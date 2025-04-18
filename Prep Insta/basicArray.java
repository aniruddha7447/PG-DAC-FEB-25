package Practice;

public class basicArray {
	public static void update(int arr[], int nonchangeable) {
		nonchangeable = 10;
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]+1;
		}
	}

	public static void main(String[] args) {
		int nonchangeable =5;
		int arr[] = {28,34,52};
		update(arr,nonchangeable);
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i] + " ");
		}
		System.out.println(nonchangeable);
		

	}

}
