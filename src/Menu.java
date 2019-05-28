import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Method method = new Method();
    private Scanner sc = new Scanner(System.in);

    private Players players;
    private Game game;


    public Menu(Players players, Game game) {
        this.game = game;
        this.players = players;
        method.Select(this.players);
    }

    public void Intro() {
        System.out.println(
                "                          ,dM" + "\n" +
                        "                         dMMP" + "\n" +
                        "                        dMMM'" + "\n" +
                        "                        \\MM/" + "\n" +
                        "                        dMMm." + "\n" +
                        "                       dMMP'_\\---." + "\n" +
                        "                      _| _  p ;88;`." + "\n" +
                        "                    ,db; p >  ;8P|  `." + "\n" +
                        "                   (``T8b,__,'dP |   |" + "\n" +
                        "                   |   `Y8b..dP  ;_  |" + "\n" +
                        "                   |    |`T88P_ /  `\\;" + "\n" +
                        "                   :_.-~|d8P'`Y/    /" + "\n" +
                        "                    \\_   TP    ;   7`\\" + "\n" +
                        "         ,,__        >   `._  /'  /   `\\_" + "\n" +
                        "         `._ \"\"\"\"~~~~------|`\\;' ;     ,'" + "\n" +
                        "            \"\"\"~~~-----~~~'\\__[|;' _.-'  `\\" + "\n" +
                        "                    ;--..._     .-'-._     ;" + "\n" +
                        "                   /      /`~~\"'   ,'`\\_ ,/" + "\n" +
                        "                  ;_    /'        /    ,/" + "\n" +
                        "                  | `~-l         ;    /" + "\n" +
                        "                  `\\    ;       /\\.._|" + "\n" +
                        "                    \\    \\      \\     \\" + "\n" +
                        "                    /`---';      `----'" + "\n" +
                        "                   (     /            fsc" + "\n" +
                        "                    `---'" + "\n" +
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        "     __          ________ _      _____ ____  __  __ ______        \n" +
                        "     \\ \\        / /  ____| |    / ____/ __ \\|  \\/  |  ____|       \n" +
                        "      \\ \\  /\\  / /| |__  | |   | |   | |  | | \\  / | |__          \n" +
                        "       \\ \\/  \\/ / |  __| | |   | |   | |  | | |\\/| |  __|         \n" +
                        "        \\  /\\  /  | |____| |___| |___| |__| | |  | | |____        \n" +
                        "         \\/  \\/   |______|______\\_____\\____/|_|  |_|______|       \n" +
                        "                       |__   __/ __ \\                             \n" +
                        "                          | | | |  | |                            \n" +
                        "                          | | | |  | |                            \n" +
                        "                          | | | |__| |                            \n" +
                        " __          __     _____ |_|__\\____/       ______         _____  \n" +
                        " \\ \\        / /\\   |  __ \\ |___  /   /\\    |___  /   /\\   |  __ \\ \n" +
                        "  \\ \\  /\\  / /  \\  | |__) |   / /   /  \\      / /   /  \\  | |__) |\n" +
                        "   \\ \\/  \\/ / /\\ \\ |  _  /   / /   / /\\ \\    / /   / /\\ \\ |  _  / \n" +
                        "    \\  /\\  / ____ \\| | \\ \\  / /__ / ____ \\  / /__ / ____ \\| | \\ \\ \n" +
                        "     \\/  \\/_/    \\_\\_|  \\_\\/_____/_/    \\_\\/_____/_/    \\_\\_|  \\_\\\n" +
                        "                                                                  \n" +
                        "                                                                  ");
//        game.add(0, null);
    }

    public boolean Choose() {
        System.out.println("Menu\n" +
                "[0]Sortir\n" + "[1]Crée un personnage\n" + "[2]Voir la liste des personnage\n" + "[3]Modifier un personnage\n" + "[4]Supprimer un personnage\n" + "[5]Jouer");
        int choose = method.checkRange(0, 5);
        switch (choose) {
            case 0: {
                return Exit();
            }
            case 1: {
                players.Create();
                break;
            }
            case 2: {
                players.Show();
                break;
            }
            case 3: {
                players.Modif();
                break;
            }
            case 4: {
                players.Remove();
                break;
            }
            case 5: {
                Play();
                break;
            }
        }
        return false;
    }



