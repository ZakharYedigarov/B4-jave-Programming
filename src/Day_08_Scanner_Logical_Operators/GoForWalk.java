package Day_08_Scanner_Logical_Operators;

public class GoForWalk {
    public static void main(String[] args) {
        boolean isRaining = true;
        int temperature = 50;

        boolean isGoodToWalk = isRaining && temperature > 70;
        // AND ---- > true and true ---- > true

        System.out.println("Is it good to go for a wall: " + isGoodToWalk);
    }
}
