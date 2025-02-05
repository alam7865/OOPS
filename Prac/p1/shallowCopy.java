import java.util.*;

public class shallowCopy {
    public static void main(String[] args) {
        student s1 = new student();
        s1.Name = "sabaz";
        s1.Age = 21;
        s1.RollNo = 106;
        s1.marks[0] = 1;
        s1.marks[1] = 12;
        s1.marks[2] = 123;

        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i] + " ");
        }
        student s2 = new student(s1);

        s1.marks[0] = 2;
        s1.marks[1] = 22;
        s1.marks[2] = 222;
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i] + " ");
        }
        System.out.println("New S2");
        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i] + " ");
        }
    }
}

class student {
    String Name;
    int RollNo;
    int Age;
    public int marks[];

    student(student s1) {
        this.Name = s1.Name;
        this.Age = s1.Age;
        this.RollNo = s1.RollNo;
        this.marks = s1.marks;
    }

    student() {
        marks = new int[3];
        System.out.println("Hello");
    }
}
