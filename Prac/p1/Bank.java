public class Bank {
    public static void main(String args[]) {
        Banks p1 = new Banks();
        // System.out.println(p1.Password);
        p1.setPassword(456);
        System.out.println(p1.getPassword());
    }
}

class Banks {
    private int Password = 123;
    private String userName = "sabaz";

    int getPassword() {
        return Password;
    }

    String getuserName() {
        return userName;
    }

    void setPassword(int newPassword) {
        Password = newPassword;
    }

    void setuserName(String newName) {
        userName = newName;
    }
}
