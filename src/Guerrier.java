public class Guerrier extends Character {


//    private int level,strength, health;
//
    private String job;
    private Arme arme;
    Method method = new Method();

    public Guerrier(String pName, String pImage, int pArme){
        super(pName, pImage);
        setPower(method.getRandom(5,10));
        setHealth(method.getRandom(5,10));
        System.out.println("Création d'un Guerrier!");
         job = "guerrier";
         arme = method.ChooseArme(pArme);
    }
    public Guerrier(String pName, String pImage, int pLevel, int pStrength, int pHealth, int pArme){
        super(pName, pImage ,pLevel ,pStrength ,pHealth);
        System.out.println("Création d'un Guerrier !");
        job = "super guerrier";
        arme = method.ChooseArme(pArme);
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Class: " + job + '\n'+
                "Arme{"+arme.getName()+": "+arme.getStat()+" dégats}"+"\n";
    }

    @Override
    public String sayHello() {
        return "Bonjour je suis un "+job;
    }
}
