package Day_08_Scanner_Logical_Operators;

public class LogicalOperators {
    public static void main(String[] args) {

        int n = 30;
        // relational operators
        System.out.println(n > 5);  // this is a single different statement
        System.out.println(n < 20); // this is a single different statement

        System.out.println(n > 5 && n < 20); // this is a single statement using logical and relational operators
        //  false && ture
        //    result false
        // range for ture must be between 5-------20


        System.out.println("*----------------*");

        System.out.println(6 > 1 || false);
        // true ||  false
        // the result will be true

        System.out.println("*----------------*");

        System.out.println(1 > 5 || false);
        // when both are false the result will be false

        System.out.println("*----------------*");

        System.out.println(true);
        System.out.println(!false); // ! is a not operator reverse of true or false

        System.out.println(! (6 != 6) );
    }
}
