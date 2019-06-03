import java.util.ArrayList;

public class Plateau extends Square{
    private Method method = new Method();
    private ArrayList<Square> plateau = new ArrayList<>();
    private Square square;
    private int size;

    public Plateau(int playerId, Players players) {
        for (int i = 0; i < 10; i++) {
            Square square = new Square(method.getRandom(0, 2), playerId, players);
            plateau.add(square);
        }
        size = plateau.size();
    }

    public void getPlateau() {
        for (int i = 0; i < plateau.size(); i++) {
            System.out.println("Case n°" + i + "{" + square.getSquare(plateau) + "}");
        }
    }
}

