package Day_18_Loops3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String reverse = "";
        System.out.print("Please enter a word: ");
        String word = key.nextLine();

        for (int i = word.length()-1; i >= 0 ; i--) {
            reverse += word.charAt( i );
        }
        System.out.println("Is " + word + " = " + reverse);
        System.out.println(word.equalsIgnoreCase(reverse) ? "It is palindrome" : "It is not palindrome");



    }
}
