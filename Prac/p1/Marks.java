import java.util.*;

public class Marks {
    public static void main(String args[]) {
        Markss p1 = new Markss();
        p1.Name = "sabbaj";
        p1.Name = "Sabaz";

        p1.Percentage = 78;
        System.out.println(p1.Percentage);

        p1.setName(("Kalam"));
        System.out.println(p1.Name);
    }
}

class Markss {
    String Name;
    int Age = 12;
    int Percentage;

    String getName() {
        return Name;
    }

    int getAge() {
        return Age;
    }

    int getPercentage() {
        return Percentage;
    }

    // set

    void setName(String newname) {
        Name = newname;
    }

    void setAge(int newAge) {
        Age = newAge;
    }

    void setPercentage(int newPer) {
        Percentage = newPer;
    }
}