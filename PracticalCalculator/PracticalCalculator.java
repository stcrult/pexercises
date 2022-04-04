import java.util.Scanner;

/**
 * The PracticalCalculator program implements an application that
 * performs one of four arithmetic operations for two entered numbers
 * and prints the output on the screen.
 *
 * @author S.Çapar
 * @version 1.0
 * @since 2022-04-04
 */
public class PracticalCalculator {

    /**
     * This is the main method
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the following values:");
        System.out.print("First number  =? ");int n1=s.nextInt();
        System.out.print("Second number =? ");int n2=s.nextInt();
        System.out.println("Please select your operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Your choice [1-4] =? ");int choice=s.nextInt();

        switch (choice) {
            case 1: System.out.println(n1 + " + " + n2 + " => " + (n1+n2));break;
            case 2: System.out.println(n1 + " - " + n2 + " => " + (n1-n2));break;
            case 3: System.out.println(n1 + " * " + n2 + " => " + (n1*n2));break;
            case 4:
                switch (n2) {
                    case 0: System.out.println("Zero Division Error");break;
                    default: System.out.println(n1 + " / " + n2 + " => " + (n1/n2));break;
                }; break;
            default: System.out.println("Invalid Operation Selected");
        }
    }
}
