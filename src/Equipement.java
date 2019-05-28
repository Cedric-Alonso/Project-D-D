public class Equipement {

    private String name;
    private int stat;

    protected Equipement(String eName, int eStat) {
        name = eName;
        stat = eStat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStat() {
        return stat;
    }

    public void setStat(int stat) {
        this.stat = stat;
    }

}
