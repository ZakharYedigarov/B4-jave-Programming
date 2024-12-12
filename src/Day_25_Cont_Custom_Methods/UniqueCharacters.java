package Day_25_Cont_Custom_Methods;

import My_Utilities.StringUtil;

public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(uniqueCharacters("apple"));
    }


    public static String uniqueCharacters (String str ){
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if (StringUtil.frequencyOfLetters(str, eachChar) == 1){
                unique += eachChar;
            }

        }

        return unique;
    }




}
