import java.util.*;

public class methodOverriding {
    public static void main(String[] args) {
        AdvCal p1 = new AdvCal();
        System.out.println(p1.add(5, 5));
    }
}

class cal {
    int add(int a, int b) {
        return a + b;
    }
}

class AdvCal extends cal {
    // int add(int a, int b) {
    // return a + b + 1;
    // }
}
