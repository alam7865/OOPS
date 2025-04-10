import java.util.*;

public class hybridInher {
    public static void main(String[] args) {
        Bat b1 = new Bat();
        b1.fly();
    }
}

interface Animals {
    void eat();

    void breadth();

}

interface Birds extends Animals {
    void fly();
}

interface Mammals extends Animals {
    void Childfeed();

}

class Bat implements Birds, Mammals {

    public void eat() {
        System.out.println("They uses to Eats");
    }

    public void breadth() {
        System.out.println("They uses to Breadth");
    }

    public void fly() {
        System.out.println("They uses to Fly in Air");
    }

    public void Childfeed() {
        System.out.println("They feed their child with their milk");
    }
}