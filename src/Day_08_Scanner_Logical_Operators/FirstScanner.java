package Day_08_Scanner_Logical_Operators;
//#1 - We need to import to be able to use a class outside of the package
import java.util.Scanner;

public class FirstScanner {

    public static void main(String[] args) {

        //Scanner input = ; ----> input is a Object reference name (because date type is NON-Primitive / Object type)
        // int a;          -----> a is variable name ( Because date type is PRIMITIVE datatype)

        //#2 - Declaring and instantiating Scanner Object

        Scanner imput = new Scanner(System.in);
        System.out.println("How old are you? ");
        //int userAge = 30; // Hardcoded value given userAge
        int userAge = imput.nextInt();
        System.out.println("I am " +userAge+" years old");

    }
}
