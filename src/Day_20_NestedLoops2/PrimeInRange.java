package Day_20_NestedLoops2;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);


        System.out.print("Please, enter a number to find all the prime numbers up to that number: ");
        int userNum = key.nextInt();  // 50



        for (int i = 1; i <= userNum; i++) {


            int count = 0;
            int singleNum = i; // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10... 50

            for (int j = 1; j <= singleNum; j++) {
                if (singleNum % j == 0) {
                    count++;
                }
            }

            if (count == 2){
                System.out.print(singleNum + " ");
            }


        }


        /*
            1, 2, 3, 4, 5 ,6

                1
                    1
                2
                    1, 2
                3
                    1, 2, 3
         */

    }
}
