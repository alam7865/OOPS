import java.util.*;

public class hybridInherit {
    public static void main(String[] args) {
        // Bat f1 = new Bat();
        // f1.fly();
        // f1.eat();
        // f1.run();
        // f1.sleep();

        Birds f1 = new Birds();
        f1.fly();
    }
}

class Animals {
    void eat() {
        System.out.println("Animal uses to Eat");
    }
}

interface Birds {
    void fly();
}

interface Mammals {
    void run();
}

class Bat extends Animals implements Birds, Mammals {
    public void fly() {
        System.out.println("Fly in Air");
    }

    public void run() {
        System.out.println("Run in land");
    }

    void sleep() {
        System.out.println("Sleep Upside Down");
    }
}