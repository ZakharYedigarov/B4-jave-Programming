package My_Utilities;

import java.util.Arrays;

/**
 * This method returns the minimum value in the given int [] Array
 */
public class ArrayUtil {
    public static int minNumInArray (int [] arr){
        int min = 0;
        Arrays.sort(arr);
        min = arr[0];
        return min;
    }

    /**
     * This method returns the maximum value in the given int [] Array
     */

    public static int maxNumInArray (int [] arr) {
            int max = 0;
            Arrays.sort(arr);
            max = arr[arr.length - 1];
            return max;
    }

    /**
     * This method returns boolean whether given Array contains the given num
     * @param arr given array
     * @param num given num
     * @return boolean whether contains or not
     */
    public static boolean contains (int [] arr, int num){
        boolean result = false;

        for ( int each : arr ){
            if (each == num){
                result = true;
                break;
            }
        }

        return result;
    }

}
