import java.util.*;

public class AbstractInterfac {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.move();

        Rook c1 = new Rook();
        c1.move();
    }
}

interface Chessplayer {
    void move();
}

class Queen implements Chessplayer {
    public void move() {
        System.out.println("Moves: Up, Down Left Right Diagonal");
    }
}

class Rook implements Chessplayer {
    public void move() {
        System.out.println("Moves: Up Down Left Right");
    }
}
