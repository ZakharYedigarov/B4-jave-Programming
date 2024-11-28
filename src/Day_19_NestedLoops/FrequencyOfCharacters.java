package Day_19_NestedLoops;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
         String str = "apple";
         int count = 0;
         String unique = "";

        for (int i = 0 ; i < str.length() ; i++) {

            count= 0;
            char outerLetter = str.charAt(i);
            if ( unique.contains("" + outerLetter)){
                continue;
            }



            for (int j = 0; j < str.length(); j++) {

                char innerLetter = str.charAt(j);

                if (outerLetter == innerLetter){
                    count++;
                }

            }

            System.out.println(outerLetter + " " + count);
            unique += outerLetter;
        }
    }
}
