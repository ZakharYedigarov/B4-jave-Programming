package Day_22_Arrays_2;

public class LongShortString {
    public static void main(String[] args) {
        String [] words = {"java", "selennium", "softskills", "mentors", "loop"};

        String longest = words[0];
        String shortest = words[0];

        for (String eachElement : words){

            if (eachElement.length() >= longest.length()){
                longest = eachElement;
            }
            if (eachElement.length() <= shortest.length()){
                shortest = eachElement;
            }

        }
        System.out.println("Longest String: " + longest);
        System.out.println("Shortest String: " + shortest);
    }
}
