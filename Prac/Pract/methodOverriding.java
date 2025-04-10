import java.util.*;

public class methodOverriding {
    public static void main(String[] args) {
        // Dear d1 = new Dear();
        Animals d1 = new Animals();
        d1.eats();
    }
}

class Animals {
    void eats() {
        System.out.println("Eats Anythings");
    }
}

class Dear extends Animals {
    void eats() {
        System.out.println("Eats Grass");
    }
}
