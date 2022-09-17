import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> battle = new HashMap<>();
        Warrior warrior1 = new Warrior("Juna");
        Warrior warrior2 = new Warrior("Andrey");

        Random random = new Random();
        boolean[] hits = new boolean[9];

        for (int i = 0; i < hits.length; i++) {
            hits[i] = random.nextBoolean();
        }

        for (boolean hit : hits) {
            if (hit) {
                if (score(battle, warrior2, warrior1)) break;
            } else {
                if (score(battle, warrior1, warrior2)) break;
            }
        }
        System.out.println("Name: " + warrior1.getName() + ", heath: " + warrior1.getHealth() + ", hits: " + battle.get(warrior1.getName()));
        System.out.println("Name: " + warrior2.getName() + ", heath: " + warrior2.getHealth() + " , hits: " + battle.get(warrior2.getName()));
    }


    private static boolean score(Map<String, Integer> battle, Warrior warrior1, Warrior warrior2) {
        if (!battle.containsKey(warrior2.getName())) {
            battle.put(warrior2.getName(), 1);
        } else {
            battle.put(warrior2.getName(), battle.get(warrior2.getName()) + 1);
        }
        return hits(warrior1, warrior2);
    }

    private static boolean hits(Warrior warrior1, Warrior warrior2) {
        warrior1.setHealth(warrior1.getHealth() - 20);
        System.out.println(warrior2.getName() + " made one hit of " + warrior1.getName() + " and his/her heath is " + warrior1.getHealth());
        if (warrior1.getHealth() == 0) {
            System.out.println(warrior1.getName() + " lost this battle!");
            return true;
        }
        return false;
    }
}
