package Day_22_Arrays_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4};
        int [] b = {1, 2, 3, 4};
        int [] c = a;

        System.out.println( a == b ); // we do not use == when we are comparing arrays/objects
        System.out.println( a == c ); // Still never use ==

        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.equals(a,c));
        System.out.println(Arrays.equals(b,c));

        boolean result = Arrays.equals(a,b); // can be assigned to a boolean variable

        System.out.println();

        int [] d = {4,3,2,1};

        System.out.println(Arrays.equals(a, d));
        // d = Arrays.sort(d): this method does not return anything (void), so we can not reassign to anything
        Arrays.sort(d);
        System.out.println(Arrays.equals(a,d));
    }
}
