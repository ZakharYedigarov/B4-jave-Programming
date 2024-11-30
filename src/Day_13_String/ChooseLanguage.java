package Day_13_String;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please, choose one of the options below:");
        System.out.print("\t1 - English\n\t2 - Spanish\n\t3 - Turkish\n\t4 - Russian\n\t5 - French\n\t6 - Azerbaijan\n\n\tYour Option: ");

        int userOption = key.nextInt(); // 4

        System.out.println();
        // OPTION 1 - with else-if
        if(userOption == 1) {
            System.out.println("\t\thello, thanks for your call");
        } else if (userOption == 2) {
            System.out.println("\t\thola, gracias para llamar");
        } else if (userOption == 3) {
            System.out.println("\t\tmerhaba, aradiginiz icin tesekkurler");
        } else if (userOption == 4) {
            System.out.println("\t\tprivet, spasibo za vash zvonok");
        } else if (userOption == 5) {
            System.out.println("\t\tMerci ,pour votre appel");
        } else if (userOption == 6){
            System.out.println("\t\tsalam, zeng ettiginiz ucun mennatdariq");
        } else {
            System.out.println("\t\tWe will use English by default");
        }


        System.out.println("-----------------------------------------");
        // OPTION 2 - with switch
        String message;
        switch (userOption){
            case 1:
                message = "\t\thello, thanks for your call";
                break;
            case 2:
                message = "\t\thola, gracias para llamar";
                break;
            case 3:
                message = "\t\tmerhaba, aradiginiz icin tesekkurler";
                break;
            case 4:
                message = "\t\tprivet, spasibo za vash zvonok";
                break;
            case 5:
                message = "\t\tMerci ,pour votre appel";
                break;
            case 6:
                message = "\t\tsalam, zeng ettiginiz ucun mennatdariq";
                break;
            default:
                message = "\t\tWe will use English by default";

        }
        System.out.println(message);
        // execution goes from MATCHING ONE and all the to first break; if no break exists, it will go all the way end of switch.



    }


}
