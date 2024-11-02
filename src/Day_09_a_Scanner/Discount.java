package Day_09_a_Scanner;

public class Discount {
    public static void main(String[] args) {
        boolean isWeekend, isTeacher, isOfficer, isFireFighter;
        isWeekend = false;
        isTeacher = false;
        isOfficer = true;
        isFireFighter = false;

        boolean isEligibleForDiscount = isWeekend && (isOfficer || isTeacher || isFireFighter);
        //                                  true  &&  ( false  ||    true   ||     false)
        //                                      true && (     true          ||     false)
        //                                             true  &&  (       true    )
        //                                                  true

        System.out.println("Is Eligible For Discount = " + isEligibleForDiscount);


    }
}
