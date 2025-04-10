import java.util.*;

public class hybrid {
    public static void main(String args[]) {
        Bat b1 = new Bat();
        b1.fly();
        b1.eat();
    }
}

class Animals {
    void eat() {
        System.out.println("They uses to eats");
    }

    void breadth() {
        System.out.println("Tjey uses to Breadth");
    }
}

interface Birds {
    void fly();
}

interface Mammals {
    void birth();
}

class Bat extends Animals implements Birds, Mammals {
    public void fly() {
        System.out.println("They uses to Fly in Sky");
    }

    public void birth() {
        System.out.println("They uses to Give Birth");
    }
}
