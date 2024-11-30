package Day_17_Loop2;

import java.util.Scanner;

public class GuessNumber { public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    int secretNumber = 777;
    int userGuess;
    int attempts = 0;

    do{
        System.out.print ("Please, guess the number: ");
        userGuess = key.nextInt(); // 777
        attempts++;

        if (userGuess < secretNumber){
            System.out.println("It is too low");
        } else if (userGuess > secretNumber){
            System.out.println("It is too high");
        } else {
            System.out.println("Guess Correctly");
        }

    } while (userGuess != secretNumber);
        System.out.println("On the " + attempts + " attempt.");



        /*
            TODO: Home Practice
                In this code implement a logic that tells me after how may tries, I found the correct
                    - Print "After n-th try you guessed it."

         */



}

}
