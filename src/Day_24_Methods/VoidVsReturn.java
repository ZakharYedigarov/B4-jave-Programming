package Day_24_Methods;

public class VoidVsReturn {
    public static void main(String[] args) {
        sayHi();
        String str = sayHi2();
        System.out.println(sayHi2());
        System.out.println(str);
    }
    // this is a void type method - which mean does not return anything.
    public static void sayHi(){
        System.out.println("HI");
    }
    //This is a return type Method - which mean it RETURNS something. Can be any data type
    public static String sayHi2(){
        String str = "Hi"; // Local variable
        return str;

    }
}
