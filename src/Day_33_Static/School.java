package Day_33_Static;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {

        LoopcampStudent student1 = new LoopcampStudent("Nargiz", "Group 2", "Diana");
        LoopcampStudent student2 = new LoopcampStudent("Roma", "Group 1", "Iryna");


        System.out.println();
        System.out.println(student1);
        System.out.println(student2);

        System.out.println();
        // can you give me all the teachers name
        System.out.println(Arrays.toString(LoopcampStudent.teachers)  );

        // can you give me all the teachers name one by one
        System.out.println();
        for ( String each : LoopcampStudent.teachers) {
            System.out.println(each);
        }

    }
}
