public class Guerrier extends Character {


//    private int level,strength, health;
//
    private String job;
    private Arme arme;
    Menu Menu = new Menu();

    public Guerrier(String pName, String pImage, int pArme){
        super(pName, pImage);
        setPower(Menu.getRandom(5,10));
        setHealth(Menu.getRandom(5,10));
        System.out.println("Création d'un Guerrier!");
         job = "guerrier";
         arme = Menu.ChooseArme(pArme);
    }
    public Guerrier(String pName, String pImage, int pLevel, int pStrength, int pHealth, int pArme){
        super(pName, pImage ,pLevel ,pStrength ,pHealth);
        System.out.println("Création d'un Guerrier !");
        job = "super guerrier";
        arme = Menu.ChooseArme(pArme);
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Class: " + job + '\n'+
                "Arme{"+arme.getName()+": "+arme.getPower()+" dégats}"+"\n";
    }

    @Override
    public String sayHello() {
        return "Bonjour je suis un "+job;
    }
}
