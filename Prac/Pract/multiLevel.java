import java.util.*;

public class multiLevel {
    public static void main(String[] args) {
        Dogs d1 = new Dogs();
        d1.legs = 4;
        System.out.println(d1.legs);
    }
}

class Animals {
    void eats() {
        System.out.println("They uses to Eats");
    }

    void breadth() {
        System.out.println("They uses to Breadth");
    }
}

class Mammals extends Animals {
    int legs;
}

class Dogs extends Mammals {
    String breed;
}
