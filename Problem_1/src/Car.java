public class Car {
    private String model;
    private Engine engine;

    public Car(String model) {
        this.model = model;
        engine = new Engine();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine={durability=" + engine.getDurability() + ", run=" + engine.getRun() +
                "}}";
    }

    public void startMove(int kilometres) {
        int remainderKilometres = engine.getRun() % 1000;
        if ((engine.getRun() % 10000 + kilometres > 10000) || (kilometres > 10000)) {
            System.out.println("You cannot use " + model + " for this distance, please enter shorter!");
            return;
        }
        if (kilometres >= 1000 && kilometres < 10000) {
            int fullTurn = kilometres / 1000;
            engine.setDurability(engine.getDurability() - 10 * fullTurn);
            engine.setRun(engine.getRun() + kilometres);
        }
        if (remainderKilometres + kilometres >= 1000 && remainderKilometres != 0) {
            engine.setDurability(engine.getDurability() - 10);
            engine.setRun(engine.getRun() + kilometres);
        }
        if (remainderKilometres + kilometres < 1000) {
            engine.setRun(engine.getRun() + kilometres);
        }
        if (engine.getDurability() == 0) {
            System.out.println("Car is broken, please fix it!");
        }
    }

    public void showEngineInfo() {
        System.out.println(getModel() + "'s durability is " + engine.getDurability() + "%, run " + engine.getRun());
    }
}