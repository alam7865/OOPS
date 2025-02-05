import java.util.*;

public class a3CopyCon {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sabaz";
        s1.roll = 121;
        s1.password = "abcd";

        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.roll);
        s2.password = "xyz";
        System.out.println(s2.password);
    }
}

class Student {
    String name;
    int roll;
    String password;

    Student() {
        System.out.println("Hello Hello");
    }

    Student(String name) {
        System.out.println("Hello: " + name);
    }

    Student(int roll) {
        this.roll = roll;
    }

    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }
}