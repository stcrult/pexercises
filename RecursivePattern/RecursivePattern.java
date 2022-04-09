import java.util.Scanner;

/**
 * The RecursivePower program implements an application that
 * checks if a given number is a Prime Number using recursive function.
 *
 * @author S.Çapar
 * @version 1.0, 09/04/2022
 * @since 1.0
 */
public class RecursivePatter {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the following value:");
        System.out.print("Number   =? "); int number = s.nextInt();
        System.out.print("Decrease =? "); int decrease = s.nextInt();
        recursivePattern(number, number, 1, decrease);

    }

    /**
     * Outputs the patterned numbers
     * @param number Starting number
     * @param pattern Numbers in the pattern
     * @param direction Subtraction or Summation
     * @param decrement Decrement value
     * @since 1.0
     */
    static void recursivePattern(int number, int pattern, int direction, int decrement) {
        if (pattern <= number){
            System.out.print(pattern + " ");
            if (direction == 1 && pattern > 0)
                recursivePattern(number, pattern - decrement, 1, decrement);
            else
                recursivePattern(number, pattern + decrement, 0, decrement);
        }
    }
}
