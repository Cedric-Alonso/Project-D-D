public class Magician extends Character {
//    private int level=0,strength=0, health = 0;

    private String job;
    private Spell spell;
    Method method = new Method();

    public Magician(String pName, String pImage, int pSpell) {
        super(pName, pImage);
        setPower(method.getRandom(8, 15));
        setHealth(method.getRandom(3, 6));
        System.out.println("Création d'un Magicien!");
        job = "magicien";
        spell = method.ChooseSpell(pSpell);
    }

    public Magician(String pName, String pImage, int pLevel, int pStrength, int pHealth, int pSpell) {
        super(pName, pImage, pLevel, pStrength, pHealth);
        job = "super magicien";
        spell = method.ChooseSpell(pSpell);
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Class: " + job + '\n' +
                "Sort{" + spell.getName() + ": " + spell.getStat() + " dégats}" + "\n";
    }

    @Override
    public String sayHello() {
        return "Bonjour je suis un " + job;
    }
}
