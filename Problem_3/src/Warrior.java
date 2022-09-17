public class Warrior {
    private int health;
    private String name;

    public Warrior(String name){
        health = 100;
        this.name = name;
        System.out.println("Warrior " + name + " has been successfully created, his/her health is " + getHealth());
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

}
