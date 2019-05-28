import java.util.ArrayList;

public class Game {
//    private ArrayList<Plateau> plateau = new ArrayList<>();

    public Plateau getPlateau(int player, Players players) {
        return new Plateau(player, players);
//        return plateau;
    }
//
//    public void setPlateau(ArrayList<Plateau> plateau) {
//        this.plateau = plateau;
//    }


}
