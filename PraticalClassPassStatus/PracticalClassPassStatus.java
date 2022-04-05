import java.util.Scanner;

/**
 * The PracticalClassPassStatus program implements an application that
 * calculates the average of entered grades of 5 courses
 * and checks if the student has passed the class.
 *
 * @author S.Çapar
 * @version 1.0, 05/04/2022
 * @since 1.0
 */
public class PracticalClassPassStatus {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int grade, total=0, count=0;

        System.out.println("Please enter the grades for the following courses:");
        System.out.print("Math      =? "); grade = s.nextInt();
        if (grade >=0 && grade <=100) {total += grade; count++;}

        System.out.print("Physics   =? "); grade = s.nextInt();
        if (grade >=0 && grade <=100) {total += grade; count++;}

        System.out.print("Chemistry =? "); grade = s.nextInt();
        if (grade >=0 && grade <=100) {total += grade; count++;}

        System.out.print("Turkish   =? "); grade = s.nextInt();
        if (grade >=0 && grade <=100) {total += grade; count++;}

        System.out.print("Music     =? "); grade = s.nextInt();
        if (grade >=0 && grade <=100) {total += grade; count++;}

        if (count == 0) System.out.println("No grade entered or grades are invalid.");
        else {
            double average = total / count;

            if (average < 55) System.out.println("You failed the class. See you next year.");
            else System.out.println(("You passed the class."));

            System.out.println("Average = " + average);
        }
    }
}
