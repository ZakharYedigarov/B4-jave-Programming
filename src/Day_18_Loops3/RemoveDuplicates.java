package Day_18_Loops3;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "adfkjhajdfhjaskjdfhkasj";
        String unique = "";
        int duplicates = 0;

        for (int i = 0; i < str.length() ; i++) {
            char eachChar = str.charAt(i);

            if (!unique.contains(eachChar+"")){
                unique += eachChar;
            }else duplicates++;



        }
        System.out.println(unique + " with out Duplicates");
        System.out.println(duplicates+ " Duplicates Chars");

    }
}
