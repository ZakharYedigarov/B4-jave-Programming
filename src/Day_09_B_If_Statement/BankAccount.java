package Day_09_B_If_Statement;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double balance;
        double withdraw;

        System.out.print("What is your balance: $");
        balance = key.nextDouble();
        System.out.println("\tYour balance is: $" + balance);


        System.out.print("How much do you want to withdraw? $");
        withdraw = key.nextDouble();
        System.out.println("\tYou are requesting to withdraw $" + withdraw);

        //balance = balance - withdraw;
        balance -= withdraw;
        System.out.println("You balance is: $" + balance);

        // I still want to withdraw again. --- >  200

        /*
            if withdraw amount < balance
                - Not enough money
            else (equal or more)
                - updated the balance
         */

        System.out.print("How much do you want to withdraw? $");
        withdraw = key.nextDouble();


        if (withdraw > balance) {
            System.out.println("Not enough money");
        } else {
            balance -= withdraw;
            System.out.println("You new balance is $" + balance);
        }

    }
}
