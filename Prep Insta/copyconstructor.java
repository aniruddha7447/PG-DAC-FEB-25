package Practice;

public class copyconstructor {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Anni";
        s1.rollno = 276;
        s1.password = "ABCD";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        
        Student s2 = new Student(s1);
        s2.password = "XYZ";
        
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }

    static class Student {

        String name;
        int rollno;
        String password;
        int[] marks;

        // Copy Constructor
        Student(Student s1) {
            marks = new int[s1.marks.length];
            this.name = s1.name;
            this.rollno = s1.rollno;
            this.password = s1.password;
            for (int i = 0; i < s1.marks.length; i++) {
                this.marks[i] = s1.marks[i];
            }
        }

        Student() {
            marks = new int[3];
            System.out.println("Tatya");
        }

        Student(String name) {
            marks = new int[3];
            this.name = name;
        }

        Student(int rollno) {
            marks = new int[3];
            this.rollno = rollno;
        }
    }
}
//shallow & deep copy constructor 
//revise once
