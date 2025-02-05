import java.util.*;

public class constOct15 {
    // public static void main(String[] args) {
    // student s1 = new student("Alam");
    // System.out.println(s1.name);

    // }

    // public static class student {
    // String name;
    // int roll;

    // student(String newname) {
    // this.name = newname;
    // }
    // }

    ///////////////// non parameter ///////////////////////

    public static void main(String[] args) {
        student s1 = new student();
        // System.out.println(s1.name);

    }

    public static class student {
        String name;
        int roll;

        student() {
            System.out.println("Hello World");
        }
    }
}
