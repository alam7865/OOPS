import java.util.*;

public class polymorphism {
    public static void main(String[] args) {
        calculate s1 = new calculate();
        System.out.println(s1.sum((float) 2.2, (float) 3.3));
        System.out.println(s1.sum(5, 5));
        System.out.println(s1.sum(5, 5, 6));
    }
}

class calculate {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return (float) (a + b);
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
