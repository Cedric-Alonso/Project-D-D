public class Main {
    public static void main(String[] args) {
        boolean exit;
        Menu Menu = new Menu();
        Menu.Intro();
        do {
            exit = Menu.Choose();
        } while(!exit);
    }

}


