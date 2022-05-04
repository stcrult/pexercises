import java.util.Scanner;
/**
 * The RightTriangleCalculator program implements an application that
 * calculates the third side of a right triangle with two sides given
 *
 * @author S.Çapar
 * @version 1.0, 05/04/2022
 * @since 1.0
 */

public class RightTriangleCalculator {

        /**
         * This is the main method
         * @param args unused
         * @since 1.0
         */
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.println("Please enter following values:");
            System.out.print("First  Side =? "); int s1 = s.nextInt();
            System.out.print("Second Side =? "); int s2 = s.nextInt();
            double s3 = Math.sqrt((Math.pow(s1, 2) + Math.pow(s2, 2)));
            System.out.println("Third  Side = " + s3);
        }
}
