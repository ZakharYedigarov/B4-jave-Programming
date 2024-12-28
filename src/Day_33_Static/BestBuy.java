package Day_33_Static;

public class BestBuy {

    //Instance variable called location belongs to each object each has its own copy
    String location;

    // static variable  - belongs to all objects, one/ same for all
    static String headquarter = "7681 penn ave South, Richfield, MN";
    static String specialDay ="28 dec";
    // constructor helps to initialize the instance variable

    public BestBuy(String location) {
        this.location = location;

    }
    // Instance method - none static method
    public void openStore(){
        System.out.println("Opening the store in location: "+ location);
        // in Instance method we can reach both instance and static members
        System.out.println("Headquarter is " + headquarter);
    }
    // static method -
    public static void specialDaySale(){
        System.out.println("there %40-%70 discount on " + specialDay);
    }

    /*
    Static
        - All objects share / have the one / same copy
        - If it changes or gets updated all the objects get effected
        - we Use class name to reach the static members
            * Possible to use the object reference as well but not good approach
        - Static method only excepts Static members
        - In static method we can not use 'this.' keyword




    Instance
        - every object has it own copy
        - If instance for one object is changed/updated it only effects that object
        - we use object reference to each instance member
            * Not possible to use the Class name to each the instance members
        - Instance accepts Both Instance and Static members
     */
}
