package Day_22_Arrays_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {
        String [] str = {"java", "hello", "by", "alpha"};
        // sort it
        // Alphabetic order if all the same,
        // first comes upper case than comes lower case
        // Priority comes from the order of the ascii table
        Arrays.sort(str);

        System.out.println("After sorting: " + Arrays.toString(str));

        System.out.println("------------------------------------------");
    }
}
