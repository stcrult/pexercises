import java.util.Scanner;

/**
 * The PracticalUserLogin program implements an application that
 * checks the login credentials of a user
 * and gives a chance to change the lost password
 * if the user wants to change it.
 *
 * @author S.Çapar
 * @version 1.0, 04/04/2022
 * @since 1.0
 */

public class PracticalUserLogin {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String currentUser="Java", currentPass="User";
        System.out.println("Please enter your credentials:");
        System.out.print("Username =? "); String userName = s.nextLine();
        System.out.print("Password =? "); String userPass = s.nextLine();
        if (userName.equals(currentUser) && userPass.equals(currentPass)) {
            System.out.println("Successfully logged in.");
        }else{
            System.out.println("Wrong credentials. Login failed");

            System.out.print("Do you want to change your password [E/H] =? ");
            String answer = s.nextLine();
            if (answer.toUpperCase().equals("E")) {
                System.out.print("Enter your new password    =? ");
                String newPassword = s.nextLine();
                if (! newPassword.equals(currentPass)) {
                    System.out.print("Re Enter your new password =? ");
                    String confirmPassword = s.nextLine();
                    if (newPassword.equals(confirmPassword)) {
                        System.out.println("Success: Your password has been changed");
                    }else{
                        System.out.println("Error: Password mismatch. Password change failed.");
                    }
                }else{
                    System.out.println("Error: Could not change password");
                }
            }
        }
    }
}
