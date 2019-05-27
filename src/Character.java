public abstract class Character {
    private String name, image,job;
    private int level, power, health;

    public Character(String pName, String pImage) {
        name = pName;
        image = pImage;
        level = 1;
    }

    public Character(String pName, String pImage, int pLevel, int pPower, int pHealth) {
        name = pName;
        image = pImage;
        level = pLevel;
        power = pPower;
        health = pHealth;
    }

    public void setPower(int pPower) {
        power = pPower;
    }

    public void setHealth(int pHealth) {
        health = pHealth;
    }

    public void setLevel(int pLevel) {
        level = pLevel;
    }

    public void setImage(String pImage) {
        image = pImage;
    }

    public void setName(String pName) {
        name = pName;
    }

    public String getImage() {
        return image;
    }

    public String getJob() {
        return job;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }


    public String sayHello(){

        return "Bonjour je suis un aventurier";
    }

    public String showProfil(){
        return this.toString();
    }

    @Override
    public String toString() {
            return  "Nom: " + name + '\n' +
                    "Image: " + image + '\n' +
                    "Niveaux: " + level + "\n" +
                    "Puissance: " + power + "\n" +
                    "Vie: " + health + "\n";
        }
}
