package Day_20_NestedLoops2;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str= "AbbCD$CSTGF(";


        for (int i = 0; i < str.length(); i++) {
            char eachLetter1stLoop = str.charAt(i);  // AbbCD$CSTGF(
            int count = 0;

            for (int j = 0; j <str.length() ; j++) {

                char eachLetter2ndLoop = str.charAt(j); // AbbCD$CSTGF(

                if (eachLetter1stLoop == eachLetter2ndLoop){
                    count++;
                }

            }

            if (count == 1){
                System.out.print(eachLetter1stLoop);
            }
        }
    }
}
