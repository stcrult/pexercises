import java.util.Scanner;

/**
 * The SortThreeNumbers program implements an application that
 * sorts 3 numbers from smaller to bigger.
 *
 * @author S.Çapar
 * @version 1.0, 05/04/2022
 * @since 1.0
 */
public class SortThreeNumbers {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter 3 numbers:");
        System.out.print("Number a =? ");int a = s.nextInt();
        System.out.print("Number b =? ");int b = s.nextInt();
        System.out.print("Number c =? ");int c = s.nextInt();

        String order;
        if (a < b && a < c) {
            if (b < c) order = "a < b < c";
            else       order = "a < c < b";
        }else if (b < a && b < c) {
            if (a < c) order = "b < a < c";
            else       order = "b < c < a";
        }else{
            if (a < b) order = "c < a < b";
            else       order = "c < b < a";
        }

        System.out.println("Order = " + order);
    }
}
