import java.util.Scanner;

public class Account {
    String name, surname;
    double balance;
    int newPin;
    Scanner input = new Scanner(System.in);

    public void createAccount() {
        System.out.print("First name: ");
        name = input.nextLine();
        System.out.print("\nLast name: ");
        surname = input.nextLine();
        System.out.print("\nEnter your PIN: ");
        newPin = input.nextInt();
        System.out.println("Account Succesfully created");
    }

    public void newAccountDetails() {
        System.out.println("Welcome, " + name + " " + surname + ", to your account");
        System.out.println("Available balance: R" + balance + "\n");
        System.out.println("Thank you for banking with us");
    }

    public double accountDetails(){
        System.out.println("Welcome, Izumi Miyamura, to your account");
        balance = (1 * (Math.random() *1001)); 
        System.out.println("Available balance: R" + balance + "\n");
        System.out.println("Thank you for banking with us");
        return balance;
    }

    public void depositFunds() {
        System.out.print("How much would you like to deposit: " + "\n" + "R");
        double deposit = input.nextDouble();
        if (deposit <= 29) {
            System.out.println("Invalid amount");
        }else{
            balance += deposit;
        }
    }

    public void withdrawFunds() {
        System.out.print("How much would you like to withdraw: " + "\n" + "R");
        double withdraw = input.nextDouble();
        if (withdraw <= 29) {
            System.out.println("Invalid amount");
        }else{
            balance -= withdraw;
        }
        if(balance < 0){
            System.out.println("You have overdrafted");
        }
    }
}
