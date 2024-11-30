package Day_15_String;

import java.util.Scanner;

public class FirstName {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Please enter your first name");
        String firstName = key.nextLine();
        System.out.println("Please enter your first name");
        String lastName = key.nextLine();

        String correctedFirstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() ;
        String correctedLastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase() ;
        System.out.println("Your full name after correction" + correctedFirstName + correctedLastName);

    /*
            Ask a user to give a full name
            Then ask a user
                Which od the following options you would like to do?
                    1. Make all UPPER case
                    2. Make all lower case
                    3. Make each word capitalized

                    You option: 1, 2, 3

                 Then print out what user gave you as full name in the option they selected
         */
    }


}
