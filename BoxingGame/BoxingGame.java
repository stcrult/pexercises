/**
 * The BoxingGame program implements an application that
 * simulates a simple boxing fight
 *
 * @author S.Çapar
 * @version 1.0, 10/04/2022
 * @since 1.0
 */
public class BoxingGame {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Boxer marc = new Boxer("Marc" , 80, 100, 35,60);
        Boxer alex = new Boxer("Alex" , 85, 100, 40,50);
        Ring ring = new Ring(marc, alex, 80 , 90);
        ring.run();
    }
}
