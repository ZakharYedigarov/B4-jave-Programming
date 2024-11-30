package Day_14_String;

import java.util.Scanner;

public class Filter {public static void main(String[] args) {
    // ClassName objectReferenceName = actual object
    Scanner key = new Scanner(System.in);
    System.out.print("Please, enter a message: ");
    String message = key.nextLine();
    // String message = key.nextLine().trim().toLowerCase();

    System.out.println("Original Message: " + message);

    message = message.trim(); // Hey, today is Thursday. The class is so easy today. We are bored. Java is good. We are dedicated to have fun.
    message = message.toLowerCase();

    System.out.println("Updated message: " + message);

    boolean hasBadPhrase = message.contains("java is bad") ||
            message.contains("quit") ||
            message.contains("have fun") ||
            message.contains("crying");

    // OPTION 1 - with IF ELSE
    if (hasBadPhrase) {
        System.out.println("Message failed to send!");
    } else {
        System.out.println("\"" + message + "\" sent!");
    }


    // OPTION 2 - with TERNARY
    // System.out.println(hasBadPhrase ? "Message failed to send!" : ("\"" + message + "\" sent!" ));
}

}
