import java.util.*;

public class paraterimizedCon {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student(121);
        student s3 = new student("Sabaz Alam");

        System.out.println(s2.Name);
    }
}

class student {
    String Name;
    int rollNumb;

    student() {
        System.out.println("Student Called");
    }

    student(int roll) {
        this.rollNumb = roll;
    }

    student(String Name) {
        this.Name = Name;
    }
}
