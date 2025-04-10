import java.util.*;

public class deppcopy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "sabaz";
        s1.rollNo = 12;
        s1.password = "sab123";
        s1.marks[0] = 11;
        s1.marks[1] = 12;
        s1.marks[2] = 13;

        // System.out.println(s1.name);
        // System.out.println(s1.password);
        // System.out.println(s1.rollNo);
        System.out.println(s1.marks[0] + " " + s1.marks[1] + " " + s1.marks[2] + " ");
        Student s2 = new Student(s1);
        System.out.println();
        // System.out.println(s2.name);
        // System.out.println(s2.password);
        // System.out.println(s2.rollNo);
        s2.marks[0] = 111111;
        System.out.println(s2.marks[0] + " " + s2.marks[1] + " " + s2.marks[2] + " ");
        System.out.println(s1.marks[0] + " " + s1.marks[1] + " " + s1.marks[2] + " ");
    }
}

class Student {
    String name;
    int rollNo;
    String password;
    int marks[];

    Student() {
        marks = new int[3];
        System.out.println("Student Constructure");
    }

    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.password = s1.password;
        this.rollNo = s1.rollNo;
        // this.marks = s1.marks;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
