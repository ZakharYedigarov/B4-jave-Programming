package Day_30_B_Custom_Classes;

public class App {

    // INSTANCE Variables / FIELDS  --- NOT method

    String name;
    double version;
    boolean isFree;



    // Build some action/function for this Class / blueprint / template
    // INSTANCE METHOD / NON-STATIC method
    // Each object will run its own version
    // Since run() is INSTANCE method, we cannot call by Class name
    public void run () {
        System.out.println(name + " is running....");
    }


    public void update () {
        System.out.println(name + " is updating....");
        version += 1;
    }


}

