import java.util.*;

public class sper {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.show();
    }
}

class Parent {
    String message = "Hello From Parent";

    Parent() {
        System.out.println("Parent Constructure Called");
    }

    void show() {
        System.out.println(message);
    }
}

class Child extends Parent {
    String message = "Hello From Child";

    Child() {
        super();
        System.out.println("Child Constructure Called");
    }

    void show() {
        System.out.println(super.message);
        System.out.println(message);
    }
}
