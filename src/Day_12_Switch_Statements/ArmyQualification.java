package Day_12_Switch_Statements;

import java.util.Scanner;

public class ArmyQualification {
    public static void main (String [] args) {

    boolean isCitizen, isResident;
    boolean hasDiploma;
    int age;

    Scanner key = new Scanner(System.in);
    System.out.println("Welcome to Army Station");
    System.out.println("Please, answer the following questions to check eligibility\n");
    System.out.print("\tAre you a citizen (true/false): ");
    isCitizen = key.nextBoolean();
    System.out.print("\tAre you a resident (true/false): ");
    isResident = key.nextBoolean();
    System.out.print("\tDo you have a high school diploma (true/false): ");
    hasDiploma = key.nextBoolean();
    System.out.print("\tHow old are you: ");
    age = key.nextInt();


    if ((isCitizen || isResident) && hasDiploma && 18 <= age && age <= 35 ) {

        System.out.println("You are eligible");

    } else {

        System.out.println("\n\tYou are not eligible for the following reasons:");

        if (!isCitizen || !isResident) {
            System.out.println("\t\tYou must be a citizen or a resident ");
        }

        if (!hasDiploma) {
            System.out.println("\t\tYou must have a high school diploma");
        }

        //if (! (18 <= age && age <= 35) ){  // you can do this as well.
        if (age < 18 || age > 35) {
            System.out.println("\t\tYour age must be between 18 to 35 years old");
        }



    }
    }
}
