package Day_12_Switch_Statements;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Please enter number of the week: ");
        int numOfWeek = key.nextInt();
        String day;

        switch (numOfWeek){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturdday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Not valid num day in week";

        }
        System.out.println(day);
    }
}
