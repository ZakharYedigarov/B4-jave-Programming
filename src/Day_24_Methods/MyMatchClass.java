package Day_24_Methods;

public class MyMatchClass {
    public static void main(String[] args) {
        addition(10,20);
        addition(3,20);
        subtraction(50,30);
        multiplication(20,50);
        division(30,0);
    }

    public static void addition(int num1, int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

    }
    public static void subtraction(int num1, int num2){
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

    }
    public static void multiplication (int num1, int num2){
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

    }
    public static void division (int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Not divisible by 0");
        } else {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2) );
        }
    }
}



