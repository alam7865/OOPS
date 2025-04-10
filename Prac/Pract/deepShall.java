import java.util.*;

public class deepShall {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "sabaz";
        s1.Password = "sabaz123";
        s1.Roll = 106;
        s1.marks[0] = 11;
        s1.marks[1] = 11;
        s1.marks[2] = 11;
        System.out.println(s1.marks[0] + " " + s1.marks[1] + " " + s1.marks[2]);
        // System.out.println(s1.Name);
        // System.out.println(s1.Roll);

        Student s2 = new Student(s1);
        s2.marks[0] = 5555;
        System.out.println(s2.marks[0] + " " + s2.marks[1] + " " + s2.marks[2]);
        System.out.println(s1.marks[0]);
        // System.out.println(s2.Name);
        // System.out.println(s2.Roll);
    }
}

class Student {
    String Name;
    String Password;
    int Roll;
    int marks[];

    Student() {
        marks = new int[3];
        System.out.println("S1 Constructor is called");
    }

    Student(Student s2) {
        marks = new int[3];
        this.Name = s2.Name;
        this.Password = s2.Password;
        this.Roll = s2.Roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s2.marks[i];
        }
    }
}