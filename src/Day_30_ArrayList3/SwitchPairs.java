package Day_30_ArrayList3;
import java.util.*;
public class SwitchPairs {
    public static void main(String[] args) {
        ArrayList <String> list =  new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat" ));
        System.out.println("Original: " + list);

        System.out.println("Switched: " +  switchPairs(list) );

    }

    public static ArrayList <String> switchPairs (ArrayList <String> list){

        // "Cat", "in", "the", "hat", "Cat", "in", "the", "hat", "Cat", "in", "the", "hat"
        //   0      1     2      3      4      5     6      7      8      9     10     11

        ArrayList <String> switchedList = new ArrayList<>();

        for (int i = 0; i < list.size(); i += 2) {
            Collections.swap(list, i, i+1);
        }

        switchedList.addAll(list);

        return switchedList;
    }
}
