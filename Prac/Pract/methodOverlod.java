import java.util.*;

public class methodOverlod {
    public static void main(String[] args) {
        calculator c1 = new calculator();
        System.out.println(c1.sum(5, 15));
        System.out.println(c1.sum(5, 5, 5));
        System.out.println(c1.sum((float) 3.50, (float) 3.50));
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