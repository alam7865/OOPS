import java.util.*;

public class GetSet {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(1000);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }

    public static class Pen {
        private String color;
        private int tip;

        String getColor() {
            return this.color;
        }

        int getTip() {
            return this.tip;
        }

        void setColor(String newColor) {
            this.color = newColor;
        }

        void setTip(int newtip) {
            this.tip = newtip;
        }

    }
}
