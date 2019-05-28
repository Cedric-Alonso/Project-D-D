import java.util.ArrayList;
import java.util.Scanner;

public class Method {
    Scanner sc = new Scanner(System.in);

    public int checkInt() {
        int test;
        sc = new Scanner(System.in);
        try {
            test = sc.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("erreur n'est pas un chiffre");
            test = -1;
        }
        return test;
    }

    public String YesNo() {
        sc = new Scanner(System.in);
        String test = sc.nextLine();

        while (!test.equals("y") && !test.equals("n")) {
            System.out.println("erreur repondre y ou n\n");
            test = sc.nextLine();
        }
        return test;
    }

    public int checkRange(int min, int max) {
        int test = checkInt();
        while ((test < min) || (test > max)) {
            System.out.println("erreur repondre entre " + min + " et " + max + "\n");
            test = checkInt();
        }
        return test;
    }

    public boolean TrueFalse() {
        sc = new Scanner(System.in);
        while (true) {
            String test = sc.nextLine();
            if (test.equals("y")) {
                return true;
            } else if (test.equals("n")) {
                return false;
            } else if ((!test.equals("y")) && (!test.equals("n"))) {
                System.out.println("erreur repondre y ou n\n");
            }
        }
    }

    public int getRandom(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
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

    public int Select(Players players) {
        if (players.getPlayers().size() == 0) {
            System.out.println("Aucun personnage");
            return -1;
        } else {
            System.out.println("[0]Sortir");
            for (int i = 0; i < players.getPlayers().size(); i++) {
                System.out.println("[" + (i + 1) + "]" + players.getPlayers().get(i).getName() + " Class:" + players.getPlayers().get(i).getJob());
            }
            int choosePlay = (checkRange(0, players.getPlayers().size()) - 1);
            if (choosePlay == -1) {
                return -1;
            } else {
                return choosePlay;
            }
        }
    }
}

