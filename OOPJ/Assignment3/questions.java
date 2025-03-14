import java.util.HashSet;
import java.util.*;





	// Q1 Find the Largest and Smallest Element
				//Given an array, find the smallest and largest elements in it
				
class question_1{
			public static void main(String[] args){
				
			int arrInt[] = {2,10,3,4,5,6,10,25,55};
				
			int min = arrInt[0];
			int max = arrInt[0];
			
			for(int i = 0; i < arrInt.length; i++){
				
				if(arrInt[i] > max){
					
					max = arrInt[i];
				}
			}
			
			for(int i = 0; i < arrInt.length; i++){
				
				if(arrInt[i] < min){
	
					min = arrInt[i];
					
				}
			}

			System.out.println("Maximun : " + max);
			System.out.println("Minimum : " + min);
		}
}



		// Q2  Reverse an Array
			// Reverse the given array in place
class question_2{
	
	public static void main(String[] args){
		int arrInt[] = {2,10,3,4,5,6,10,25,55};
	
		System.out.print("Before Reverse:");
			
			for(int i : arrInt){
				System.out.print(i + " ");
			}
			System.out.println();
			
			
			int high = arrInt.length-1;
			int low = 0;
			
			while(low < high){
			
			arrInt[high] = arrInt[high] + arrInt[low];
			arrInt[low] = arrInt[high] - arrInt[low];
			arrInt[high] = arrInt[high] - arrInt[low];
			low++;
			high--;
			}
			
			System.out.print("After Reverse:");
			for(int i : arrInt){
				System.out.print(i + " ");
			}
	}
	
	
}



	// Q3 Find the Second Largest Element
			// Find the second-largest element in the given array.
			
class question_3{
	
	public static void main(String[] args){
		int arrInt[] = {2,10,3,4,5,6,10,25,55};
				
			System.out.print("Arry : ");
					for(int i : arrInt){
						System.out.print(i + " ");
					}
			
			System.out.println();
					
			Arrays.sort(arrInt);
			System.out.print("Second largest element : " + arrInt[arrInt.length-2]);
		}

}






	// Q4 Count Even and Odd Numbers
			// Count the number of even and odd numbers in an array
			
class question_4{
	
	public static void main(String[] args){
		int arrInt[] = {2,10,3,4,5,6,10,25,55};
		
		int even = 0, odd = 0;
		
			System.out.print("Arry : ");
					for(int i : arrInt){
						System.out.print(i + " ");
					}
			
			System.out.println();
			
			
		for( int i = 0; i < arrInt.length; i++){
			if(arrInt[i] % 2 == 0){
				even += 1;
			}
			else{
				odd += 1;
			}
		}
		System.out.println("Even Numbers : " + even);
		System.out.println("Odd Numbers : " + odd);
		
		}
			
}		



	// Q5 Find Sum and Average	
			// Compute the sum and average of all elements in the array
class question_5{
	
	public static void main(String[] args){
		int arrInt[] = {2,10,3,4,5,6,10,25,55};
		
			System.out.print("Arry : ");
					for(int i : arrInt){
						System.out.print(i + " ");
					}
			System.out.println();

			
		int sum = 0;
		for( int i = 0; i < arrInt.length; i++){
			sum += arrInt[i];
		}
		float avg = sum/arrInt.length;
		
		System.out.println("Total of all numbers : " + sum);
		System.out.println("Average of all numbers : " + avg);
	}
}



	// Q6 Remove Duplicates from a Sorted Array
			// Remove duplicate elements from a sorted array without using extra space.

	
class question_6{
	
	public static void main(String[] args){
		int arrInt[] = {2,10,3,5,5,6,2,25,55};		
			
			System.out.print("Arry : ");
				for(int i : arrInt){
					System.out.print(i + " ");
					}
			System.out.println();			
			
		int track=1;
		for(int i=1; i<arrInt.length; i++){
			if(arrInt[i]!=arrInt[i-1])
				arrInt[track++] = arrInt[i];
		}
		for(int i=track; i<arrInt.length; i++){
			if(arrInt[i]!=arrInt[i-1])
				arrInt[track++] = 0;
		}
		
		for(int j : arrInt){
					System.out.print(j + " ");
					}
				
			}
}



	// Q7 Rotate an Array		
			// Rotate the array to the right by k positions.
			
			
