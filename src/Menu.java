public class Menu {
    private Method method = new Method();

    private Players players;
    private Game game;


    public Menu(Players players, Game game) {
        this.game = game;
        this.players = players;
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
//                Plateau plateau = new Plateau(select, players);
//                plateau.getPlateau();
            }
        } while (!exit);

    }
}