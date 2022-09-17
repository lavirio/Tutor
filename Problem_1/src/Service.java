import java.util.List;

public class Service {

    public void repairEngine(Car car) {
        car.getEngine().setDurability(100);
        System.out.println(car.getModel() + " has been repaired, the durability is " + car.getEngine().getDurability() + "%");
    }

    public Car repairEngineWithLowestDurability(List<Car> cars ){
        Car minDurability = null;
        int min = cars.get(0).getEngine().getDurability();
        for (int i = 1; i < cars.size(); i++) {
            if (min > cars.get(i).getEngine().getDurability()){
                min = cars.get(i).getEngine().getDurability();
                minDurability = cars.get(i);
            }
        }
        return minDurability;
    }
}