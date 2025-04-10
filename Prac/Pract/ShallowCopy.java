import java.util.*;

public class ShallowCopy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "sabaz";
        s1.password = "abcd";
        s1.roll = 106;

        s1.marks[0] = 1;
        s1.marks[1] = 12;
        s1.marks[2] = 15;
        System.out.println("RESULT S1");
        System.out.println();
        // System.out.println(s1.marks[0] + " " + s1.marks[1] + " " + s1.marks[2]);
        Student s2 = new Student(s1);
        System.out.println();

        s1.marks[0] = 9;
        s1.marks[1] = 9;
        s1.marks[2] = 9;
        System.out.println(s2.marks[0] + " " + s2.marks[1] + " " + s2.marks[2]);
        System.out.println(s1.marks[0] + " " + s1.marks[1] + " " + s1.marks[2]);
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    Student() {
        marks = new int[3];
        System.out.println("Hello Bhai");
    }

    Student(Student s1) {
        this.name = s1.name;
        this.password = s1.password;
        this.roll = s1.roll;

        // copy constructure
        this.marks = s1.marks;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    // Student(String password) {
    // marks = new int[3];
    // this.password = password;
    // }
}
