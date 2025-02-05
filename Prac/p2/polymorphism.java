import java.util.*;

public class polymorphism {
    public static void main(String[] args) {
        Calculate c1 = new Calculate();
        c1.sum((float) 5.3, (float) 5.2);
        c1.sum(5, 5);
        c1.sum(5, 5, 5);
    }
}

class Calculate {
    void sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void sum(float a, float b) {
        System.out.println("Sum2: " + (float) (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }
}