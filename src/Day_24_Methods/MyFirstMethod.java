package Day_24_Methods;

public class MyFirstMethod {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        printHelloWorld();
        System.out.println("Bey");
        printHelloWorld50();

    }

    public static void printHelloWorld (){
        System.out.println("Hello World!");

    }
    
    public static void printHelloWorld50(){
        for (int i = 0; i < 50 ; i++) {
            System.out.println("Hello World!");
            
        }
    }
}
