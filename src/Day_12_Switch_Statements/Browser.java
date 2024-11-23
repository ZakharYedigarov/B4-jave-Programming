package Day_12_Switch_Statements;

//import javax.swing.*;
//import java.text.BreakIterator;
import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a browser type: ");
        String browser = key.nextLine();

        System.out.print("What is the webpage you want to navigate to: ");
        String webpage = key.next();

        switch (browser){
            case "Chrome":
                System.out.println("Opening " + webpage);
                break;
            case "Safari":
                System.out.println("Opening " + webpage + "Safari");
                break;
            case "Firefox":
                System.out.println("Opening " + webpage + "Firefox");
                break;
            case "Opera":
                System.out.println("Opening " + webpage + "Opera");
                break;
            case "Tor":
                System.out.println("Opening " + webpage + "Tor");
                break;
            default:
                System.out.println("We do not have " + browser);
        }


    }
}
