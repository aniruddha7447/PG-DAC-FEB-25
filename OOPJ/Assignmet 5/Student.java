
import java.util.*;


class Student{
	
	private String name;
	private int rollNo;
	private char grade;
	private double marks[] = new double[5];
	private double total, average;
	
	
	Student(String name, int rollNo, double marks[]){
		this.name=name;
		this.rollNo=rollNo;
		
		for(int i = 0; i < 5; i++){
			if(marks[i] < 0 || marks[i] > 100){
				throw new IllegalArgumentException("plese enter valid marks.");
			}else{
				this.marks[i] = marks[i];
			}
		}
	}
	
	void calculateAverage(){
		total = 0;
		for(int i = 0; i < 5; i++){
			this.total += marks[i];
		}
		this.average = this.total/5;
		calculateGrade();
	}
	
	void calculateGrade(){
		this.grade = (average >= 90) ? 'A' : (average >= 80 && average < 90) ? 'B' : (average >= 70 && average < 80) ? 'C' : (average >= 60 && average < 70) ? 'D' : 'F';
		displayStudentInfo();
	}
	
	
	void displayStudentInfo(){
		System.out.println("Student Name : " + name);
		System.out.println("Student Roll Number : " + rollNo);
		System.out.println("Student Total Marks : " + total);
		System.out.printf("Average Marks : %.2f%n", average);
		System.out.println("Grade : " + grade);
	}
	
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);

		try{
		System.out.println("Enter your Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter your Roll Number : ");
		int  rollNo = sc.nextInt();
		
		double marks[] = new double[5];
		for(int i = 0; i < 5; i++){
			
			System.out.println("Enter marks for subject " + i+1 + " :");
			marks[i] = sc.nextDouble();
		}
		
		
		Student st = new Student(name, rollNo, marks);
		
		st.calculateAverage();

		}catch(IllegalArgumentException e){
			System.out.println("Please enter valid positive marks.");
		}catch(InputMismatchException e){
			System.out.println("Please enter a numeric values.");
		}finally{
			
		}
		sc.close();

}
	
}