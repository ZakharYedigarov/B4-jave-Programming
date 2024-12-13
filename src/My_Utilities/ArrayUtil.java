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
    /**
     * This method returns the index of given int num from the given int array
     * @param arr given int array
     * @param num given in value
     * @returns the index of value if exists, if not returns -1
     */
    public static int indexOf (int [] arr, int num){ // 78
        int index = -1;

        for (int i = 0; i < arr.length; i++) { // {12, 34, 6, 78, 34, 9, 33};

            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        return index;
    }


    /**
     * This method returns the index of given String str from the given String array
     * @param arr given String array
     * @param str given in value
     * @returns the index of value if exists, if not return s-1
     */
    public static int indexOf (String [] arr, String str) { // "api"
        int index = -1;

        for (int i = 0; i < arr.length; i++) { // "java", "selenium", "api", "db"

            if (arr[i].equals(str)) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * This method returns the Sum of all the INT elements of an Array
     * @param arr given Int array
     * @return sum of the Int Array
     */
    public static int sumOfElements(int ... arr){
        int total = 0;
        for (int each : arr){
            total+=each;

        }


        return total;
    }
}
