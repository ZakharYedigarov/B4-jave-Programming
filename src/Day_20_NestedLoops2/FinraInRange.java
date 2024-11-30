package Day_20_NestedLoops2;

import java.util.Scanner;

public class FinraInRange {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
        System.out.print("Please, enter a number to get all \"FIN/RA/FINRA\": ");
        int userNumRage = scan.nextInt();


        for (int i = 1; i <= userNumRage; i++) {
        int num = i;


        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " - FINRA");
        } else if (num % 3 == 0) {
            System.out.println(num + " - FIN");
        } else if (num % 5 == 0) {
            System.out.println(num + " - RA");
        }

    }




}

}


