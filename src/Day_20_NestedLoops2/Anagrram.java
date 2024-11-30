package Day_20_NestedLoops2;

public class Anagrram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent"; // str2.replaceFirst("l", "");  --- > sient --> sent -- > ent --> en -- >  n -- > ""

        if (str1.length() != str2.length()){

            System.out.println("Not Anagram");

        } else {


            // take each char from first str1
            //      remove that matching first char from the second str2.

            for (int i = 0; i < str1.length() ; i++) {

                char eachChar = str1.charAt(i);

                str2 = str2.replaceFirst(eachChar+"", ""); //  --- > sient --> sent -- > ent --> en -- >  n -- > ""

            }

            if (str2.isEmpty()) {
                System.out.println("It is Anagram");
            } else {
                System.out.println("Not Anagram");
            }

        }

    }
}
