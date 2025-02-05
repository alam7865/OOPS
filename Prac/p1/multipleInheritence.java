import java.util.*;

public class multipleInheritence {
    public static void main(String[] args) {
        Sparrow p1 = new Sparrow();
        p1.eats();
    }
}

interface Animals {
    void eats();
}

interface Birds {
    void fly();
}

class Sparrow implements Animals, Birds {
    public void eats() {
        System.out.println("Eats small things");
    }

    public void fly() {
        System.out.println("Fly in Air");
    }
}