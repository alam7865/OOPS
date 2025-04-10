import java.util.*;

public class multipleInher {
    public static void main(String[] args) {
        Sparrow s1 = new Sparrow();
        s1.eat();
        s1.fly();
    }
}

interface Animals {
    void eat();
}

interface Birds {
    void fly();
}

class Sparrow implements Animals, Birds {
    public void eat() {
        System.out.println("They uses to eats");
    }

    public void fly() {
        System.out.println("They uses to Fly");
    }
}