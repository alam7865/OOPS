import java.util.*;

public class constructure {
    public static void main(String[] args) {
        // student s1 = new student("Sabaz");
        // System.out.println(s1.name);

        // student s2 = new student(987);
        // System.out.println(s2.roll);

        //////////// constructor without argument /////////////////////////
        student s1 = new student();

        student s2 = new student("Spider Man");
        student s3 = new student(786);

        System.out.println(s2.name);
        System.out.println(s3.roll);
    }
}

class student {
    String name;
    int roll;

    // student(String name) {
    // this.name = name;
    // }

    // student(int roll) {
    // this.roll = roll;
    // }

    // student() {
    // System.out.println("Hello GoldMan Sac");
    // }

    /////////////////////////// parameterized Constructor //////////////////////////

    student() {
        System.out.println("Hello Sabaz Alam");
    }

    // student(String name) {
    // this.name = name;
    // }

    // student(int roll) {
    // this.roll = roll;
    // }
}
