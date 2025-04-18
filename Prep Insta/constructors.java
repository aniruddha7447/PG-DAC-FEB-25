/*
 * package Practice;
 * 
 * public class constructors {
 * 
 * public static void main(String[] args) { Student s1 = new Student("Anni",5);
 * System.out.println(s1.name,s1.rollno); } } class Student{ String name; int
 * rollno; Student(String name, int rollno){ this.name = name; this.rollno =
 * rollno; } }
 */
package Practice;

public class constructors {

    public static void main(String[] args) {
        Student s1 = new Student("Anni",10);//Parameterized constructors
        System.out.println(("Name: " + s1.name)+"  " + ( "Roll_no : " + s1.roll_no));
        //or
        Tatya t1 = new Tatya();//non parameterized constructors
    }
    
}

class Student {
	String name1;
    String name;
    int roll_no;

    Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }
    Student(String name1){
    	this.name1=name1;
    	
    }
    Student(int roll_no){
    	this.roll_no=roll_no;
    }
    
}
class Tatya{
	Tatya(){
		System.out.println("Bham Bhole");
	}
}
//tatya(),student()like these are constructors
