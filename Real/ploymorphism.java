import java.util.*;

public class ploymorphism {
    public static void main(String[] args) {
        calculator c1 = new calculator();
        // int x=c1.sum(5,5);
        System.out.println(c1.sum(5, 5));
        System.out.println(c1.sum((float) 5.45, (float) 5.78));
    }
}

class calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
