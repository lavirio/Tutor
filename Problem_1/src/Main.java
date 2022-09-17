import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Service service = new Service();
    static List<Car> garage = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Welcome to garage simulator!!!");
            while (true) {
                System.out.println("""
                        Choose the command from the list:
                        1)Create a new car
                        2)Drive
                        3)Repair the car
                        4)Choose car with the least durability
                        5)Show info about the car
                        6)Show cars in garage
                        7)Exit""");
                String number = scan.next();
                switch (number) {
                    case "1" -> createCar();
                    case "2" -> drive();
                    case "3" -> repair();
                    case "4" -> leastDurability();
                    case "5" -> showInfo();
                    case "6" -> showGarage();
                    case "7" -> {
                        System.out.println("Bye-bye!");
                        return;
                    }
                    default -> System.out.println("Unknown command, please try again!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scan.close();
        }
    }

    private static void createCar() {
        System.out.println("Enter name of the model:");
        String model = scan.next();
        Car car = new Car(model);
        garage.add(car);
        System.out.println(model + " has been successfully created!");

    }

    private static void drive() {
        System.out.println("Enter the name of the car:");
        String model = scan.next();
        System.out.println("Enter amount of kilometres:");
        int kilometres = scan.nextInt();
        for (Car c : garage) {
            if (c.getModel().equals(model)) {
                c.startMove(kilometres);
            }
        }
    }

    private static void repair() {
        System.out.println("Enter the name of the car:");
        String model = scan.next();
        for (Car c : garage) {
            if (c.getModel().equals(model)) {
                service.repairEngine(c);
            }
        }
    }

    private static void leastDurability() {
        System.out.println(service.repairEngineWithLowestDurability(garage));
    }

    private static void showInfo() {
        System.out.println("Enter the name of the model:");
        String model = scan.next();
        for (Car c : garage) {
            if (c.getModel().equals(model)) {
                c.showEngineInfo();
            }
        }
    }

    private static void showGarage() {
        if (garage.isEmpty())
            System.out.println("Garage is empty!");
        else {
            System.out.println("Garage:");
            garage.forEach(System.out::println);
        }
    }
}
