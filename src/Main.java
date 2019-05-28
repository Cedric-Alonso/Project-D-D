import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        boolean exit;
        Game game = new Game();
        Players players = new Players();
        Menu menu = new Menu(players, game);
        menu.Intro();
        do {
            exit = menu.Choose();
        } while(!exit);
    }

}


