package poketmon_v2;

public abstract class Poketmon {

    private String name;
    private int evolution;

    public int getEvolution() {
        return evolution;
    }

    public void setEvolution(int evolution) {
        this.evolution = evolution;
    }
    public abstract void attack();
    public abstract void defense();
}
