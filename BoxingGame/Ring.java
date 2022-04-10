public class Ring {
    Boxer boxer1;
    Boxer boxer2;
    int minWeight;
    int maxWeight;

    public Ring(Boxer boxer1, Boxer boxer2, int minWeight, int maxWeight) {
        this.boxer1 = boxer1;
        this.boxer2 = boxer2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        System.out.println("======== The fight has begun ===========");
        if (checkWeight()) {
            double whoWillStart = Math.random();
            while (boxer1.health > 0 && boxer2.health > 0) {
                if (whoWillStart < 0.5) {
                    boxer2.health = boxer1.hit(boxer2);
                    if (isWin()) break;
                    boxer1.health = boxer2.hit(boxer1);
                }else{
                    boxer1.health = boxer2.hit(boxer1);
                    if (isWin()) break;
                    boxer2.health = boxer1.hit(boxer2);
                }
                if (isWin()) break;
                printScore();
            }
        } else System.out.println("Weight mismatch.");
    }

    public boolean checkWeight() {
        return (boxer1.weight >= minWeight && boxer1.weight <= maxWeight) && (boxer2.weight >= minWeight && boxer2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (boxer1.health == 0 || boxer2.health == 0) {
            String name = "";

            if (boxer1.health == 0) name = boxer1.name;
            else name = boxer2.name;
            System.out.println("================================");
            System.out.println("=                              =");
            System.out.println("=             WINNER           =");
            System.out.println("=              " + name + "            =");
            System.out.println("=                              =");
            System.out.println("================================");
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println();
        System.out.println(boxer1.name + " Health   :" + boxer1.health);
        System.out.println(boxer2.name + " Health   :" + boxer2.health);
        System.out.println();
    }
}
