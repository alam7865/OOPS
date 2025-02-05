import java.util.*;

public class deepCopy {
    public static void main(String[] args) {
        student s1 = new student();
        s1.Name = "sabaz";
        s1.RollNo = 106;

        s1.marks[0] = 2;
        s1.marks[1] = 22;
        s1.marks[2] = 222;

        for (int i = 0; i < s1.marks.length; i++) {
            System.out.print(s1.marks[i] + " ");
        }

        student s2 = new student(s1);
        s2.marks[0] = 1;
        s2.marks[1] = 11;
        s2.marks[2] = 111;
        System.out.println();
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.print(s2.marks[i] + " ");
        }

        System.out.println("ssssss");
        for (int i = 0; i < s1.marks.length; i++) {
            System.out.print(s1.marks[i] + " ");
        }
    }
}

class student {
    String Name;
    int RollNo;
    int marks[];

    student(student s1) {
        marks = new int[3];
        this.Name = s1.Name;
        this.RollNo = s1.RollNo;
        // this.marks=s1.marks; // shallow copy

        // /////////// Deep copy ///////////////////////
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    student() {
        marks = new int[3];
        System.out.println("Hello");
    }
}
