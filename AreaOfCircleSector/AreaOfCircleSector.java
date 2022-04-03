import java.util.Scanner;

/**
 * The AreaOfCircleSector program implements an application that
 * calculates the area of a sector of a circle given radius and angle
 * and prints the output on the screen.
 *
 * @author S.Çapar
 * @version 1.0
 * @since 2022-04-03
 */
public class AreaOfCircleSector {

    /**
     * This is the main method
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(("Please enter the following values:"));
        System.out.print("Radius =? ");
        float radius = s.nextFloat();
        System.out.print("Angle  =? ");
        float angle = s.nextFloat();

        double area = Math.PI * Math.pow(radius, 2) * angle / 360;
        System.out.println("Area   = " + area);
    }
}
