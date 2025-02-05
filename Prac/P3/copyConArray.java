import java.util.*;

public class copyConArray {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "sabaz";
        s1.roll = 121;
        s1.password = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        student s2 = new student(s1);
        s2.password = "alam";
        s2.marks[0] = 1;
        s2.marks[1] = 11;
        s2.marks[2] = 111;
        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class student {
    String name;
    int roll;
    String password;
    int marks[];

    student(student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        // this.marks = s1.marks; // shallow copy

        // ////////////// deep copy ////////////////////
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    student() {
        marks = new int[3];
        System.out.println("Hello");
    }

    student(String name) {
        marks = new int[3];
        this.name = name;
    }

    student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
