package Day_22_Arrays_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        String word = "loopcamp";

        System.out.println("String size: " + word.length() );
        System.out.println("print: " + word);

        System.out.println("---------------------------------------");

        char [] letters = {'l', 'o', 'o', 'p', 'c', 'a', 'm', 'p'};
        System.out.println("Char array size: " + letters.length);
        System.out.println("Print directly: " + Arrays.toString(letters));
        System.out.println("print with .toString(): " + Arrays.toString(letters));

        System.out.println("------------------------------------------");

        char [] wordLetters = new char[word.length()];
        System.out.println("Char array2 size: " + wordLetters.length );
        System.out.println(wordLetters);
        System.out.println(Arrays.toString(wordLetters));

        for (int i = 0; i < word.length() ; i++) {
            wordLetters [i] = word.charAt(i);

        }
        System.out.println(Arrays.toString(wordLetters));

        System.out.println("--------------------------------------------");


        // .toCharArrray() ----> will do exact same thins as the one above
        char [] wordLetters2 = word.toCharArray();
        System.out.println(Arrays.toString(wordLetters2));
        System.out.println(wordLetters2);

        System.out.println("-----------------------------------------------");

        char [] letters3 = "Wednesday".toCharArray();
        System.out.println(Arrays.toString(letters3));// has to be printed with Arrays.toString() to see it as Array


    }
}
