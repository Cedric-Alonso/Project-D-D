import java.util.Scanner;

public class Control {
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

    public boolean TrueFalse(){
        sc = new Scanner(System.in);
        while (true) {
            String test = sc.nextLine();

            if (test.equals("y")) {
                return true;
            } else if (test.equals("n")) {
                return false;
            } else if ((!test.equals("y"))&&(!test.equals("n"))){
                System.out.println("erreur repondre y ou n\n");
            }

        }
    }
}

