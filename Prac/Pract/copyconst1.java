import java.util.*;

public class copyconst1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "Sabaz Alam";
        s1.Class = 12;
        s1.password = 123;
        Student s2 = new Student(s1);

        System.out.println(s2.Name);
        System.out.println(s2.Class);
        System.out.println(s2.password);
    }
}

class Student {
    String Name;
    int Class;
    int password;
    int marks[];

    Student() {
        System.out.println("S1 constructor Called");
    }

    Student(Student s1) {
        this.Name = s1.Name;
        this.Class = s1.Class;
    }
}
