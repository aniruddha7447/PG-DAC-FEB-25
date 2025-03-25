
/*
Q2. Student Marks and Average

Create a class Student with the following members:
	● Name of the student
	● Marks in three subjects
	● A method to assign initial values
	● A method to compute the total and average marks
	● A method to display the student’s name and total marks
Write a main() method to demonstrate the functionality of the class. 
*/

class Student{
	
	String name;
	int mark1, mark2, mark3;
	
	
	void assignValues(String name,int mark1,int mark2,int mark3){
		this.name=name;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	
	float totalMarks(){
		float TM = (float) (mark1+mark2+mark3);
		return TM;
	}
	
	float averageMarks(){
		float AVG = (float) totalMarks()/3;
		return AVG;
	}
	
	void display(){
		System.out.println("Student Name : " + name);
		System.out.println("Total Marks : " + totalMarks());
		System.out.printf("Average Marks : %.2f", averageMarks());
	}
	
public static void main(String args[]){
	
	Student s1 = new Student();
	s1.assignValues("Vinay", 56,86,75);
	s1.display();
}
	
}