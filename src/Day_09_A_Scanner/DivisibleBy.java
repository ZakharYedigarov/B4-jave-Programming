package Day_09_A_Scanner;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = key.nextInt();

//        System.out.println(num + " is divisible by 2: " + (num % 2 == 0));
//        System.out.println(num + " is divisible by 3: " + (num % 3 == 0));
//        System.out.println(num + " is divisible by 5: " + (num % 5 == 0));


        boolean isDivisibleBy2 = num % 2 == 0;
        boolean isDivisibleBy3 = num % 3 == 0;
        boolean isDivisibleBy5 = num % 5 == 0;
        System.out.println(num + " is divisible by 2: " + isDivisibleBy2);
        System.out.println(num + " is divisible by 3: " + isDivisibleBy3);
        System.out.println(num + " is divisible by 5: " + isDivisibleBy5);


        // Can you find is the num is divisible by 2 and 3 and 5 --- > logical operators
        //System.out.println(num + " is divisible by 2 and 3 and 5: " + (isDivisibleBy2 && isDivisibleBy2 && isDivisibleBy2));
        boolean isDivisibleBy2_3_5 = isDivisibleBy2 && isDivisibleBy2 && isDivisibleBy2;
        System.out.println(num + " is divisible by 2 and 3 and 5: " + isDivisibleBy2_3_5);

    }
}
