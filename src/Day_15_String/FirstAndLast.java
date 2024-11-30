package Day_15_String;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a sentence: ");
        String sentence = key.nextLine(); // Java is a good coding language

        System.out.println(sentence.charAt(0)); // This is not CONCATENATION, or ADDITION. So prints normally
        System.out.println(0 + sentence.charAt(0)); // This is not CONCATENATION, but ADDITION. So prints there calculation 0 + 74 (ASCII table number for J)
        System.out.println(sentence.charAt( sentence.length() - 1 )); // This is not CONCATENATION, or ADDITION. So prints normally
        System.out.println(0 + sentence.charAt( sentence.length() - 1 )); // This is not CONCATENATION, but ADDITION. So prints there calculation 0 + 101 (ASCII table number for e)


        System.out.println();
        System.out.println("First char: " + sentence.charAt(0)); // This is CONCATENATION
        System.out.println("Last 2 char: " + sentence.charAt(  sentence.length() - 1 )); // This is CONCATENATION


        /*
            TODO: get the last char and 2nd last char and check if they are same
                If they are - print "Double same chars at th end"
                If not - pring last two chars are not same
         */
        String lastLetter = "" + sentence.charAt(  sentence.length() - 1 );
        String secondToLastLetter = "" + sentence.charAt(  sentence.length() - 2 );
        System.out.println("The last 2 char's are: " + lastLetter + secondToLastLetter);
        System.out.println(lastLetter.equalsIgnoreCase(secondToLastLetter)? "Last 2 chars are the same" : "Last 2 chars are not the same");

    }
}