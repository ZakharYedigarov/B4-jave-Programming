package Day_10_If_Statements;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {


    Scanner keyboard = new Scanner(System.in);
    double salary;
    int hoursPerWeek;
    double hourlyRate;

    System.out.print("Please, enter your annual salary: $");
    salary = keyboard.nextDouble();

    System.out.print("How many hours he/she works in a week: ");
    hoursPerWeek = keyboard.nextInt();

    // 1st. need to know how many hours working in a year. -- > hoursPerWeek * 52 (weeks in a year)
    hourlyRate = salary / (hoursPerWeek * 52);

    System.out.println("My annual salary is $" + salary + "\n\tWork hours per week: " + hoursPerWeek + "\n\tHourly Rate $" + hourlyRate);

}
}