class question_7{
	
	public static void main(String[] args){
		int arrInt[] = {2,10,3,5,5,6,2,25,55};		
			
			
			System.out.print("Before Rotate:");
			for(int i : arrInt){
				System.out.print(i + " ");
			}
			System.out.println();


			int rotate[] = new int[arrInt.length];
			int k = 5;
			
			for(int j = 0; j < arrInt.length; j++){
				rotate[(j + k) % arrInt.length] = arrInt[j];
			}
			
			System.out.print("After Rotate:");
			for(int x : rotate){
				System.out.print(x + " ");
			}	
	}
}


	// Q8 Merge Two Sorted Arrays		
			// Merge two sorted arrays into a single sorted array without using extra space.

			
class question_8{
	
	public static void main(String[] args){
		int arrInt1[] = {2,10,3,5,5,6,2,25,55};
		int arrInt2[] = {4,55,5,2,7};

		mergesort(arrInt1, arrInt2);
		print(arrInt1);
	}
	
	public static void mergesort(int[] arrInt1, int[] arrInt2){
		int m=3, n=arrInt2.length-1, track=arrInt1.length-1;
		while(m>=0 && n>=0){
			if(arrInt1[m]>arrInt2[n])
				arrInt1[track--]=arrInt1[m--];
			else
				arrInt1[track--]=arrInt2[n--];
		}
		while(m>=0){
			arrInt1[track--]=arrInt1[m--];
		}
		while(n>=0){
			arrInt1[track--]=arrInt2[n--];
		}
	}
	
	public static void print(int[] arr){
		for(int n: arr)
			System.out.print(n + " ");
	}
}



	// 9. Find Missing Number in an Array
			// ○ Given an array of size n-1 containing numbers from 1 to n, find the missing number.

class question_9{
	
	public static void main(String[] args){
		int arrInt1[] = {2,10,3,5,5,6,2,25,55};
	
		int xor1 = 0, xor2 = 0;
		for(int i=0; i<arrInt1.length; i++){
			xor1 = xor1 ^ arrInt1[i];
		}
		for(int i=0; i<=arrInt1.length; i++){
			xor2 = xor2 ^ i;
		}
	
		System.out.println("Missing Number: " + (xor1 ^ xor2));

	}
	}	
		
	// 10. Find Intersection and Union of Two Arrays
			// ○ Find the intersection and union of two unsorted arrays.

class question_10{
	
	public static void main(String[] args){
		int arrInt1[] = {2,10,3,5,5,6,2,25,55};
		int arrInt2[] = {45,1,7,412,9,4,3,7,6,21};
		
		int res1[] = intersection(arrInt1,arrInt2);
		int res2[] = union(arrInt1,arrInt2);
		System.out.println("Intersection: ");
		for(int i : res1){
			System.out.print(i + " ");
		}
		System.out.println("\nUnion: ");
		for(int i : res2){
			System.out.print(i + " ");
		}
	}
	
	public static int[] intersection(int[] arrInt1,int[] arrInt2){
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> res = new HashSet<>();
		for(int i=0; i<arrInt1.length; i++){
				set.add(arrInt1[i]);
		}
		
		for(int i=0; i<arrInt2.length; i++){
			if(set.contains(arrInt2[i]))	
				res.add(arrInt1[i]);
		}
		
		int i=0;
		int Res[] = new int[res.size()];
		for(int n : res){
			Res[i++] = n;
		}
		return Res;
	}
	
	
	public static int[] union(int[] arrInt1,int[] arrInt2){
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<arrInt1.length; i++){
				set.add(arrInt1[i]);
		}
		
		for(int i=0; i<arrInt2.length; i++){
			set.add(arrInt2[i]);
		}
		
		int i=0;
		int Res[] = new int[set.size()];
		for(int n : set){
			Res[i++] = n;
		}
		return Res;
	}
}






	// 11. Find a Subarray with Given Sum
			// ○ Given an array of integers, find the subarray that sums to a given value S.

class question_11{
	
	public static void main(String[] args){
		int arrInt1[] = {2,10,3,5,5,6,2,25,55};


		Scanner sc = new Scanner(System.in);
		
		System.out.println(Arrays.toString(arrInt1));
		int n = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<arrInt1.length; i++){
			list.removeAll(list);
			int sum =0;
			for(int j=i; j<arrInt1.length; j++){
				sum += arrInt1[j];
				list.add(arrInt1[j]);
				if(sum==n){
					System.out.println(list.toString());
				}
			}
		}
	}
}



