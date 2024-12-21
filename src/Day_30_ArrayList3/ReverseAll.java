package Day_30_ArrayList3;
import My_Utilities.StringUtil;

import java.util.*;
public class ReverseAll {public static void main(String[] args) {

    ArrayList <String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
    System.out.println("Not reversed: " + list);

    System.out.println("Reversed: " +    reverseAllInList(list)  );

}



    public static ArrayList <String> reverseAllInList (ArrayList <String> originalList) {

        ArrayList <String> reversedList = new ArrayList<>(); // "ted", "talk", "learn" --- > "det", "klat", "nrael"


        for ( String each : originalList) {
            reversedList.add( StringUtil.reverse( each ) );
        }

        return reversedList;
    }
}
