import java.util.Scanner;

/**
 * The FlightTicketPrice program implements an application that
 * calculates the flight ticket price for using the values
 * distance, age and trip type
 *
 * @author S.Çapar
 * @version 1.0, 05/04/2022
 * @since 1.0
 */
public class FlightTicketPrice {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean isError = false;

        System.out.println("Please enter the following values:");
        System.out.print("Distance   =? "); int distance = s.nextInt();
        System.out.print("Age        =? "); int age = s.nextByte();
        System.out.println("1. One Way");
        System.out.println("2. Round Trip");
        System.out.print("Type [1-2] =? "); int type = s.nextByte();

        if (! (distance >= 0)) isError = true;
        if (! (age >= 0)) isError = true;
        if (! (type == 1 || type==2)) isError = true;

        if (! isError) {
            double cost = distance * 0.10;
            if (age < 12) cost *= 0.50;
            else if (age < 25) cost *= 0.90;
            else if (age > 65) cost *= 0.70;
            if (type == 2) cost *= 0.80 * 2;

            System.out.println("Price = " + cost);
        }else{
            System.out.println("You entered invalid value(s)");
        }
    }
}
