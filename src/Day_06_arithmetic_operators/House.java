package Day_06_arithmetic_operators;

public class House {
    public static void main(String[] args) {
        // We can declare same datatype variables in ONE statement
        String houseType, address;
        houseType = "Single House";
        address = "123 Test Dr, Fairfax, VA";

        // We can declare and initialize (give the initial value) same datatype variables in ONE statement
        int numOfBedroom = 5, numOfKitchen = 2, zipCode = 12345;

        double numOfBathroom = 2.5;
        double costOfHouse = 999_999.99; //999,999.99
        double schoolRatings = 4.75;

        boolean hasBasement = true;
        boolean hasAttic = false;
        boolean hasPool = true;
        boolean isForSale = true;
        boolean hasNearByPark = false;

        /*
            I am looking for "$houseType" which is located in $address $zipCode. It has $numOfBedroom bedroom and $numOfKitchen kitchen as well as $numOfBathroom bathroom. The cost of the house is $$costOfHouse.

            The house has the following additional info:
                School Ratings:     $schoolRatings
                Has Basement:       $hasBasement
                Has Attic:          $hasAttic
                Has Pool:           $hasPool
                Is For Sale:        $isForSale
                Has nearby Park:   $hasNearByPark
         */

        String result = "I am looking for \"" + houseType + "\" which is located in " + address + ", " +zipCode + ". \nIt has " + numOfBedroom + " bedroom and " + numOfKitchen + " kitchen as well as " + numOfBathroom + " bathroom. \nThe cost of the house is $" + costOfHouse + ".\n\nThe house has the following additional info:\n\tSchool Ratings:\t\t" + schoolRatings + "\n\tHas Basement:\t\t" + hasBasement + "\n\tHas Attic:\t\t\t" + hasAttic + "\n\tHas Pool:\t\t\t" + hasPool + "\n\tIs For Sale:\t\t" + isForSale + "\n\tHas nearby Park:\t" + hasNearByPark;

        System.out.println(result);
        System.out.println();
        // Benefit of re-using the variables is that we do not write whole code again and again.
        System.out.println(result);
        System.out.println();
        System.out.println("I am looking for \"" + houseType + "\" which is located in " + address + ", " +zipCode + ". \nIt has " + numOfBedroom + " bedroom and " + numOfKitchen + " kitchen as well as " + numOfBathroom + " bathroom. \nThe cost of the house is $" + costOfHouse + ".\n\nThe house has the following additional info:\n\tSchool Ratings:\t\t" + schoolRatings + "\n\tHas Basement:\t\t" + hasBasement + "\n\tHas Attic:\t\t\t" + hasAttic + "\n\tHas Pool:\t\t\t" + hasPool + "\n\tIs For Sale:\t\t" + isForSale + "\n\tHas nearby Park:\t" + hasNearByPark);

    }
}
