import java.util.*;

public class copyCon {
    public static void main(String[] args) {
        student s1 = new student();
        s1.Name = "sabaz";
        s1.rollNo = 123;
        s1.marks[0] = 11;
        s1.marks[1] = 22;
        s1.marks[2] = 33;
        s1.print();

        student s2 = new student(s1);
        s2.Name = "Mohan Das";
        s2.rollNo = 5555;
        s1.marks[0] = 100;
        System.out.println();
        s2.print();
        s1.print();

    }
}

class student {
    String Name;
    int rollNo;
    int marks[];

    student() {
        marks = new int[3];
        System.out.println("Constructure called");
    }

    student(student s1) {
        marks = new int[3];
        this.Name = s1.Name;
        this.rollNo = s1.rollNo;
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    void print() {
        System.out.println(Name);
        System.out.println(rollNo);
        System.out.println(marks[0]);
    }
}
