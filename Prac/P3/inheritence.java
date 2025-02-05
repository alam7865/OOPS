import java.util.*;

public class inheritence {
    public static void main(String[] args) {
        fish f1 = new fish();
        f1.eat();
    }
}

class Animals {
    String color;

    void eat() {
        System.out.println("Eat small animals");
    }

    void breadth() {
        System.out.println("Breadth Animals");
    }
}

class fish extends Animals {
    int fins;

    void swim() {
        System.out.println("Swim in Water");
    }
}
