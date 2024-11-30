package Day_14_String;

import java.util.Scanner;

public class Login {
    /*

    Ask the user to enter a username
    make sure the username is in lowercase

    Ask the user to enter a password
    check if the password is more than 8 characters long

    valid system password: "loopcamp"

    -> if the entered password matches the system password
        logged in

        otherwise print:

        invalid password

 */

        public static void main(String[] args) {

            String expectedUsername = "java@gmail.com";
            String expectedPassword = "loopcamp";

            Scanner key = new Scanner(System.in);
            System.out.print("Please, enter your username: ");
            String inputUsername = key.next();

            System.out.print("Please, enter your password: ");
            String inputPassword = key.next();


            // to be able to login
            //      1. username has to match without case sensitiveness --- >  inputUsername.equalsIgnoreCase(expectedUsername) --- > boolean
            //      2. password needs to be 8 character long            --- >  inputPassword.length() == 8                      --- > boolean
            //      3  password needs to match exactly                  --- >  inputPassword.equals(expectedPassword)           --- > boolean
            boolean wrongUserName = inputUsername.equals(expectedUsername);
            boolean wrongPassword = inputPassword.equals(expectedPassword);
            boolean isValid = inputUsername.equalsIgnoreCase(expectedUsername) && inputPassword.length() == 8 && inputPassword.equals(expectedPassword);
            if (isValid) {
                System.out.println("LOGGED IN");
            } else {
                System.out.println("You have entered either invalid username or password");
                if (!wrongPassword) System.out.println("You Have entered wrong password");
                if (!wrongUserName) System.out.println("You have entered wrong username");}







                // TODO: HOMEWORK -- > implement the code to give specific message for specific error
        }   }

