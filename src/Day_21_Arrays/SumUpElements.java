package Day_21_Arrays;

import java.util.Arrays;

public class SumUpElements {
    public static void main(String[] args) {

        int [] nums = {3, 6, 10};

        System.out.println("Size of arrays: " + nums.length);
        System.out.println("Each element: " + nums[0] + ", " + nums[1] + ", " + nums[2]);
        System.out.println("All elements: " + Arrays.toString(nums).substring(1,Arrays.toString(nums).length()-1));

        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            System.out.println(i);

        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[1];

        }
        System.out.println("Sum up all elements: " + sum);
    }
}
