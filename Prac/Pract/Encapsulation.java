import java.util.*;

public class Encapsulation {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(121);

        System.out.println(p1.getAge());
        p1.setName("Sabaz Alam");
        System.out.println(p1.getName());
    }
}

class Person {
    private String Name;
    private int Age;

    // String Name;
    // int Age;

    void setName(String newName) {
        Name = newName;
    }

    String getName() {
        return this.Name;
    }

    void setAge(int newAge) {
        Age = newAge;
    }

    int getAge() {
        return this.Age;
    }

}