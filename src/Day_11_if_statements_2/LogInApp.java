package Day_11_if_statements_2;

import java.util.Scanner;

public class LogInApp {
    public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    int expectedPinCode = 1111;
    int expectedSSNLast4 = 9876;

    int actualPinCode;
    int actualSSNLast4;

    System.out.print("Welcome to ATM. \n\tPlease, enter your pincode: ");
    actualPinCode = key.nextInt();
    System.out.print("\tPlease, enter your last 4 digits for SSN: ");
    actualSSNLast4 = key.nextInt();


    System.out.println();
    if (actualPinCode == expectedPinCode && actualSSNLast4 == expectedSSNLast4) {
        System.out.println("Authentication successful");
    } else {
        System.out.println("Authentication failed");

        if (actualPinCode != expectedPinCode) {
            System.out.println("incorrect pin code");
        }

        if (actualSSNLast4 != expectedSSNLast4) {
            System.out.println("invalid ssn");
        }
    }
    }
}