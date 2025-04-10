import java.lang.reflect.Constructor;
import java.util.*;

public class copyConst {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "Sabaz1";
        s1.Roll = 121;

        System.out.println(s1.getName() + " " + s1.getRoll());

        Student s2 = new Student(s1);
        s2.Name = "Mohan";
        System.out.println(s2.getName() + " " + s2.getRoll());
        System.out.println(s1.getName() + " " + s1.getRoll());
    }
}

class Student {
    String Name;
    int Roll;

    void setName(String name) {
        Name = name;
    }

    String getName() {
        return Name;
    }

    ////////////// roll
    void setRoll(int roll) {
        Roll = roll;
    }

    int getRoll() {
        return Roll;
    }

    Student() {

    }

    Student(Student s1) {
        // System.out.println(Name + " " + Roll);
        this.Name = s1.Name;
        this.Roll = s1.Roll;
    }
}