/*
Q12 Write a program to accept 20 integer numbers in a single Dimensional Array. Find and
Display the following:
	○ Number of even numbers.
	○ Number of odd numbers.
	○ Number of multiples of 3
*/


class question_12{
	
	public static void main(String[] args){
		
		int numbers[] = new int[20];
		getInput(numbers);
		System.out.println("Even count: " + countEven(numbers));
		System.out.println("Odd count: " + countOdd(numbers));
		multipleOfThree(numbers);	
	}
	
	
	public static void getInput(int[] arr){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an input: ");
		for (int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}	
	}
	
	public static int countEven(int[] nums){
		int count=0;
		for(int i=0; i<nums.length; i++){
			if(nums[i]%2==0){
				count++;
			}
		}
		return count;
	}
	
	public static int countOdd(int[] nums){
		int count=0;
		for(int i=0; i<nums.length; i++){
			if(nums[i]%2==1){
				count++;
			}
		}
		return count;
	}
	
	public static void multipleOfThree(int[] nums){
		for(int i=0; i<nums.length; i++){
			if(nums[i]%3==0 && nums[i] !=0)
				System.out.print(nums[i] + " ");	
		}
	}	
	
	}
		
		
		
/* 
Q13 Write a program to accept the marks in Physics, Chemistry and Maths secured by 20 class
students in a single Dimensional Array. Find and display the following:
	○ Number of students securing 75% and above in aggregate.
	○ Number of students securing 40% and below in aggregate
*/

class question_13{
	
	public static void main(String[] args){
		
		int n = 20;
		Scanner sc = new Scanner(System.in);
		int Chemistry[] = new int[n];
		int Physics[] = new int[n];
		int Maths[] = new int[n];
		for(int i=0; i<n; i++){
			System.out.print("Chemistry marks of student " + (i+1) + ": ");
			Chemistry[i] = sc.nextInt();
			System.out.print("Physics marks of student " + (i+1) + ": ");
			Physics[i] = sc.nextInt();
			System.out.print("Mathematics marks of student " + (i+1) + ": ");
			Maths[i] = sc.nextInt();
		} 
		int count1=0, count2=0;
		for(int i=0; i<n; i++){
			double avgp=((Chemistry[i]+Physics[i]+Maths[i])/300.0)*100;
			if(avgp>=75){
				count1++;
			} else if(avgp<=40){
				count2++;
			}
		}
		System.out.println(" Number of students securing 75% and above in aggregate: " + count1);
		System.out.println(" Number of students securing 40% and below in aggregate: " + count2);
	}
}

/*
Q14 Write a program in Java to accept 20 numbers in a single dimensional array arr[20]. Transfer
and store all the even numbers in an array even[ ] and all the odd numbers in another array
odd[ ]. Finally, print the elements of the even & the odd array.

*/

class question_14{
	
	public static void main(String[] args){
		int n = 20;
		Scanner sc = new Scanner(System.in);
		int[] even = new int[n];
		int[] odd = new int[n];
		int arr[] = new int[n];
		int evencount=0, oddcount=0;
		
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				even[evencount++] = arr[i];
			} else {
				odd[oddcount++] = arr[i];
			}
		}
		
		
		System.out.println("\nEven Numbers:");
		for(int i=0;i<evencount; i++){
			System.out.print(even[i] + " ");
		}
		
		System.out.println("\nOdd Numbers: ");
		for(int i=0;i<oddcount; i++){
			System.out.print(odd[i] + " ");
		}
		

	}
}



/*

Q15. Write a Java program to print all sub-arrays with 0 sum present in a given array of integers.
Example:
Input :
nums1 = { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 }
nums2 = { 1, 2, -3, 4, 5, 6 }
nums3= { 1, 2, -2, 3, 4, 5, 6 }
Output:
Sub-arrays with 0 sum : [1, 3, -7, 3]
Sub-arrays with 0 sum : [3, -7, 3, 2, 3, 1, -3, -2]
Sub-arrays with 0 sum : [1, 2, -3]
Sub-arrays with 0 sum : [2, -2]
*/


