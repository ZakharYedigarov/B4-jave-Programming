package Day_22_Arrays_2;

public class MinMax {
    public static void main(String[] args) {
        int [] nums = {500, 120, -80, 90, 250, -10};
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for ( int eachElement : nums ){

            if (eachElement > biggest){
                biggest = eachElement;
            }
            if (eachElement < smallest){
                smallest = eachElement;
            }



        }

        System.out.println("Biggest is: " + biggest);
        System.out.println("Smallest is: " + smallest);
    }
}
