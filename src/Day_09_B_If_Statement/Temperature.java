package Day_09_B_If_Statement;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter the temperature: ");
        int temp = input.nextInt();

        if (temp >=70){   //
            System.out.println("Its a nice day");
            System.out.println("GO out side with you laptop to code java");
        } else {
            System.out.println("Its to cold ");
            System.out.println("Code more java");
        }
    }
}
