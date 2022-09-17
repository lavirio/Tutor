public class Engine {
    private int durability;
    private int run;

    public Engine() {
        durability = 100;
        run = 0;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }
}
