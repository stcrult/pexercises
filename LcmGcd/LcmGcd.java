import java.util.Scanner;

/**
 * The LcmGcd program implements an application that
 * calculates LCM (The Least Common Multiple) and
 * GCD (The Greatest Common Divisor) of two numbers.
 *
 * @author S.Çapar
 * @version 1.0, 07/04/2022
 * @since 1.0
 */
public class LcmGcd {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the following values");
        System.out.print("n1 =? "); int n1 = s.nextInt();
        System.out.print("n2 =? "); int n2 = s.nextInt();

        int counter = 1, gcd = 0, lcm = 0;
        int smallest = Math.min(n1, n2);
        while (counter <= smallest) {
            if (n1 % counter == 0 && n2 % counter == 0) gcd = counter;
            counter++;
        }
        counter = n1 * n2;
        while (counter > 0){
            if (counter % n1 == 0 && counter %n2 == 0) lcm = counter;
            counter--;
        }

        System.out.println("GCD (Greatest Common Divisor) = " + gcd);
        System.out.println("LCM (Least Common Multiple)   = " + lcm);
    }
}
