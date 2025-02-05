import java.util.*;

public class hybridInherit {
    public static void main(String[] args) {
        Bats f1 = new Bats();
        f1.Birth();
        f1.fly();

    }
}

class Animals {
    void eats() {
        System.out.println("They eats");
    }
}

interface Birds {
    void fly();
}

interface Mammals {
    void Birth();
}

class Bats extends Animals implements Birds, Mammals {
    public void fly() {
        System.out.println("Bats Uses to Fly");
    }

    public void Birth() {
        System.out.println("Bats uses to give Birth and feed with their Milk");
    }
}