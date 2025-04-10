import java.util.*;

public class singleIn {
    public static void main(String args[]) {
        Fish f1 = new Fish();
        f1.eat();
        f1.breadth();
        System.out.println(f1.fins);
    }
}

class Animals {
    String eat;
    String bread;

    void eat() {
        System.out.println("They uses to Eat");
    }

    void breadth() {
        System.out.println("They uses to Breadth");
    }
}

class Fish extends Animals {
    int fins = 4;
}