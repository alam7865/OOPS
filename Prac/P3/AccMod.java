import java.util.*;

public class AccMod {
    public static void main(String[] args) {

        Acc cc = new Acc();
        System.out.println(cc.a);
        System.out.println(cc.b);
        System.out.println(cc.c);
        System.out.println(cc.d);
    }

    public static class Acc {
        private int a = 5;
        protected int b = 10;
        public int c = 15;
        int d = 20;

    }
}
