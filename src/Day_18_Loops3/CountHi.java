package Day_18_Loops3;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int count = 0;

        System.out.print("Please enter a word: ");
        String word = key.nextLine().toLowerCase().trim();

        for (int i = 0; i < word.length()-1 ; i++) {

           if (word.charAt(i) == 'h' && word.charAt(i+1) == 'i'){
               count++;
           }

        }
        System.out.println("You got " + count + " times \"hi\" in a " + word );

    }
}
