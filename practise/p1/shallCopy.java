import java.util.*;

public class shallCopy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "sabaz";
        s1.roll = 106;

        s1.marks[0] = 100;
        s1.marks[1] = 101;
        s1.marks[2] = 102;

        Student s2 = new Student(s1);
        s2.marks[0] = 55;

        System.out.println(s1.marks[0]);
        System.out.println(s2.marks[0]);
    }
}

class Student {
    String name;
    int roll;
    String password;

    int marks[] = new int[3];

    Student() {
        System.out.println("Hello");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }

    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        // this.marks = s1.marks;

        // deep copy
        this.marks = new int[3];

        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}