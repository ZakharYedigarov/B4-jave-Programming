package Day_21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentIfno {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String [] student1 ={"ID#12546", "Tom", "Jerry", "b#4" };

        System.out.println(Arrays.toString(student1).substring(1,Arrays.toString(student1).length()-1));

        System.out.println("--------------------------------------");

        String [] student2 = new String[4];
        student2 [1] = "Winne";
        student2 [0] = "45213";
        student2 [2] = "Pooh";
        student2 [3] = "B#4";

        System.out.println(Arrays.toString(student2).substring(1,Arrays.toString(student2).length()-1));

        System.out.println("-----------------------------------------");
        String [] student3 = new String[4];

        System.out.print("Please, enter ID: ");
        student3 [0] = key.nextLine();
        System.out.print("Please, enter first name: ");
        student3 [1] = key.nextLine();
        System.out.print("Please, enter last name: ");
        student3 [2] = key.nextLine();
        System.out.print("Please, enter batch number: ");
        student3 [3] = key.nextLine();

        System.out.println(Arrays.toString(student3).substring(1,Arrays.toString(student3).length()-1));

        System.out.println("-----------------------------------------");

        String [] questions = {"Please, enter ID: ", "Please, enter first name: ", "Please, enter last name: ", "Please, enter batch number: " };
        String [] student4 = new String[4];
        int count = 0;

        for (int i = 0; i < questions.length ; i++) {
            System.out.print(questions [1]);
            student4 [i]= key.nextLine();

        }
        System.out.println(Arrays.toString(student4).substring(1,Arrays.toString(student4).length()-1));







        /*
            TODO: Home Practice
                Ask a user how many student info will be entered
                After getting info for each. Print them.

                Hint: Nested Loop
         */





    }
}
