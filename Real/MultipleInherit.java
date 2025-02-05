import java.util.*;

public class MultipleInherit {
    public static void main(String[] args) {
        Sparrow p1 = new Sparrow();
        p1.fly();

        Queue<Node> q = new Queue<>();
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
        System.out.println("eats Nuts");
    }

    public void fly() {
        System.out.println("Fly in Air");
    }
}