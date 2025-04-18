package Practice;

public class LinearSearch {
	public static int LinearSearch(int num[],int key) {
	for(int i=0;i<num.length;i++) {
		if(num[i]==key) {
			return i;
		}
	}return -1;
	}
	
		

	public static void main(String[] args) {
	int	num[]= {2,4,6,8,10,12,14,16};
	int key = 14;
	int index =LinearSearch(num,key);
		if(index==-1) {
			System.out.println("NOT FOUND");
		}else
			System.out.println("Key is at index " + index);
	}
}
