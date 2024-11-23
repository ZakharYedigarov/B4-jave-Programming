package Day_18_Loops3;

import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Please enter word: ");
        String word = key.nextLine();
        int count = 0;
        int upperCase = 0;
        int lowerCase = 0;
        int numCount = 0;
        int otherCharCount = 0;

        for (int i = 0; i <word.length() ; i++) {

            char eachChar = word.charAt(i);

            if (eachChar >= 'A' && eachChar <= 'Z'){
                upperCase++;
            } else if (eachChar >= 'a' && eachChar <= 'z') {
                lowerCase++;

            } else if (eachChar >= '0' && eachChar <= '9') {
                numCount++;

            }else otherCharCount++;

        }

        System.out.println(upperCase + " Uppercases");
        System.out.println(lowerCase + " Lowercases");
        System.out.println(numCount + " numbers");
        System.out.println(otherCharCount + " Other characters");
    }
}
