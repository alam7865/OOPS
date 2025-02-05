import java.util.*;

public class hybridInheritence {
    public static void main(String args[]) {
        // Fish f1 = new Fish();
        // f1.fins = 5;
        // // f1.eat();

        // Shark s1 = new Shark();
        // s1.Danger();

        // System.out.println();
        // Tuna t1 = new Tuna();
        // t1.sizeSpeed();

        Peacock p1 = new Peacock();
        p1.Beauty = "Very Much";
        System.out.println(p1.Beauty);
        p1.BeautiFul();

    }
}

class Animals {
    String skinColor;

    void breadth() {
        System.out.println("Animal Breadth");
    }

    void eat() {
        System.out.println("Animal Eat");
    }
}

class Fish extends Animals {
    int fins;

    void swim() {
        System.out.println("Can Swim");
    }
}

class Bird extends Animals {
    String Color;

    void fly() {
        System.out.println("Can Fly");
    }
}

class Mammals extends Animals {
    int legs;

    void walk() {
        System.out.println("Can Walk");
    }
}

class Tuna extends Fish {
    int size;

    void sizeSpeed() {
        System.out.println("Tunna Swim Fast");
    }
}

class Shark extends Fish {
    int size;

    void Danger() {
        System.out.println("Very Danger Fish");
    }
}

class Peacock extends Bird {
    String Beauty;

    void BeautiFul() {
        System.out.println("Very BeautyFul Bird");
    }
}