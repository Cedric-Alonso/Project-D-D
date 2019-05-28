import java.util.ArrayList;

public class Plateau {
    Method method = new Method();

    public Plateau(int playerId,Players players) {
        ArrayList<Square> plateau = new ArrayList<>();
//        int compteur = 0;
        for (int i = 0; i < 10; i++) {
            Square square = new Square(method.getRandom(0, 2), playerId, players);
            plateau.add(square);
//            compteur++;
        }
    }
}

