import java.util.*;

public class inheritenceM {
    public static void main(String args[]) {

        //////////////// Single Inheritence ///////////////////////

        // Birds f1 = new Birds();

        // f1.eat(); // Animals Eats
        // f1.fly(); // Birds Fly in Sky

        ////////////////// Multilevel Inheritence ////////////////////
        // Chicken f1 = new Chicken();
        // f1.eat();
        // f1.breadth();
        // f1.weight();

        ////
        /////////////////// Hierarchial Inheritence /////////////////////

        // Sparrow f1 = new Sparrow();
        // f1.eat(); // Animals eats
        // f1.breadth();// Animals Breadth
        // f1.size(); // Sparrow Size is Small

        // Eagle f1 = new Eagle();
        // f1.eat();
        // f1.breadth();
        // f1.size();

        ////////
        ////////////////// Multiple Inheritence /////////////////////////

        // Bats f1 = new Bats();
        // f1.birth();
        // f1.run();
        // f1.fly();

        //////////
        ////////////////// Hierarchial Inheritence //////////////////////
        // Bats f1 = new Bats();
        // f1.eat();
        // f1.birth();

        // int sqrt = (int) Math.sqrt(5);
        // System.out.println(sqrt);
    }
}

//////////////////////////// Single Inheritence ////////////////////////
// class Animals {
// void eat() {
// System.out.println("Animals Eats");
// }
// }

// class Birds extends Animals {
// void fly() {
// System.out.println("Birds Fly in Sky");
// }
// }

////////////
//////////////////////////// Multiplelevel Inheritence ////////////////////////
// class Animals {
// void eat() {
// System.out.println("Animals eats");
// }

// void breadth() {
// System.out.println("Animal Breadth Air");
// }
// }

// class Bird extends Animals {
// void fly() {
// System.out.println("Fly in Sky");
// }
// }

// class Chicken extends Bird {
// void weight() {
// System.out.println("Chicken is Heavy");
// }
// }

/////
/////////////////// Hierarchial Inheritence /////////////////////

// class Animals {
// void eat() {
// System.out.println("Animals eats");
// }

// void breadth() {
// System.out.println("Animals Breadth");
// }
// }

// class Sparrow extends Animals {
// void size() {
// System.out.println("Sparrow Size is Small");
// }
// }

// class Eagle extends Animals {
// void size() {
// System.out.println("Eagle size is Big");
// }
// }

////////////
/////////////////////////////// Multiple Inheritence ///////////////////////
// interface Birds {
// void fly();
// }

// interface Mammals {
// void run();
// }

// class Bats implements Birds, Mammals {
// public void fly() {
// System.out.println("Fly in Air");
// }

// public void run() {
// System.out.println("Runs in Land");
// }

// void birth() {
// System.out.println("Give Birth");
// }
// }

//////////
////////////////// Hierarchial Inheritence //////////////////////

class Animals {
    void eat() {
        System.out.println("Animals eats");
    }
}

interface Birds {
    void fly();
}

interface Mammals {
    void run();
}

class Bats extends Animals implements Birds, Mammals {
    public void fly() {
        System.out.println("Birds fly in Sky");
    }

    public void run() {
        System.out.println("Walks with 4 Legs");
    }

    void birth() {
        System.out.println("Lays Eggs");
    }
}