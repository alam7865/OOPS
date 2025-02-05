import java.util.*;

public class oop1 {
    public static void main(String args[]) {
        // Pen p1 = new Pen();
        // // p1.color = "Yellow";
        // // p1.tip = 10;

        // p1.setColor("Blue");
        // p1.setTip(10);

        // System.out.println(p1.color);
        // System.out.println(p1.tip);

        ///////////////////////////////////////////////////

        student s1 = new student();
        // s1.name = "sabaz";
        // s1.age = 25;
        // s1.percentage(100, 100, 100);

        s1.setName("Mohan");
        s1.setAge(30);
        s1.percentage(50, 50, 50);

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.percentage);
    }

    public static class Pen {
        String color;
        int tip;

        void setColor(String newString) {
            color = newString;
        }

        void setTip(int newTip) {
            tip = newTip;
        }
    }

    public static class student {
        String name;
        int age;
        float percentage;

        void setName(String newName) {
            name = newName;
        }

        void setAge(int newage) {
            age = newage;
        }

        void percentage(int chem, int phy, int math) {
            percentage = (chem + phy + math) / 3;
        }
    }
}
