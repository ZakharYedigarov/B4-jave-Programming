package Day_21_Arrays;

public class EvenOrOdd {
    public static void main(String[] args) {
        int [] nums ={2,1,3,12,5};
        int countEven = 0;
        int countOdd = 0;
        String evenNums = "";
        String oddNums = "";

        for (int each : nums){
            if (each%2==0){
                countEven++;
                evenNums += each + " ";

            }else{
                countOdd++;
                oddNums += each + " ";
            }
        }

        System.out.println("the even numbers are: " + evenNums);
        System.out.println("the odd numbers are: " + oddNums);

    }
}
