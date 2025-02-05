import java.util.*;

public class a3Constructure {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alam");
        Student s3 = new Student(120);

    }
}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("Hello World From My Side");
    }

    Student(String ss) {
        System.out.println("Hello: " + ss);
    }

    Student(int num) {
        System.out.println("Number: " + num);
    }
}
