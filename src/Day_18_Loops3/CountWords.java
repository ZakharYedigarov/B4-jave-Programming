package Day_18_Loops3;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Please write a sentence:");
        String sentence = key.nextLine().trim();

        int spaceCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' '){
                spaceCount++;
            }

        }
        System.out.println("There are "+(spaceCount+1)+ " words in the sentence.");
    }
}
