package Day_24_Methods;

import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {
        int[][] number = {{3, 4, 5, 6,},
                          {5, 2, 6},
                          {10, 20, 30}};
            // to find average of each  array
        for (int[]each:number){
            int sum = 0;
            System.out.println(Arrays.toString( each));
            for (int eachnum : each){
                System.out.println(eachnum);
                sum+= eachnum;
            }

            System.out.println("Average of  " + Arrays.toString(each) + " is: " + sum/each.length);



        }

        // how to find a total of the 2dem array

        double totalSum = 0;
        int totalLength = 0;


        for (int [] each : number) {
            double sumEachArr = 0;


            for ( int eachElem : each) {
                sumEachArr += eachElem;
            }

            totalSum += sumEachArr;
            totalLength += each.length;



        }

        System.out.println("Average of : " + Arrays.deepToString(number) + " is: " + totalSum / totalLength);




    }

}
