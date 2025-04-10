import java.util.*;

public class multipleInheri {
    public static void main(String[] args) {
        Bats b1 = new Bats();
        b1.fly();
        b1.feed();
    }
}

interface Mammals {
    void feed();
}

interface Birds {
    void fly();
}

class Bats implements Mammals, Birds {
    public void feed() {
        System.out.println("They feed their Child with their Milk");
    }

    public void fly() {
        System.out.println("They uses to fly in sky");
    }
}
