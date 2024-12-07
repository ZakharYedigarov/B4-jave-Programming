package Day_24_Methods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Greeting {
    public static void greeting(){

        String name  = "Tom";
        System.out.println("Hello " +name + "!. How are you?");}
    public static void greeting2(String name){

        //String name  = "Tom";
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("Hello " +name + "!. How are you?");}


    public static void main(String[] args) {
      greeting();
      greeting2("Tom");
      greeting2("Jim");
      String name = "Mickey";
      greeting2(name);
      String str = "James";
      greeting2(str);

        Scanner key =  new Scanner(System.in);
        System.out.print("What is your name: ");
        String userName = key.nextLine();

        greeting2(userName);


    }
}
