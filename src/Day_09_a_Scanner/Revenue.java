package Day_09_a_Scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter the price of the items: $");
        double price = input.nextDouble();
        System.out.print("Please, enter the quantity of the items: ");
        int quantity = input.nextInt();
        double revenue = price * quantity;
        System.out.println("The revenue of the sale is: $"+revenue);

    }
}
