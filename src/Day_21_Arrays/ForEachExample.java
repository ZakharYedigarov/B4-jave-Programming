package Day_21_Arrays;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        int [] nums = {3, 4, 5};

        for (int i = 0; i < nums.length; i++){
            System.out.println("Traditional Loop: " + nums[i]);
            nums[1]= 20; // reAssign

        }

        System.out.println("-----------------");

        for ( int eachElem : nums ){
            System.out.println("Foreach loop: " + eachElem);
            // nums[1]= 20; // can NOT reAssign

        }

        // you can ONLY start from the beginning and go all the wat to the last element
        // you can ONLY get/read - cannot reAssign
        System.out.println("--------------------------------------");

        double [] arr3= {34 , 28 , 56 , 87};

        for (double each : arr3){
            System.out.println(each);
        }

        System.out.println("--------------------------");

        char [] letters = {'l', 'o', 'o', 'p', 'c', 'a', 'm', 'p'};

        for (int i = letters.length/2; i < letters.length ; i++) {
            System.out.println(letters[i]);

        }

        System.out.println("----------------------");

        for (char eachletter : letters){
            System.out.println(eachletter);
        }



    }
}
