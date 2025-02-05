import java.util.*;

public class Opps {
    public static void main(String args[]) {
        // Pen p1 = new Pen();

        // // p1.setColor("Blue");
        // // System.out.println(p1.color);
        // //////////////////////////
        // p1.color = "green";
        // System.out.println(p1.color);

        // ////////////////////////////////////
        // // p1.setTip(10);
        // p1.tip = 121;
        // System.out.println(p1.tip);

        //////////////////////////////////////////////////////////////

        // Student s1 = new Student();
        // // s1.setname("Sabaz");
        // // s1.setage(21);

        // s1.name = "Sabaz Alam";
        // s1.age = 22;
        // System.out.println(s1.name);
        // System.out.println(s1.age);

        // s1.calcPercentage(100, 100, 100);
        // System.out.println(s1.percentage);

        /////////////////////////////////////////////////////////////

        BankAccount myAcc = new BankAccount();
        myAcc.username = "sabaz";
        System.out.println(myAcc.username);
        myAcc.password = "1213";
        // myAcc.setPassword("Hello");
        System.out.println(myAcc.password);

    }

    public static class Pen {
        String color;
        int tip;

        void setColor(String newColor) {
            color = newColor;
        }

        void setTip(int newTip) {
            tip = newTip;
        }
    }

    public static class Student {
        String name;
        int age;
        float percentage;

        void setname(String newName) {
            name = newName;
        }

        void setage(int newAge) {
            age = newAge;
        }

        void calcPercentage(int phy, int chem, int math) {
            percentage = (phy + chem + math) / 3;
        }
    }

    public static class BankAccount {
        public String username;
        private String password;

        // public void setPassword(String pwd) {
        // password = pwd;
        // }

    }
}