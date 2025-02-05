import java.util.*;

public class copyConstructore {
    public static void main(String args[]) {
        student s1 = new student();
        s1.name = "sabaz";
        s1.roll = 121;
        s1.password = "abcd";

        student s2 = new student(s1);

        System.out.println(s2.name);
        System.out.println(s2.roll);
        s2.password = "xyz";
        System.out.println(s2.password);
        System.out.println(s1.password);

    }
}

class student {
    String name;
    int roll;
    String password;

    student() {
        System.out.println("Constructure is Called");
    }

    student(student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }

    student(String name) {
        this.name = name;
    }

    student(int roll) {
        this.roll = roll;
    }
}
