public class Spell {
    private String name;
    private int power;

    public Spell(String aName, int aPower) {
        name = aName;
        power = aPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Sort{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }

}