class question_15{
	
	public static void main(String[] args){
		
		int arrInt1[] = {2,1,3,5,5,6,2,5,5,-8,-2,-6,-3,-2,-5,-9,-4,-3};
		
		System.out.println(Arrays.toString(arrInt1));
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<arrInt1.length; i++){
			list.removeAll(list);
			int sum =0;
			for(int j=i; j<arrInt1.length; j++){
				sum += arrInt1[j];
				list.add(arrInt1[j]);
				if(sum==0){
					System.out.println(list.toString());
				}
			}
		}
	}
}




/*
Q16 Given two sorted arrays A and B of size p and q, write a Java program to merge elements of
A with B by maintaining the sorted order i.e. fill A with first p smallest elements and fill B
with remaining elements.
Example:
Input :
int[] A = { 1, 5, 6, 7, 8, 10 }
int[] B = { 2, 4, 9 }
Output:
Sorted Arrays:
A: [1, 2, 4, 5, 6, 7]
B: [8, 9, 10]
*/


class question_16{
	
	public static void main(String[] args){
		
		
		int[] A = {1, 5, 6, 7, 8, 10}; 
		int[] B = { 2, 4, 9 };
		int[] res = new int[A.length];
		int i = 0, j = 0, track = 0; 
		while(track<res.length){
			if(A[i]<B[j]){
				res[track++] = A[i++];
			} else {
				res[track++] = B[j++];
			}
		}
		track = 0;
		while(j<B.length){
			B[track++] = B[j++];
		}
		while(i<A.length){
			B[track++] = A[i++];
		}
		System.out.println(Arrays.toString(res));
		System.out.println(Arrays.toString(B));	
	}
}


/*
Q17 Write a Java program to find the maximum product of two integers in a given array of
integers.
Example:
Input :
nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
Output:
Pair is (7, 8), Maximum Product: 56
*/

class question_17{
	
	public static void main(String[] args){
		
int nums[] = { 2, 3, 5, 7, -7, 5, 8, -5 };
		int first=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
		int firstmin=Integer.MAX_VALUE, secondmin=Integer.MAX_VALUE;
		for(int i=0; i<nums.length; i++){
			if(nums[i]>first){
				second = first;
				first = nums[i];
			} else if(nums[i]>second){
				second = nums[i];
			}
			
			if(nums[i]<firstmin){
				secondmin = firstmin;
				firstmin = nums[i];
			} else if(nums[i]<secondmin){
				secondmin = nums[i];
			}
		}
		int prod2=firstmin * secondmin;
		int prod1=first * second;
		int maxprod = Math.max(prod1,prod2);
		
		if(prod1==maxprod)
			System.out.println("Pair is (" + first + "," + second  + "), Maximum Product: " + maxprod);
		else
			System.out.println("Pair is (" + firstmin + "," + secondmin  + "), Maximum Product: " + maxprod);
	}
}



	// Q18 Print a Matrix
			// ○ Given an m x n matrix, print all its elements row-wise 

class question_18{
	
	public static void main(String[] args){
		
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int x[] : matrix){
			for(int y : x){
			System.out.print(y + " ");
			}
			System.out.println();
		}
	}
}



	// Q19 Transpose of a Matrix
			// ○ Given a matrix, return its transpose (swap rows and columns).
			
			
class question_19{		

	public static void main(String[] args){

	int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
	int[][] transmtrx = new int[matrix1[0].length][matrix1.length];
	
	
	int rows = matrix1.length;
	int cols = matrix1[0].length;
	
	
    for (int i = 0; i < rows; i++) {
		for (int j = 0; j < cols; j++) {
            transmtrx[j][i] = matrix1[i][j];
            }
	

		}
		
		
	System.out.println("Result matrix is:");
		for(int x[] : transmtrx){
			for(int y : x){
			System.out.print(y + " ");
			}
			System.out.println();
		}
	}
}
	
	
	// Q20 Sum of Two Matrices
			// ○ Given two matrices of the same size, compute their sum.

		
	class question_20{		

	public static void main(String[] args){		
			
			
		int[][] mtrx1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] mtrx2 = {{11,21,31},{41,51,61},{71,81,91}};
		int result[][] = new int[mtrx1.length][mtrx2[0].length];	
		for(int i=0; i<mtrx1.length; i++){
			for(int j=0; j<mtrx2[i].length; j++){
				result[i][j] = 	mtrx1[i][j] + mtrx2[i][j];
			}
		}
		
		System.out.println();
		for(int i=0; i<result.length; i++){
			for(int j=0; j<result[i].length; j++){
				System.out.print(result[i][j]+ " ");
			}
			System.out.println();
		}
	}
}


	// Q21. Row-wise and Column-wise Sum
			// ○ Find the sum of each row and each column of a given matrix.

