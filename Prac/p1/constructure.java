import java.util.*;

public class constructure {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        // Displaying details of students
        student1.displayDetails();
        student2.displayDetails();

    }
}

class Student {
    String name;
    int age;

    // paratermiized constructure
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // display Method
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// class Student {
// // Instance variables
// private String name;
// private int age;

// // Parameterized constructor
// public Student(String name, int age) {
// this.name = name;
// this.age = age;
// }

// // Method to display student details
// public void displayDetails() {
// System.out.println("Name: " + name);
// System.out.println("Age: " + age);
// }
// }
