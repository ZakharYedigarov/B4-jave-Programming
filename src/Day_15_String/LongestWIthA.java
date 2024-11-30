package Day_15_String;

import java.util.Scanner;


public class LongestWIthA {
    /*
    NOTE: FINDS THE BIGGEST AND CHECK IF THE BIGGEST HAS "A" IN IT.
    NOTE: All three words have a
    create a class LongestWithA
    ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

    Ex:
        "java"
        "mouse"
        "computer"

    Output: java

    Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
    // TODO: Improve the code
 */

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Please enter three words:");
        String word1 = key.next();
        String word2 = key.next();
        String word3 = key.next();

        // 1st - needs to contain "a"
        //      word1.contains("a")
        // 2nd - needs to be longest
        //      word1.length() > word2.length() && word1.length() > word3.length();

        boolean isFirstLongestWithA = word1.contains("a") || word1.contains("b") && ( word1.length() > word2.length() && word1.length() > word3.length() );
        boolean isSecondLongestWithA = word2.contains("a") || word2.contains("b") && word2.length() > word1.length() && word2.length() > word3.length();
        boolean isThirdLongestWithA = word3.contains("a") || word3.contains("b") && word3.length() > word1.length() && word3.length() > word2.length();
        // TODO: Improve the code - implement the option if the words to no have "a" in it. But if there word with "a" then print that one.
        //  HINT: nested if
        if (isFirstLongestWithA){
            System.out.println(word1 + " is the longest with a");
        } else if (isSecondLongestWithA) {
            System.out.println(word2 + " is the longest with a");
        } else if (isThirdLongestWithA) {
            System.out.println(word3 + " is the longest with a");
        }else System.out.println("This words do not contain 'a': " + word1 +" "+ word2 +" "+ word3 );





    }
}