class question_21{		

	public static void main(String[] args){		
			

		int rowsum = 0, colsum = 0;
		int[][] mtrx1 = {{1,2,3},{4,5,6},{7,8,9}};	
		for(int i=0; i<mtrx1.length; i++){
			rowsum = 0; 
			colsum = 0;
			for(int j=0; j<mtrx1[i].length; j++){
				rowsum += mtrx1[i][j];
				colsum += mtrx1[j][i];
			}
			System.out.println("Row Sum: " + rowsum + "\tColumn Sum: " + colsum);
		}
	}
}	

	// Q22. Find the Maximum Element in a Matrix
			// ○ Find the largest element in a given matrix.

class question_22{		

	public static void main(String[] args){

		int max= Integer.MIN_VALUE;
		int[][] mtrx1 = {{11,21,32},{42,53,61},{17,128,32}};	
		for(int i=0; i<mtrx1.length; i++){
			for(int j=0; j<mtrx1[i].length; j++){
				max = (mtrx1[i][j]>max)? mtrx1[i][j] : max;
			}
		}
		System.out.println("Largest element: " + max);
	}
}


	// Q23. Matrix Multiplication
			// ○ Multiply two matrices and return the resultant matrix.

class question_23{		

	public static void main(String[] args){


	int[][] mtrx1 = {{1,2,3},{1,2,3},{1,2,3}};
		int[][] mtrx2 = {{1,2,3},{1,2,3},{1,2,3}};	
		int[][] res = new int[mtrx1.length][mtrx1[0].length];
		for(int i=0; i<mtrx1.length; i++){
			for(int j=0; j<mtrx1.length; j++){
				for(int k=0; k<mtrx1.length; k++){
					res[i][j] = res[i][j] + (mtrx1[i][k] + mtrx2[k][j]);
				}
			}
		}
		for(int i=0; i<res.length; i++){
			for(int j=0; j<res.length; j++){	
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}
}


	// Q24 Rotate a Matrix by 90 Degrees
			// ○ Rotate a given N x N matrix by 90 degrees clockwise.

class question_24{		

	public static void main(String[] args){

		int mtrx1[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int res[][] = new int[mtrx1.length][mtrx1[0].length];
		print(mtrx1);
		transpose(mtrx1);
		for(int i=0; i<mtrx1.length; i++)
			reverse(mtrx1[i]);
		System.out.println("-----");
		print(mtrx1);
	}
	
	public static void transpose(int[][] mtrx1){
		for(int i=0; i<mtrx1.length; i++){
			for(int j=i+1; j<mtrx1[i].length; j++){
				int temp = mtrx1[i][j];
				mtrx1[i][j] = mtrx1[j][i];
				mtrx1[j][i] = temp;
			}
		}
	}
	
	public static void reverse(int[] row){
		int low=0, high=row.length-1;
		while(low<high){
			row[high] = row[high] + row[low];
			row[low] = row[high] - row[low];
			row[high] = row[high] - row[low];
			low++;
			high--;
		}
	}
	
	public static void print(int[][] input){
		for(int i=0; i<input.length; i++){
			for(int j=0; j<input[0].length; j++){
				System.out.print(input[i][j]+ " ");
			}
			System.out.println();
		}
	}
}



	// Q25 Find the Diagonal Sum
			// ○ Compute the sum of both diagonals in a square matrix.

class questions{		

	public static void main(String[] args){

		int diagonalsum1=0;
		int diagonalsum2=0;
		int[][] mtrx1 = {{11,21,32},{42,2,61},{17,128,3}};	
		
		
		for(int i=0; i<mtrx1.length; i++){
			diagonalsum1 += mtrx1[i][i];
		}
		System.out.println("Diagonal Sum: " + diagonalsum1);
		
	
	}
}

	
			
			