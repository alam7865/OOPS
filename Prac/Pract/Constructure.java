import java.util.*;

public class Constructure {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Sabaz Alam");
        Student s3 = new Student(121);
        System.out.println(s2.Name);
    }
}

class Student {
    String Name;
    int Age;

    String getName() {
        return Name;
    }

    Student() {
        System.out.println("Hello");
    }

    Student(String name) {
        this.Name = name;
    }

    Student(int age) {
        this.Age = age;
        System.out.println(age);
    }
}