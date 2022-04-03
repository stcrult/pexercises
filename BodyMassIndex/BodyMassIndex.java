import java.util.Scanner;

/**
 * The BodyMassIndex program implements an application that
 * calculates the Body Mass Index of a person given height and weight
 * and prints the output on the screen.
 *
 * @author S.Çapar
 * @version 1.0
 * @since 2022-04-03
 */
public class BodyMassIndex {

    /**
     * This is the main method
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the following values:");
        System.out.print("Height (meter)    =? ");
        float height = s.nextFloat();
        System.out.print("Weight (kilogram) =? ");
        float weight = s.nextFloat();

        double bmi = weight / Math.pow(height, 2);
        System.out.println("BMI               = " + bmi);
    }
}
