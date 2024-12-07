package Day_24_Methods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;


public class age {


    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter the year you were born: ");
        int userBirthYear = key.nextInt();
        calculateAge(userBirthYear);
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);
    }
    public static void calculateAge(int year){
        System.out.println("your age is: " + ( - year));


    }
}
