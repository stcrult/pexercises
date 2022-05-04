import java.util.Scanner;
/**
 * The CircleAreaPerimeter program implements an application that
 * calculates the area and perimeter of a circle with given radius.
 *
 * @author S.Çapar
 * @version 1.0, 05/04/2022
 * @since 1.0
 */

public class CircleAreaPerimeter {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter following values:");
        System.out.print("Radius =? "); int radius = s.nextInt();
        System.out.println("Area       = " + (3.14 * Math.pow(radius, 2)));
        System.out.println("Perimeter  = " + (2 * 3.14 * radius));
    }
}
