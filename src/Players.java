import java.util.ArrayList;
import java.util.Scanner;

public class Players {
    private Method method = new Method();
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Character> players = new ArrayList<>();

    public ArrayList<Character> getPlayers() {
        return players;
    }



    public void Create() {
        int numberWar = 0, numberMag = 0;
        int type;
        Character PlayerCreate;

        System.out.println("Veuillez saisir un nom :");
        String name = sc.nextLine();
        System.out.println("Veuillez saisir une image :");
        String image = sc.nextLine();
        System.out.println("Veuillez choisir votre type de personnage:" + "\n" + "[0]annuler" + "\n" +
                "[1]guerrier" + "\n" + "[2]magicien" + "\n" + "[3]super guerrier" + "\n" + "[4]super magicien");
        type = method.checkRange(0, 5);

        switch (type) {
            case 1: {
                int weapon;
                System.out.println("choix arme:\n [1]Epée\n [2]Hache\n");
                weapon = method.checkRange(1, 2);
                if (name.equals("")) {
                    numberWar++;
                    name = "Guerrier n°" + numberWar;
                }
                System.out.println("Crée " + name + "?(y/n)");
                if (method.TrueFalse()) {

                    PlayerCreate = new Warrior(name, image, weapon);
                } else {
                    PlayerCreate = null;
                }
            }
            break;

            case 2: {
                int spell;
                System.out.println("choix arme:\n [1]Boule de feu\n [2]Foudre\n");
                spell = method.checkRange(1, 2);
                if (name.equals("")) {
                    numberMag++;
                    name = "Magicien n°" + numberMag;
                }
                System.out.println("Crée " + name + "?(y/n)");
                if (method.TrueFalse()) {
                    PlayerCreate = new Magician(name, image, spell);
                } else {
                    PlayerCreate = null;
                }
            }
            break;

            case 3: {
                int level, strength, health, weapon;
                System.out.println("niveaux (pas plus de 10):");
                level = method.checkInt();
                System.out.println("puissance(pas plus de 100):");
                strength = method.checkInt();
                System.out.println("santer(pas plus de 100):");
                health = method.checkInt();
                System.out.println("choix arme:\n [1]épée\n [2]hache\n");
                weapon = method.checkInt();
                if (name.equals("")) {
                    numberWar++;
                    name = "Guerrier n°" + numberWar;
                }
                System.out.println("Crée " + name + "?(y/n)");
                if (method.TrueFalse()) {
                    if (level <= 10 && strength <= 100 && health <= 100) {
                        PlayerCreate = new Warrior(name, image, level, strength, health, weapon);

                    } else {
                        PlayerCreate = new Warrior(name, image, 0, 1, 1, 0);
                    }
                } else {
                    PlayerCreate = null;
                }
                break;
            }

            case 4: {
                int level, strength, health, spell;
                System.out.println("niveaux (pas plus de 10):");
                level = method.checkInt();
                System.out.println("puissance(pas plus de 100):");
                strength = method.checkInt();
                System.out.println("santer(pas plus de 100):");
                health = method.checkInt();
                System.out.println("choix arme:\n [1]Boule de feu\n [2]Foudre\n");
                spell = method.checkRange(1, 2);
                if (name.equals("")) {
                    numberMag++;
                    name = "Magicien n°" + numberMag;
                }
                System.out.println("Crée " + name + "?(y/n)");
                if (method.TrueFalse()) {
                    if (level <= 10 && strength <= 100 && health <= 100) {
                        PlayerCreate = new Magician(name, image, level, strength, health, spell);
                    } else {
                        PlayerCreate = new Magician(name, image, 0, 1, 1, 0);
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
            players.add(PlayerCreate);
        }
    }

    public void Modif() {
        boolean exitChar;
        boolean exitStats;
        do {
            System.out.println("Liste de personnage a modifier:");
            int select = method.Select(this);
            if (select == -1) {
                exitChar = true;
            } else {
                System.out.println("Modifier " + players.get(select).getName() + " " + players.get(select).getJob() + "?(y/n)");
                if (method.TrueFalse()) {
                    System.out.println(players.get(select));
                    do {
                        int chooseStat;
                        System.out.println("Modifier:" + "\n" + "[0]sortir parametre\n" + "[1]nom\n" + "[2]image\n" + "[3]niveaux\n" + "[4]puissance\n" + "[5]vie\n");
                        chooseStat = method.checkRange(0, 5);

                        switch (chooseStat) {
                            case 1: {
                                System.out.println("nom:");
                                String change = sc.nextLine();
                                players.get(select).setName(change);
                            }
                            break;
                            case 2: {
                                System.out.println("image:");
                                String change = sc.nextLine();
                                players.get(select).setImage(change);
                            }
                            break;
                            case 3: {
                                int change;
                                System.out.println("niveaux (pas plus de 10):");
                                change = method.checkRange(0, 10);

                                players.get(select).setLevel(change);
                            }
                            break;
                            case 4: {
                                int change;
                                System.out.println("puissance (pas plus de 100):");
                                change = method.checkRange(0, 100);
                                players.get(select).setPower(change);
                            }
                            break;
                            case 5: {
                                int change;
                                System.out.println("vie (pas plus de 100):");
                                change = method.checkRange(0, 100);
                                players.get(select).setHealth(change);
                            }
                            break;
                        }
                        System.out.println("modif de personnage finie(y/n)");
                        exitStats = method.TrueFalse();
                    } while (!exitStats);
                }
                System.out.println("modif finie(y/n)");
                exitChar = method.TrueFalse();

            }
        } while (!exitChar);
    }

    public void Remove() {
        boolean exit;
        do {
            System.out.println("Liste de personnage a Supprimer:");
            int select = method.Select(this);
            if (select == -1) {
                exit = true;
            } else {
                players.remove(select);
                System.out.println("Suppresion terminer(y/n)");
                exit = method.TrueFalse();
            }
        } while (!exit);
    }

    public void Show() {
        System.out.println("liste personnage:");
        if (players.size() == 0) {
            System.out.println("Aucun personnage");
        } else {
            for (int i = 0; i < players.size(); i++) {
                System.out.println(players.get(i));
            }
        }
    }
}
