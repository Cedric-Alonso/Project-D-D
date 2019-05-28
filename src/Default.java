public class Default extends Character {

    private String job;
    Method method = new Method();

    public Default() {
        super("Captain Noob", "noobImage");
            setPower(method.getRandom(10, 15));
            setHealth(method.getRandom(10, 15));
            System.out.println("Création de Captain Noob!");
            job = "Super Noob";
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return super.toString() +
                "job = " + job;
    }

    @Override
    public String sayHello() {
        return "Bonjour je suis Captain Noob!";
    }
}
