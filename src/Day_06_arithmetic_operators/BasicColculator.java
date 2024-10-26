package Day_06_arithmetic_operators;

public class BasicColculator {
    public static void main(String[] args) {
        double num1 = 3;  // the 3 value is int. Since we are assigning int into double (we can do it. Why? Because double can hold int. So, IMPLICIT CASTING (WIDENING CONVERSION) is happening
        double num2 = 2;

        double addition = num1 + num2;  // 3 + 2 or 3.0 + 2.0 ? --- >  3.0 + 2.0 -- >. 5.0 (double)
        // When there are two different data types with arithmetic operator, the result is biggest data type
        // int subtraction = num1 - num2;  // 3.0 - 2.0 --- > 1.0 (double)
        // int subtraction = (int)num1 - num2;  // 3 - 2.0 --- > 1.0 (double)
        // int subtraction = (int)num1 - (int)num2;  // 3 - 2 --- > 1 (int)
        // int subtraction2 = (int)(num1 - num2);  // (3.0 - 2.0) --- > 1.0 (double) -- > (int)1.0 --- > 1
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2; // Since my data type are double, I will be able to see the decimal part of the result as well.
        double remainder = num1 % num2; // modules -- > 3.0 % 2.0 --- > 1.0

        System.out.println(num1 + " + " + num2 + " = " + addition );
        System.out.println(num1 + " - " + num2 + " = " + subtraction );
        System.out.println(num1 + " * " + num2 + " = " + multiplication );
        System.out.println(num1 + " / " + num2 + " = " + division );
        System.out.println(num1 + " % " + num2 + " = " + remainder );


        num1 = 13;
        num2 = 5;
        remainder = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + remainder );


        System.out.println();
        System.out.println("------------");
        int i1 = 13;
        int i2 = 5;

        // DIVISION
        int div = i1 / i2;
        double div2 = i1 / i2; // 13/5 ---> 3 --- > 3.0
        System.out.println(div);
        System.out.println(div2);

        // MODULE/REMAINER
        int rem = i1 % i2;  // 13 % 5 --- > 3
        double rem2 =  i1 % i2; // 13 % 5 -- > 3 --- > 3.0
        System.out.println(rem); //
        System.out.println(rem2); //

        System.out.println();
        System.out.println("------------");
        System.out.println(3.4 + 1);  // double + int --- > double

        int a = 5;
        double d = 4; // 4.0
        System.out.println(a + d); // 5 + 4.0 -- > int. + double --- >  double

        System.out.println(10 - 5);
        System.out.println(10 * 5);

        // double / int - result is double
        System.out.println(10.0 / 5);

        // double / double - result is double
        System.out.println(10.0 / 2.0);


        // int / double - result is double
        System.out.println(10 / 2.0);

        System.out.println();
        // double / double --- > int / double --- > double
        System.out.println((int)10.5 / 5.0);    // 10 / 5.0 -- > int / double -- > result double
        System.out.println(10.5 / 5.0);         // 10.5 / 5.0 -- > double / double --- > result double

        System.out.println((int)10.5 / (int)5.0); // 10 / 10 --- > int / int --- result is int
        System.out.println( (int)(10.5 / 5.0) );  // (double / double) --  (int)double -- > int
    }
}
