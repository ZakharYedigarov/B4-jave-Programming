package Day_21_Arrays;

public class AvarageNumber {
    public static void main(String[] args) {
        int[] nums = {20, 22, 18, 35, 48, 26, 87, 70};
        double sum = 0;


        for (int i = 0; i < nums.length ; i++) {
            sum += nums[i];

        }

        System.out.println( " sums " + sum);

        sum = 0;

        for (int each : nums){
            sum += each;
        }
        System.out.println("Sum with foreach " + sum);
        System.out.println("Average with foreach: " + sum/ nums.length);
    }
}