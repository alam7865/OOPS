import java.util.*;

public class multipleInherit {
    public static void main(String[] args) {
        Omnivorous Animals = new Omnivorous();
        Animals.eatsMeat();
        Animals.eatsPlants();
    }
}

interface Herbivorous {
    void eatsPlants();
}

interface Carnivourous {
    void eatsMeat();
}

class Omnivorous implements Herbivorous, Carnivourous {
    public void eatsPlants() {
        System.out.println("Omnivorous Can eats Plants");
    }

    public void eatsMeat() {
        System.out.println("Omnivorous can eats Meats");
    }
}