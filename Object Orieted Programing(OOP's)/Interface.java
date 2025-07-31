public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface chessPlayer {
    void moves();
}

class Queen implements chessPlayer {
    public void moves() {
        System.out.println("Left , Right,Up,Down,Diagonals in all dir");
    }
}

class Rook implements chessPlayer {
    public void moves() {
        System.out.println("Left , Right,Up,Down");
    }
}

class King implements chessPlayer {
    public void moves() {
        System.out.println("Left , Right,Up,Down digonal (by one move 1 )");
    }
}
