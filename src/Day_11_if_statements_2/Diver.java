package Day_11_if_statements_2;

public class Diver {   public static void main(String[] args) {

    int oxygenLevel = 40;


//        if (oxygenLevel > 50) {
//            System.out.println("Be careful now you are at 50%");
//        } else if (oxygenLevel > 60) {
//            System.out.println("Start to head back");
//        } else if (oxygenLevel > 70) {
//            System.out.println("Don't go too far");
//        } else if ( oxygenLevel > 80) {
//            System.out.println("Still okay");
//        } else if (oxygenLevel > 90) {
//            System.out.println("Your tank is full");
//        }


    if (oxygenLevel > 90 ) {
        System.out.println("Your tank is full");
    } else if (oxygenLevel > 80) {
        System.out.println("Still okay");
    } else if (oxygenLevel > 70) {
        System.out.println("Don't go too far");
    } else if ( oxygenLevel > 60) {
        System.out.println("Start to head back");
    } else if (oxygenLevel > 50) {
        System.out.println("Be careful now you are at 50%");
    } else {
        System.out.println("See you in heaven");
    }
}
}
