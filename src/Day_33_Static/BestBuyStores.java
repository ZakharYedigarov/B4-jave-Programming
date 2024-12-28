package Day_33_Static;

public class BestBuyStores {
    public static void main(String[] args) {
        BestBuy store1 = new BestBuy("Arlington, VA");
        BestBuy store2 = new BestBuy("Paramus, NJ");
        BestBuy store3 = new BestBuy("Orlando, FL");
        // what is the good way to call the static member
        //Calling static member by object ref is fine but not good
        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);

        // Proper way is to use Class name to call static members
        System.out.println(BestBuy.headquarter);

        // Can i call the instance members by class name?
        // no - because each object has its own coppy
        //System.out.println(BestBuy.location);

        BestBuy.headquarter = "900 penn ave South, Richfield, MN";

        System.out.println(store1.headquarter);
        System.out.println(store2.headquarter);
        System.out.println(store3.headquarter);
        System.out.println();
        System.out.println(store1.specialDay);
        System.out.println(store2.specialDay);
        System.out.println(store3.specialDay);
        System.out.println("------------------------------------------");
        //instance methods / member can not be reached by class name
        //BestBuy.openStore();

        store1.openStore();
        store2.openStore();
        store3.openStore();

        BestBuy.specialDaySale();// good practice
        store1.specialDaySale(); // not recommended
    }
}
