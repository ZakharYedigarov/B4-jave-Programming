package Day_09_A_Scanner;

import java.util.*;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please, eneter a number: ");

        int num = input.nextInt();

        boolean isEven = num % 2 == 0;
        boolean isOdd = num % 2 == 1;

        System.out.println(num + " Is Even " + isEven);
        System.out.println(num + " Is Odd " + isOdd);


    }
}
