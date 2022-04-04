import java.util.Scanner;

/**
 * The AreaOfTriagnle program implements an application that
 * calculates the area of the triangle with 3 sides entered
 * and prints the output on the screen.
 *
 * @author S.Çapar
 * @version 1.1, 04/04/2022
 * @since 1.0
 */
public class AreaOfTriangle {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter following values:");
        System.out.print("1st side =? "); float side1 = s.nextFloat();
        System.out.print("2th side =? "); float side2 = s.nextFloat();
        System.out.print("3rd side =? "); float side3 = s.nextFloat();

        float u = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(u * (u - side1) * (u - side2) * (u - side3));
        System.out.println("Area of Triangle = " + area);
    }
}
