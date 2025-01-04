package Day_22_Arrays_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int [] nums = {23, 34, 2, 65, -56, 3};
        System.out.println("Before sorted: " + Arrays.toString(nums));

        int [] sortedNums = nums; // Here, I did not create a new array. i just point to the same array

        System.out.println("Before sorted: " + Arrays.toString(sortedNums));

        System.out.println("--------------------------");
        Arrays.sort(nums);
        System.out.println("After sorted: " + Arrays.toString(nums));
        System.out.println("After sorted: " + Arrays.toString(sortedNums));

        // Find the Max and MIN
        System.out.println("Min: " + nums[0]);
        System.out.println("Max: " + nums[nums.length-1]);
        System.out.println("--------------------------");

        int [] nums2 = new int[nums.length]; // I created a brand-new array with copying the size of nums array
        System.out.println(Arrays.toString(nums2));

        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = nums [i];

        }
        System.out.println(Arrays.toString(nums2));

    }
}
