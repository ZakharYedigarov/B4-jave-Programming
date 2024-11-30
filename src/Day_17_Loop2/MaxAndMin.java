package Day_17_Loop2;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("How many numbers would you like to compare: ");

        int countOfNum = key.nextInt();
        int cycle = 1;
        int userNum;

        int biggest = -2147483648;
        int smallest = Integer.MAX_VALUE;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        while (cycle <= countOfNum){
            System.out.print("Please enter the numbers " + cycle + ": ");
            userNum = key.nextInt();

            if (userNum > biggest){
                biggest = userNum;
            }

            if (userNum < smallest){
                smallest = userNum;
            }
            cycle++;
        }
        System.out.println("Biggest: " + biggest);
        System.out.println("Smallest: " + smallest);



    }
}
