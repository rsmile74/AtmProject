
import java.util.Scanner;

public class AtmApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Atm myAtm = new Atm(500, "1234");

        System.out.println("Welcome to Bank of We Can Code It");
        System.out.println("Please enter your pin");
        String userEnterPin = input.nextLine();

        while (myAtm.accessAccount(userEnterPin) == false) {
            System.out.println("Incorrect pin please try again");
            userEnterPin = input.nextLine();

        }
        System.out.println("please choose an option");
        System.out.println("Press 1 to check balance");
        System.out.println("Press 2 to do a desposit");
        System.out.println("Press 3 to withdrawal money");
        System.out.println("Press 4 to exit");
        String userChoice = input.nextLine();

        while (!userChoice.equals("4")) {
            if (userChoice.equals("1")) {
                System.out.println("Your balance is " + myAtm.getBalance());
            }else if (userChoice.equals("2")) {
                System.out.println("How much do you want to deposit?");
                int amountToDeposit = input.nextInt();
                myAtm.deposit(amountToDeposit);
                input.nextLine();
            } else if (userChoice.equals("3")) {
                System.out.println("How much do you want to withdrawal?");
                int amountToWithdrawal = input.nextInt();
                myAtm.withdrawal(amountToWithdrawal);
                input.nextLine();
            } else {
                System.out.println("I am sorry I dont understand...");

            }
            System.out.println("please choose an option");
            System.out.println("Press 1 to check balance");
            System.out.println("Press 2 to do a desposit");
            System.out.println("Press 3 to withdrawal money");
            System.out.println("Press 4 to exit");
            userChoice = input.nextLine();

        }

        System.out.println("Thanks for banking with us today!");

    }
}
