public class Magicien extends Character {
//    private int level=0,strength=0, health = 0;

    private String job;
    private Spell spell;
    Menu Menu = new Menu();

    public Magicien(String pName, String pImage, int pSpell) {
        super(pName, pImage);
        setPower(Menu.getRandom(8, 15));
        setHealth(Menu.getRandom(3, 6));
        System.out.println("Création d'un Magicien!");
        job = "magicien";
        spell = Menu.ChooseSpell(pSpell);
    }

    public Magicien(String pName, String pImage, int pLevel, int pStrength, int pHealth, int pSpell) {
        super(pName, pImage, pLevel, pStrength, pHealth);
        job = "super magicien";
        spell = Menu.ChooseSpell(pSpell);
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Class: " + job + '\n' +
                "Sort{" + spell.getName() + ": " + spell.getPower() + " dégats}" + "\n";
    }

    @Override
    public String sayHello() {
        return "Bonjour je suis un " + job;
    }
}
