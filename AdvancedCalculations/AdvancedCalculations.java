import java.util.Scanner;

/**
 * The AdvancedCalculations program implements an application that
 * performs some mathematical actions.
 *
 * @author S.Çapar
 * @version 1.0, 08/04/2022
 * @since 1.0
 */
public class AdvancedCalculations {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int action;
        String menu = """
                1- Addition
                2- Subtraction
                3- Multiplication
                4- Division
                5- Power
                6- Factorial
                7- Mode
                8- Area and Perimeter of a rectangle
                0- Exit""";

        System.out.println(menu);
        do {
            System.out.print("Please select an action : "); action = s.nextInt();
            switch (action) {
                case 1: add(); break;
                case 2: subtract(); break;
                case 3: multiply(); break;
                case 4: divide(); break;
                case 5: power(); break;
                case 6: factorial(); break;
                case 7: mode(); break;
                case 8: rectangle(); break;
                case 0: break;
                default:
                    System.out.println("Invalid action.");
            }
        } while (action != 0);
        System.out.println("Goodbye.");
    }

    static void output(String description, double result) {
        System.out.println(description + " = " + result + "\n");
    }

    static double operation(int operator, double initialize) {
        Scanner s = new Scanner(System.in);
        int number, i = 1;
        double result = initialize;
        while (true) {
            System.out.print(i++ + ". number [0->Exit] =? "); number = s.nextInt();
            if (number == 0) break;
            if (operator == 4 && i == 1){
                result = number;
                continue;
            }
            switch (operator) {
                case 1 -> result += number;
                case 2 -> result -= number;
                case 3 -> result *= number;
                case 4 -> result /= number;
            }
        }
        return result;
    }

    static void add() {
       output("Sum", operation(1, 0));
    }

    static void subtract() {
        output("Subtraction", operation(2, 0));
    }

    static void multiply() {
        output("Multiplication", operation(3, 1));
    }

    static void divide() {
        output("Division", operation(4, 1));
    }

    static void power() {
        Scanner s = new Scanner(System.in);
        System.out.print("Base =? "); int base = s.nextInt();
        System.out.print("Power =? "); int power = s.nextInt();
        int result = 1;
        for (int i = 1; i <= power; i++) result *= base;
        output("Power", result);
    }

    static void factorial() {
        Scanner s = new Scanner(System.in);
        System.out.print("Number =? "); int number = s.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) result *= i;
        output("Factorial", result);
    }

    static void mode() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st number =? "); int n1 = s.nextInt();
        System.out.print("Enter 2nd number =? "); int n2 = s.nextInt();
        output("Mode", n1 % n2);
    }

    static void rectangle() {
        Scanner s = new Scanner(System.in);
        System.out.print("1st Side =? "); int side1 = s.nextInt();
        System.out.print("2nd Side =? "); int side2 = s.nextInt();
        output("Area", side1 * side2);
        output("Perimeter", 2 * (side1 + side2));
    }
}
