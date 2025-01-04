package Day_30_ArrayList3;
import java.util.*;
public class RemoveLongString {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
        System.out.println("Original:"  + list);

        System.out.println("Update: " + removeLongStrings(list, 4));
        System.out.println("Update: " + removeLongStrings(list, 5));
        System.out.println("Update: " + removeLongStrings(list, 10));

    }

    public static ArrayList <String> removeLongStrings (ArrayList <String> list, int num) {  // 6

        ArrayList <String> updatedList = new ArrayList<>(list);  // ["one", "two", "three", "four", "five", "six"]
        updatedList.removeIf( eachElem -> eachElem.length() < num);

        return updatedList;
    }

}
