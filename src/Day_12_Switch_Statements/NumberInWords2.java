package Day_12_Switch_Statements;

public class NumberInWords2 {public static void main(String[] args) {
    int num = 1;    // 1 - 5  ---- it is not in the rage of 1-5

    // switch case
    switch (num) { // String, char, int, short, byte


        case 1:
            System.out.println("One");
            break;
        case 2:
            System.out.println("Two");
            break;
        case 3:
            System.out.println("Three");
            break;
        case 4:
            System.out.println("Four");
            break;
        case 5:
            System.out.println("Five");
            break;
        default: // else part -
            System.out.println("Not in range 1-5");
            break; //  if default statement is the last one you do not need the break.


        // If you do not put "break;" -- >  execution goes from matching case all the way until the first "break" or all the way to the end


    }
}}
