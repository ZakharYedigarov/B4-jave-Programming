package Day_18_Loops3;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class BranchingExample {
    public static void main(String[] args) {

        System.out.println("traditional for loop / fori loop with out break or condition");

        for (int i = 1; i <= 10 ; i++) {

            System.out.print(i + " ");

        }

        System.out.println();

        System.out.println("traditional for loop / fori loop with break");
        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i + " ");
            break;
        }
        System.out.println();
        System.out.println("traditional for loop / fori loop with break");
        for (int i = 1; i <= 10 ; i++) {
            System.out.print(i + " ");
            if ( i == 5){
                break;}
        }

        System.out.println();
        System.out.println("traditional for loop / fori loop with continue");

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i + " ");
            continue;
           // System.out.println("hi"); this line will never be reached because of the continue stmt

        }
        System.out.println();
        System.out.println("traditional for loop / fori loop with continue");

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                continue;
            }
            System.out.print("hi ");

        }

        System.out.println(" ");

        for (int i = 1; i < 10 ; i++) {

            if (i % 2 == 1 ){
                //System.out.print(i + "");
                continue;
            }
            System.out.print( i + "");

        }






    }
}
