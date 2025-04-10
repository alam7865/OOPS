import java.util.*;

public class static1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.school = "HCSB";
        s1.name = "sabaz";
        System.out.println(s1.school);
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int roll;
    static String school;

    String getName() {
        return name;
    }

    void setName(String newName) {
        this.name = newName;
    }
}
