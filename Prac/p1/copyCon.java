import java.util.*;

public class copyCon {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.Name = "Abdul";
        s1.Age = 22;
        s1.Password = "abc123";

        System.out.println(s1.Name);
        System.out.println(s1.Age);
        System.out.println(s1.Password);

        Student s2 = new Student(s1);
        s2.Password = "alamBhai1234567";
        System.out.println();
        System.out.println(s2.Name);
        System.out.println(s2.Age);
        System.out.println(s2.Password);
        System.out.println(s1.Password);
    }
}

class Student {
    String Name;
    int Age;
    String Password;

    String getName() {
        return Name;
    }

    int getAge() {
        return Age;
    }

    String getPassword() {
        return Password;
    }

    // assign
    Student() {
        System.out.println("hi");
    }

    Student(Student s1) {
        this.Age = s1.Age;
        this.Name = s1.Name;
        // this.Password = s1.Password;
    }

    void setPassword(String newPassword) {
        this.Password = newPassword;
    }

    void setAge(int newAge) {
        this.Age = newAge;
    }

    void setName(String newName) {
        this.Name = newName;
    }
}
