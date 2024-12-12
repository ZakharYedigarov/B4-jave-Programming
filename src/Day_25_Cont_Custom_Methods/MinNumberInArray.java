package Day_25_Cont_Custom_Methods;

import My_Utilities.ArrayUtil;

import java.util.Arrays;

public class MinNumberInArray {
    public static void main(String[] args) {
        int [] nums = {233,24155,4841,36,513,5634,68,465,4};
        System.out.println(minNumInArray(nums));
        System.out.println(ArrayUtil.minNumInArray(nums));

    }

    public static int minNumInArray (int [] arr){
        int min = 0;
        Arrays.sort(arr);
        min = arr[0];
        return min;
    }

}
