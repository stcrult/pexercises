import java.util.Scanner;

/**
 * The ActivitySuggestion program implements an application that
 * recommends an activity according to the temperature.
 *
 * @author S.Çapar
 * @version 1.0, 05/04/2022
 * @since 1.0
 */
public class ActivitySuggestion {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the following value:");
        System.out.print("Temperature =? "); int temp = s.nextInt();

        String activity;
        if (temp < 5) activity = "skiing";
        else if (temp <= 15) activity = "cinema";
        else if (temp <= 25) activity = "picnic";
        else activity = "swimming";

        System.out.println("Go " + activity);
    }
}
