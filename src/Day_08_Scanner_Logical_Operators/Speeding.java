package Day_08_Scanner_Logical_Operators;

public class Speeding {
    public static void main(String[] args) {
        int currrentSpeed = 20;
        int speedLimit = 25;
        // you can go little higher by 5

        boolean isSpeeding = currrentSpeed > speedLimit + 5;

        System.out.println("you are speeding: " + isSpeeding);

        System.out.println("Speeding limit in law in this area is: " + speedLimit);

    }
}
