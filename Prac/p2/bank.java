import java.util.*;

public class bank {
    public static void main(String[] args) {
        Banks p1 = new Banks();
        p1.setPassword(232323);
        System.out.println(p1.getPassword());
    }
}

class Banks {
    private String userName = "Sabaz Alam";
    private int password = 123456789;

    // get value
    int getPassword() {
        return password;
    }

    String userName() {
        return userName;
    }

    // set value;

    void setPassword(int newPassword) {
        password = newPassword;
    }

    void setuserName(String newName) {
        userName = newName;
    }
}