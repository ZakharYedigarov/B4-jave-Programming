package My_Utilities;

public class StringUtil {
    /**
     * this method fixes the format of the name
     * @param input  is provided name
     * @return the fixed format
     */
    public static String fixFormat (String input){

        String result = "";

        result = input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();

        return result;
    }

    /**
     * This method calculates how many times the given letter is in the given String
     * @param str given String
     * @param letter given Char
     * @return the number of the occurrence of the letter in the string
     */
    public static int frequencyOfLetters (String str, char letter){   // ("apple", 'p')
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter){
                count++;
            }
        }

        return count;
    }

    /**
     * this method will reverse given String
     * @param str given String version
     * @return gives a reversed version of the given String
     */
    public static String reverse (String str){
        String reversed = "";
        for (int i = str.length(); i >= 0  ; i--) {
            reversed += str.charAt(i);

        }
        return reversed;
    }

    /**
     * This method finds the character which are in the String more thant once.
     * @param str is the given String
     * @returns the letter which occurs more than once
     */
    public static String duplicateCharacters (String str) {

        String unique = "";
        String duplicates = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char eachLetterLoop1 = str.charAt(i);

            if (unique.contains(eachLetterLoop1 + "")) {
                continue;
            }

            for (int j = 0; j < str.length(); j++) {
                char eachLetterLoop2 = str.charAt(j);
                if (eachLetterLoop1 == eachLetterLoop2) {
                    count++;
                }
            }

            if (count > 1) {
                duplicates += eachLetterLoop1;
            }

            if (!unique.contains(eachLetterLoop1 + "")) {
                unique += eachLetterLoop1;
            }
        }
        return duplicates;
    }

    /**
     * this method find unique Characters in the given String
     * @param str given String
     * @return Unique chars in the String
     */
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