//    private void Modif() {
//        boolean exitChar;
//        boolean exitStats;
//        do {
//            System.out.println("Liste de personnage a modifier:");
//            int select = method.Select(game);
//            if (select == -1) {
//                exitChar = true;
//            } else {
//                System.out.println("Modifier " + game.getPlayers().get(select).getName() + " " + game.getPlayers().get(select).getJob() + "?(y/n)");
//                if (method.TrueFalse()) {
//                    System.out.println(game.getPlayers().get(select));
//                    do {
//                        int chooseStat;
//                        System.out.println("Modifier:" + "\n" + "[0]sortir parametre\n" + "[1]nom\n" + "[2]image\n" + "[3]niveaux\n" + "[4]puissance\n" + "[5]vie\n");
//                        chooseStat = method.checkRange(0, 5);
//
//                        switch (chooseStat) {
//                            case 1: {
//                                System.out.println("nom:");
//                                String change = sc.nextLine();
//                                game.getPlayers().get(select).setName(change);
//                            }
//                            break;
//                            case 2: {
//                                System.out.println("image:");
//                                String change = sc.nextLine();
//                                game.getPlayers().get(select).setImage(change);
//                            }
//                            break;
//                            case 3: {
//                                int change;
//                                System.out.println("niveaux (pas plus de 10):");
//                                change = method.checkRange(0, 10);
//
//                                game.getPlayers().get(select).setLevel(change);
//                            }
//                            break;
//                            case 4: {
//                                int change;
//                                System.out.println("puissance (pas plus de 100):");
//                                change = method.checkRange(0, 100);
//                                game.getPlayers().get(select).setPower(change);
//                            }
//                            break;
//                            case 5: {
//                                int change;
//                                System.out.println("vie (pas plus de 100):");
//                                change = method.checkRange(0, 100);
//                                game.getPlayers().get(select).setHealth(change);
//                            }
//                            break;
//                        }
//                        System.out.println("modif de personnage finie(y/n)");
//                        exitStats = method.TrueFalse();
//                    } while (!exitStats);
//                }
//                System.out.println("modif finie(y/n)");
//                exitChar = method.TrueFalse();
//
//            }
//        } while (!exitChar);
//    }





    private boolean Exit() {
        System.out.println("Sortir(y/n)");
        return method.TrueFalse();
    }




    private void Play() {
        boolean exit;
        do {
            System.out.println("Liste de personnage pour jouer:");
            int select = method.Select(players);
            if (select == -1) {
                exit = true;
            } else {
                exit = false;
                System.out.println(game.getPlateau(select,players));
            }

//            if (game.getPlayers().size() == 0) {
//                System.out.println("Aucun personnage pour jouer");
//                exit = true;
//            } else {
//                System.out.println("jouer avec quelle personnage?");
//                System.out.println("[0]Sortir");
//                for (int i = 0; i < game.getPlayers().size(); i++) {
//                    System.out.println("[" + (i + 1) + "]" + game.getPlayers().get(i).getName() + " " + game.getPlayers().get(i).getJob());
//                }
//                int choosePlay = (method.checkRange(0, game.getPlayers().size()) - 1);
//                if (choosePlay == -1) {
//                    exit = true;
//                } else {
//                    exit = false;
//                    System.out.println("Jouer avec " + game.getPlayers().get(choosePlay).getName() + " " + game.getPlayers().get(choosePlay).getJob() + "?(y/n)");
//                    if (method.TrueFalse()) {
//                        Plateau plateau2 = new Plateau(choosePlay);
//                        System.out.println(plateau2);
//                    }
//                }
//            }
        } while (!exit);

    }
}