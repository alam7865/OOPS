import java.util.*;

public class copyCon {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "sabaz";
        s1.roll = 106;
        // s1.password = "alam";
        // System.out.println("Res: " + s1.roll);
        // System.out.println(s1.password);

        s1.marks[0] = 100;
        s1.marks[1] = 91;
        s1.marks[2] = 92;
        System.out.println(s1.marks[0]);
        System.out.println(s1.marks[1]);
        System.out.println(s1.marks[2]);

        ///////////////////////////////////////////////
        student s2 = new student(s1);
        // s2.password = "kalam";
        // System.out.println(s2.password);
        // // System.out.println(s2.roll);

        //////////////////////////////////////

        // s2.marks[0] = 111;
        // for (int i = 0; i < 3; i++) {
        // System.out.println(s2.marks[i]);
        // }

        s2.marks[0] = 111;
        System.out.println(s1.marks[0]);
    }
}

class student {
    String name;
    int roll;
    String password;
    // int marks[] = new int[3];
    int marks[];

    student() {
        marks = new int[3];
        System.out.println("Hello Alam Bhai");
    }

    student(String name) {
        marks = new int[3];
        this.name = name;
    }

    student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

    student(student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;

        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}