package Practice;

public class GetIthBit {
	public static void GetIthBit(int n,int i) {
		int bitmask = 1<<i;
		if((n & bitmask) == 0) {
			System.out.println("Ith Bit is 0");
		}else {
			System.out.println("Ith Bit is 1");
		}
	}

	public static void main(String[] args) {
		GetIthBit(10,2);

	}

}
