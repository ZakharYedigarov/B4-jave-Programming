package Day_30_B_Custom_Classes;

public class Item {
    // Instance variables
    String name;
    double price;


    // Special Instance method
    public String toString () {
        String message = "Item: " +
                "\n\tItem Name: " + name +
                "\n\tItem Price: $" + price;

        return message;
    }
}
