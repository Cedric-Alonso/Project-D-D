public class Philtre {
    private String name;
    private int power;

    public Philtre(int id) {
        switch (id) {
            case 0: {
                name = "potion";
                power = 10;
            }
            break;
        }
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
        return "Philtre{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
