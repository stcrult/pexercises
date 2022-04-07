import java.util.Scanner;

/**
 * The DiamondFromStars program implements an application that
 * simulates basic ATM functions.
 *
 * @author S.Çapar
 * @version 1.0, 07/04/2022
 * @since 1.0
 */
public class AtmProject {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String currUser = "Test", currPass = "User", currency = "€";
        int remainingTrial = 3, balance = 1500;
        boolean loggedIn = false;

        while (remainingTrial > 0 && ! loggedIn) {
            System.out.println("Login your account:");
            System.out.print("Username =? "); String userName = s.nextLine();
            System.out.print("Password =? "); String userPass = s.nextLine();

            if (currUser.equals(userName) && currPass.equals(userPass)) {
                loggedIn = true;
            }else{
                remainingTrial--;
                if (remainingTrial > 0) {
                    System.out.println("Error: Wrong credentials");
                    System.out.println("Remaining Trial = " + remainingTrial);
                }
            }
        }
        if (loggedIn) {
            System.out.println("Welcome to Your Bank");
            int operation = 0, amount = 0;
            while (operation < 4) {
                do {
                    System.out.println("1. Deposit Money       3. Check Balance");
                    System.out.println("2. Withdraw Money      4. Logout");
                    System.out.print("Choose your operation [1-4] =? ");
                    operation = s.nextInt();

                }while (operation < 0 || operation > 4);
                switch (operation) {
                    case 1:
                        System.out.print("Enter the amount to be deposited =? ");
                        amount = s.nextInt();
                        balance += amount;
                        System.out.println(amount + currency + " deposited. New Balance = " + balance + currency + "\n");
                        break;
                    case 2:
                        System.out.print("Enter the amount to be withdraw =? ");
                        amount = s.nextInt();
                        if (balance >= amount) {
                            balance -= amount;
                            System.out.println(amount + currency + " withdrawn. New Balance = " + balance + currency + "\n");
                        }
                        else System.out.println("You don't have enough money\n");
                        break;
                    case 3:
                        System.out.println("Balance = " + balance + currency + "\n");
                        break;
                    case 4:
                        System.out.println("Goodbye");
                }
            }
        }else{
            System.out.println("Error: You have tried all your rights");
            System.out.println("Your account has been locked.");
        }
    }
}
