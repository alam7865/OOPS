import java.util.*;

public class p1oct {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // // p1.setColor("Orange");
        // p1.color = "Green";
        // System.out.println(p1.color);
        // // p1.setTip(10);
        // p1.tip = 106;
        // System.out.println(p1.tip);

        //////////////// for car ///////////////////////////
        Car c1 = new Car();
        // c1.color = "Golden";
        // c1.look = "Good";
        // c1.speed = 1000;
        // c1.wheel = 4;

        c1.setColor("Green");
        c1.setLook("Lambargony");
        c1.setSpeed(50);
        c1.setWheel(10);

        System.out.println(c1.color);
        System.out.println(c1.look);
        System.out.println(c1.speed);
        System.out.println(c1.wheel);
    }

    // public static class Pen {
    // String color;
    // int tip;

    // void setColor(String newcolor) {
    // color = newcolor;
    // }

    // void setTip(int newtip) {
    // tip = newtip;
    // }
    // }

    ////////////////////// for Car ///////////////////////
    public static class Car {
        int wheel;
        String color;
        int speed;
        String look;

        void setColor(String newColor) {
            color = newColor;
        }

        void setWheel(int newWheel) {
            wheel = newWheel;
        }

        void setSpeed(int newSpeed) {
            speed = newSpeed;
        }

        void setLook(String newLook) {
            look = newLook;
        }
    }
}
