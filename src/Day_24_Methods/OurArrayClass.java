package Day_24_Methods;

public class OurArrayClass {
    public static void main(String[] args) {
        int [] num1 = {213,45,23,65,87,98,43};
        int [] num2 = {54, 75, 5678, 234, 23, 54, 2, 55};

        arrayFirstElement(num1);
        arrayLastElement(num1);

        arrayMidElements(num2);
        arrayMidElements(num1);
    }

    public static void arrayFirstElement(int [] arr){
        System.out.println("First value in array: " + arr[0]);
    }
    public static void arrayLastElement(int [] arr){
        System.out.println("First value in array: " + arr[arr.length-1]);
    }
    public static void arrayMidElements(int [] num){
        if (num.length % 2 == 0){
            System.out.println("Middle First: "+ num[num.length /2-1]);
            System.out.println("Middle Second: "+ num[num.length /2]);
        }else {
            System.out.println("Middle First: "+ num[num.length /2]);
        }
    }
}
