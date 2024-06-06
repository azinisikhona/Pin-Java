import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

    int validPin = 2002, enteredPin, attempts = 1, delaySecs = 5;
    boolean isValidInput;
    Scanner input = new Scanner(System.in);

    public void validateInput() {
        while (!isValidInput) {
            System.out.println("Please enter your pin: ");
            if (input.hasNextInt()) {
                enteredPin = input.nextInt();
                isValidInput = true;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                input.next();
            }
        }
    }

    public void trial() {
        validateInput();

        while (enteredPin != validPin) {
            if (attempts <= 2) {
                System.out.println("You have entered an invalid pin!!!");
                isVallidInput = false;
                validateInput();
            } else if (attempts == 3) {
                try {
                    System.out.println("Incorrect pin!!! 2 attempts left");
                    System.out.println("Please wait " + delaySecs + " seconds");
                    Thread.sleep(delaySecs * 1000);
                    isVallidInput = false;
                    validateInput();
                } catch (InterruptedException e) {
                    System.out.println("An error has occured " + e);
                }
            } else if (attempts == 4) {
                try {
                    System.out.println("Incorrect pin!!! 1 attempts left");
                    System.out.println("Please wait " + delaySecs * 2 + " seconds");
                    Thread.sleep(delaySecs * 2000);
                    isVallidInput = false;
                    validateInput();
                } catch (InterruptedException e) {
                    System.out.println("An error has occured " + e);
                }
            } else {
                System.out.println("You have inputed a wrong pin too many times, your account has been suspended");
                break;
            }
            attempts++;
        }
        if (enteredPin == validPin) {
            System.out.println("Welcome to your account");
        }
    }

    public static void main(String[] args) throws Exception {
        App log = new App();
        log.trial();
    }
}
