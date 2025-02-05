import java.util.*;

public class AccessModifier {

    // public static class c1 {
    // public int x = 5;
    // protected int y = 10;
    // int z = 6;
    // private int sab = 100;

    // public void meth1() {
    // System.out.println(x);
    // System.out.println(y);
    // System.out.println(z);
    // System.out.println(sab);
    // }
    // }

    public static void main(String args[]) {
        c1 c = new c1();
        c.meth1();

        // System.out.println(c.x);
        // System.out.println(c.y);
        // System.out.println(c.z);
        // System.out.println(c.sab);

        // C1 c = new C1();
        // // c.meth1();
        // System.out.println(c.x);
        // System.out.println(c.y);
        // System.out.println(c.z);
        // System.out.println(c.a);
    }

}

class c1 {
    public int x = 5;
    protected int y = 10;
    int z = 6;
    private int sab = 100;

    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(sab);
    }
}