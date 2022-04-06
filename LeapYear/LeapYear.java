import java.util.Scanner;

/**
 * The LeapYear program implements an application that
 * determines if the given Year is a Leap Year.
 *
 * @author S.Çapar
 * @version 1.0, 06/04/2022
 * @since 1.0
 */
public class LeapYear {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the following value:");
        System.out.print("Year =? "); int year = s.nextInt();

        if (year>0) {
            boolean isLeapYear = false ;
            if (year % 100 == 0) {
                if (year % 400 == 0) isLeapYear = true;
            }else{
                if (year % 4 == 0) isLeapYear = true;
            }
            if (isLeapYear) {
                System.out.println("Year " + year + " is a Leap Year");
            }else{
                System.out.println("Year " + year + " is not a Leap Year");
            }
        }else{
            System.out.println("Error: Invalid Year");
        }
    }
}
