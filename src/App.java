import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Login user = new Login();

        System.out.println("Do you have an account with us (y/n): ");
        char opt = input.next().charAt(0);
        if (opt == 'y') {
            user.trial();
            user.customer.accountDetails();

            System.out.println("Would you like to make a withdrawal or deposit(w/d):");
            opt = input.next().charAt(0);
            if (opt == 'd') {
                user.customer.depositFunds();
            } else if (opt == 'w') {
                user.customer.withdrawFunds();
            }

            System.out.println("Welcome, Izumi Miyamura to your account");
            System.out.println("Available balance: R" + user.customer.balance + "\n");
            System.out.println("Thank you for banking with us");
        } else if (opt == 'n') {
            user.customer.createAccount();
            System.out.println("Do you want to login to your account(y/n): ");
            opt = input.next().charAt(0);
            if (opt == 'y') {
                user.trial();
                user.customer.newAccountDetails();
            } else if (opt == 'n') {
                System.out.println("Have a good day");
            }

            System.out.println("Would you like to make a withdrawal or deposit(w/d):");
            opt = input.next().charAt(0);
            if (opt == 'd') {
                user.customer.depositFunds();
            } else if (opt == 'w') {
                user.customer.withdrawFunds();
            }
            
            user.customer.newAccountDetails();
        }
        input.close();
    }
}