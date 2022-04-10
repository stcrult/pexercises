public class Boxer {
    String name;
    int weight;
    int health;
    int hit;
    double defense;

    public Boxer(String name, int weight, int health, int hit, double defense) {
        this.name = name;
        this.weight = weight;
        this.health = health;
        this.hit = hit;
        this.defense = defense;
    }

    public int hit(Boxer boxer) {
        int difference = boxer.health;
        String message = this.name + " hit " + boxer.name + " " +  this.hit;

        if (boxer.defense()) message += ", " + boxer.name + " not damaged";
        else difference = Math.max(0, boxer.health - this.hit);

        System.out.println(message);
        return difference;
    }

    public boolean defense() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.defense;
    }
}
