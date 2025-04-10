import java.util.*;

public class hybridInher1 {
    public static void main(String[] args) {
        // Animals a1 = new Animals();
        // a1.eat = "They uses to eat";
        // a1.breadth = "They uses to Breadth";
        // System.out.println(a1.eat);
        // System.out.println(a1.breadth);

        ///////////////////////////////////////////////////

        Bats b1 = new Bats();
        b1.fly();
        b1.feed();
    }
}

class Animals {
    void eat() {
        System.out.println("They uses to Eats");
    }
}

interface Birds {
    void fly();
}

interface Mammals {
    void feed();
}

class Bats extends Animals implements Birds, Mammals {
    public void fly() {
        System.out.println("They uses to fly in Sky");
    }

    public void feed() {
        System.out.println("They Uses to Feed");
    }
}