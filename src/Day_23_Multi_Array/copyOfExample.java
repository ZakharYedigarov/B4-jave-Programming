package Day_23_Multi_Array;

import java.util.Arrays;

public class copyOfExample {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = a;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println("-----------------------");

        a[0]=10;
        b[1] = 200;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println("-------------------------");

        int [] x = new int[a.length]; // size 3

        System.out.println(Arrays.toString(x));

        for (int i = 0; i < x.length; i++) {
            x[i]= a[i];

        }
        System.out.println(Arrays.toString(x));
        a[0] = 100;
        System.out.println(Arrays.toString(a));

        System.out.println("-----------------------");

        int [] y = Arrays.copyOf(a,a.length);

        System.out.println(Arrays.toString(y));

        a[2] = 300;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(y));


        System.out.println("------------------------");

        int [] z = new int[a.length *2]; // made the array Z time 2 of array A

        for (int i = 0; i < a.length; i++) {
            z[i] = a[i];

        }
        System.out.println(Arrays.toString(z));

        int [] z2 = Arrays.copyOf(a, a.length *2);

        System.out.println(Arrays.toString(z2));

        z2[1] = 500;
        System.out.println(Arrays.toString(z2));
        System.out.println(Arrays.toString(a));

        int [] z3 = Arrays.copyOf(a,a.length-1);
        System.out.println(Arrays.toString(z3));
    }
}
