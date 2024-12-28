package Day_32_Custom_Classes;

public class Store {
    public static void main(String[] args) {
        Food food1 = new Food("Apple");
        System.out.println(food1);

        System.out.println();

        Food food2 = new Food("Orange",5);
        System.out.println(food2);

        System.out.println();
        Food food3 = new Food("Banana",2,3.99);
        System.out.println(food3);
    }
}
