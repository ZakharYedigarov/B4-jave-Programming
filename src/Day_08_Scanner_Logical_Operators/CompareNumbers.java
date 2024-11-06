package Day_08_Scanner_Logical_Operators;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {

        //Scanner reference = Scanner Object
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter 2 number:");

        System.out.print("\n\tNumber 1: ");
        int num1 = input.nextInt();
        System.out.print("\n\tNumber 2: ");
        int num2 = input.nextInt();

        boolean isEqual = num1 == num2;

        System.out.println("\nIs " + num1 + " equal to " + num2 + ": " +isEqual);

    }
}
