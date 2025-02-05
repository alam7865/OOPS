import java.util.*;

public class inheritence {
    public static void main(String[] args) {
        ////////////////////// Single level inheritence //////////////////////
        ///
        // Dog shiru = new Dog();
        // shiru.eat();
        // shiru.breadth();
        // shiru.walk();

        ////////////////////// Multiple level inheritence //////////////////////
        ///
        // Cow c1 = new Cow();
        // c1.feedChild();
        // c1.walk();

        ////////////////////// Hierarchial inheritence //////////////////////
        // Cow c1 = new Cow();
        // c1.eat();
        // c1.walk();

        ////////////////////// Multiple Inheritence ////////////////////////

        // Bats p1 = new Bats();
        // p1.Feed();

        ///////////////////// Hybrid Inheritence ///////////////////////////
        Bats f1 = new Bats();
        f1.Feed();
    }
}

///////////////////////////////// Single level inheritence /////////////////////
///////
///

// class Animal {
// void eat() {
// System.out.println("They Eats");
// }

// void breadth() {
// System.out.println("They Breadth Oxygen");
// }
// }

// class Dog extends Animal {
// void walk() {
// System.out.println("They Walk on 4 legs");
// }
// }

/////////////////////////////////////// Multiple level inheritence
/////////////////////////////////////// //////////////////////////
////
///
// class Animals {
// void eat() {
// System.out.println("They eats");
// }

// void breadth() {
// System.out.println("They Breadth Oxygen");
// }
// }

// class Mammals extends Animals {
// void feedChild() {
// System.out.println("They Feed their child with Their Mother Milk");
// }
// }

// class Cow extends Mammals {
// void walk() {
// System.out.println("They Walk on 4 legs");
// }
// }

///////////////////////////////////////// Hierarchial inheritence
///////////////////////////////////////// //////////////////////////

// class Animals {
// void eat() {
// System.out.println("They Eats");
// }

// void breadth() {
// System.out.println("They breadth");
// }
// }

// class Cow extends Animals {
// void walk() {
// System.out.println("They Walk on 4 legs");
// }
// }

// class Human extends Animals {
// void walk() {
// System.out.println("They Walk on 4 legs");
// }
// }

////////////////////////////////// multiple Inheritence
////////////////////////////////// ////////////////////////////////

// interface Mammals {
// void Feed();
// }

// interface Birds {
// void fly();
// }

// class Bats implements Mammals, Birds {
// public void Feed() {
// System.out.println("They Feed their child with Milk");
// }

// public void fly() {
// System.out.println("They Fly in sky");
// }
// }

/////////////////////////// Hybrid Inheritence
/////////////////////////// //////////////////////////////////

class Animals {
    void eat() {
        System.out.println("They Uses to eats");
    }

    void breadth() {
        System.out.println("They Breadth Oxygen");
    }

}

interface Mammals {
    void Feed();
}

interface Birds {
    void fly();
}

class Bats extends Animals implements Mammals, Birds {
    public void Feed() {
        System.out.println("They Feed with their Milk");
    }

    public void fly() {
        System.out.println("They Fly in Sky");
    }
}