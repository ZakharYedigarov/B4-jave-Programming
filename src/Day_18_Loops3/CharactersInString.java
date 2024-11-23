package Day_18_Loops3;

import java.util.Scanner;

public class CharactersInString {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Please Enter name: ");
        String name = key.nextLine();

        for (int i = 0; i < name.length() ; i++) {
            int asciiNum = name.charAt(i);

            System.out.println(asciiNum);

        }

    }
}
