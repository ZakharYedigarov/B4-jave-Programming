package Day_09_a_Scanner;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your first name: ");
        String firstName = key.next();

        System.out.print("Please, enter your last name: ");
        String lastName = key.next();


        System.out.print("Are you employed (true/false): ");
        boolean isEmployed = key.nextBoolean();


        System.out.print("Are you student (true/false): ");
        boolean isStudent = key.nextBoolean();


//        System.out.println();
//        System.out.println("Information about " + firstName + " " + lastName);
//        System.out.println("\tIs Employeed: " + isEmployed);
//        System.out.println("\tIs Student: " + isStudent);

        String info = "\nInformation about " + firstName + " " + lastName + "\n\tIs Employeed: " + isEmployed + "\n\tIs Student: " + isStudent;
        System.out.println(info);

    }
}
