import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    private ArrayList<Character> player = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private Control Control = new Control();
    private static int numberWar = 0;
    private static int numberMag = 0;

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
        player.add(0, null);
    }

    public boolean Choose() {
        System.out.println("Menu\n" +
                "[0]Sortir\n" + "[1]Crée un personnage\n" + "[2]Voir la liste des personnage\n" + "[3]Modifier un personnage\n" + "[4]Supprimer un personnage\n");
        int choose = Control.checkRange(0, 4);
        switch (choose) {
            case 0: {
                return Exit();
            }
            case 1: {
                Create();
            }
            break;
            case 2: {
                Show();
            }
            break;
            case 3: {
                Modif();
            }
            break;
            case 4: {
                Remove();
            }
            break;
        }
        return false;
    }

    private void Create() {
        int type;
        Character PlayerCreate;

        System.out.println("Veuillez saisir un nom :");
        String name = sc.nextLine();
        System.out.println("Veuillez saisir une image :");
        String image = sc.nextLine();
        System.out.println("Veuillez choisir votre type de personnage:" + "\n" + "[0]annuler" + "\n" +
                "[1]guerrier" + "\n" + "[2]magicien" + "\n" + "[3]super guerrier" + "\n" + "[4]super magicien");
        type = Control.checkRange(0, 5);

        switch (type) {
            case 1: {
                int weapon;
                numberWar++;
                System.out.println("choix arme:\n [1]Epée\n [2]Hache\n");
                weapon = Control.checkRange(1, 2);
                if (name.equals("")) {
                    name = "Guerrier n°" + numberWar;
                }
                System.out.println("Crée " + name + "?(y/n)");
                if (Control.TrueFalse()) {

                    PlayerCreate = new Guerrier(name, image, weapon);
                } else {
                    PlayerCreate = null;
                }
            }
            break;

            case 2: {
                int spell;
                numberMag++;
                System.out.println("choix arme:\n [1]Boule de feu\n [2]Foudre\n");
                spell = Control.checkRange(1, 2);
                if (name.equals("")) {
                    name = "Magicien n°" + numberMag;
                }
                System.out.println("Crée " + name + "?(y/n)");
                if (Control.TrueFalse()) {
                    PlayerCreate = new Magicien(name, image,spell);
                } else {
                    PlayerCreate = null;
                }
            }
            break;

            case 3: {
                numberWar++;
                int level, strength, health, weapon;
                System.out.println("niveaux (pas plus de 10):");
                level = Control.checkInt();
                System.out.println("puissance(pas plus de 100):");
                strength = Control.checkInt();
                System.out.println("santer(pas plus de 100):");
                health = Control.checkInt();
                System.out.println("choix arme:\n [1]épée\n [2]hache\n");
                weapon = Control.checkInt();
                if (name.equals("")) {
                    name = "Guerrier n°" + numberWar;
                }
                System.out.println("Crée " + name + "?(y/n)");
                if (Control.TrueFalse()) {
                    if (level <= 10 && strength <= 100 && health <= 100) {
                        PlayerCreate = new Guerrier(name, image, level, strength, health, weapon);

                    } else {
                        PlayerCreate = new Guerrier(name, image, 0, 1, 1, 0);
                    }
                } else {
                    PlayerCreate = null;
                }
                break;
            }

            case 4: {
                numberMag++;
                int level, strength, health, spell;
                System.out.println("niveaux (pas plus de 10):");
                level = Control.checkInt();
                System.out.println("puissance(pas plus de 100):");
                strength = Control.checkInt();
                System.out.println("santer(pas plus de 100):");
                health = Control.checkInt();
                System.out.println("choix arme:\n [1]Boule de feu\n [2]Foudre\n");
                spell = Control.checkRange(1, 2);
                if (name.equals("")) {
                    name = "Magicien n°" + numberMag;
                }
                System.out.println("Crée " + name + "?(y/n)");
                if (Control.TrueFalse()) {
                    if (level <= 10 && strength <= 100 && health <= 100) {
                        PlayerCreate = new Magicien(name, image, level, strength, health, spell);
                    } else {
                        PlayerCreate = new Magicien(name, image, 0, 1, 1, 0);
                    }
                } else {
                    PlayerCreate = null;
                }
                break;
            }

            case 5: {
                PlayerCreate = new Default();
                break;
            }

            default:
                PlayerCreate = null;
                break;

        }
        if (PlayerCreate != null) {
            System.out.println(PlayerCreate.showProfil());
            player.add(PlayerCreate);
        }
    }


    private void Modif() {
        boolean exitChar;
        boolean exitStats;
        do {
            if (player.size() == 1) {
                System.out.println("Aucun personnage a modifier");
                exitChar = true;
            } else {
                System.out.println("Quelle personnage?");
                int chooseChar;
                for (int i = 1; i < player.size(); i++) {
                    System.out.println("[" + i + "]" + player.get(i).getName() + " " + player.get(i).getJob());
                }
                chooseChar = Control.checkRange(1, player.size());
                System.out.println("Modifier " + player.get(chooseChar).getName() + " " + player.get(chooseChar).getJob() + "?(y/n)");
                if (Control.TrueFalse()) {

                    System.out.println(player.get(chooseChar));
                    do {
                        int chooseStat;
                        System.out.println("Modifier:" + "\n" + "[0]sortir parametre\n" + "[1]nom\n" + "[2]image\n" + "[3]niveaux\n" + "[4]puissance\n" + "[5]vie\n");
                        chooseStat = Control.checkRange(0, 5);

                        switch (chooseStat) {
                            case 1: {
                                System.out.println("nom:");
                                String change = sc.nextLine();
                                player.get(chooseChar).setName(change);
                            }
                            break;
                            case 2: {
                                System.out.println("image:");
                                String change = sc.nextLine();
                                player.get(chooseChar).setImage(change);
                            }
                            break;
                            case 3: {
                                int change;
                                System.out.println("niveaux (pas plus de 10):");
                                change = Control.checkRange(0, 10);

                                player.get(chooseChar).setLevel(change);
                            }
                            break;
                            case 4: {
                                int change;
                                System.out.println("puissance (pas plus de 100):");
                                change = Control.checkRange(0, 100);
                                player.get(chooseChar).setPower(change);
                            }
                            break;
                            case 5: {
                                int change;
                                System.out.println("vie (pas plus de 100):");
                                change = Control.checkRange(0, 100);
                                player.get(chooseChar).setHealth(change);
                            }
                            break;
                        }
                        System.out.println("modif de personnage finie(y/n)");
                        exitStats = Control.TrueFalse();
                    } while (!exitStats);
                }
                System.out.println("modif finie(y/n)");
                exitChar = Control.TrueFalse();

            }
        } while (!exitChar);
    }


    private void Show() {
        System.out.println("liste personnage:");
        if (player.size() == 1) {
            System.out.println("Aucun personnage");
        } else {
            for (int i = 1; i < player.size(); i++) {
                System.out.println(player.get(i));
            }
        }
    }

    public int getRandom(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private boolean Exit() {
        System.out.println("Sortir(y/n)");
        return Control.TrueFalse();
    }

    public Arme ChooseArme(int id) {
        Arme armes[] = Armes();
        return armes[id];
    }


    private Arme[] Armes() {
        Arme[] armes = new Arme[3];
        armes[0] = new Arme("Hochet", 1);
        armes[1] = new Arme("Epée", 10);
        armes[2] = new Arme("Hache", 15);
        return armes;
    }

    public Spell ChooseSpell(int id) {
        Spell spells[] = Spells();
        return spells[id];
    }


    private Spell[] Spells() {
        Spell[] spells = new Spell[3];
        spells[0] = new Spell("Bulle de savon", 1);
        spells[1] = new Spell("Boule de feu", 10);
        spells[2] = new Spell("Foudre", 15);
        return spells;
    }

    private void Remove() {
        boolean exit;
        do {
            if (player.size() == 1) {
                System.out.println("Aucun personnage a supprimer");
                exit = true;
            } else {
                System.out.println("Quelle personnage?");
                for (int i = 1; i < player.size(); i++) {
                    System.out.println("[" + i + "]" + player.get(i).getName() + " " + player.get(i).getJob());
                }
                int chooseChar = Control.checkRange(1, player.size());
                System.out.println("Supprimer " + player.get(chooseChar).getName() + " " + player.get(chooseChar).getJob() + "?(y/n)");
                if (Control.TrueFalse()) {
                    player.remove(chooseChar);
                }
                System.out.println("Suppresion terminer(y/n)");
                exit = Control.TrueFalse();
            }
        } while (!exit);
    }
}

//    public

//}
