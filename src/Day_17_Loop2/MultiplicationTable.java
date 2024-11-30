package Day_17_Loop2;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    System.out.print("Please, enter a number that you want to see multiplication table from 0 to 10: ");
    int num = scan.nextInt();

    for (int i = 0; i <= 10; i++) {

        System.out.println( num + " x " + i + " = " + (num * i)  );

    }

}}

