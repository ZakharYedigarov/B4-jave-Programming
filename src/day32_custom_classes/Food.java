package day32_custom_classes;

public class Food {
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;


    public Food(String name) {
        this.name = name;
    }

    public Food(String name, int quantity) {
        this(name);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Food" +
                "\nname: " + name +
                "\nquantity: " + quantity +
                "\nunitPrice: " + unitPrice +
                "\ntotalPrice: " + totalPrice;
    }

    public Food(String name, int quantity, double unitPrice) {
        this(name,quantity);
        this.unitPrice = unitPrice;
        calculateTotalPrice();

    }
    // Instance method - does not have Static
    public void calculateTotalPrice(){
        totalPrice = unitPrice + quantity;
    }
}
