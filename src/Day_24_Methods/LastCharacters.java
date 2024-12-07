package Day_24_Methods;

public class LastCharacters {
    public static void main(String[] args) {
        String [] [] str = {  {"James", "is", "back"},
                              {"he", "was", "never", "gone"},
                              {"methods", "tomorrow"}};
        for (String [] eachSingle : str ){
            String lastChar = "";

            for (String eachElement: eachSingle){
                lastChar += eachElement.charAt(eachElement.length()-1);
            }

            System.out.println(lastChar);
        }

        //Implement the same code with the traditional loop: For i
    }
}
