package Day_24_Methods;

public class Car {
    public static void unlockCar(){
        System.out.println("Unlocking the car.");
    }
    public static void openDoor(){
        System.out.println("Opening the door.");
    }
    public static void sitInTheCar(){
        System.out.println("Sitting in the car.");
        System.out.println("Closing the door.");
    }
    public static void getReady(){
        System.out.println("Get ready:");
        System.out.println("\tPutting on the seatbelt");
        System.out.println("\tCheck the mirrors.");
        System.out.println("\tTurn on music.");
        System.out.println("\tPut on navigation");
    }
    public static void startingTheEngine(){
        System.out.println("Starting the car");
    }
    public static  void drive (){
        System.out.println("Swtich the gear in to D");
        System.out.println("Drive and go");
    }
    public static void driveInRush(){
        unlockCar();
        sitInTheCar();
        startingTheEngine();
        drive();

    }


    public static void main(String[] args) {
        unlockCar();
        openDoor();
        sitInTheCar();
        getReady();
        startingTheEngine();
        drive();

        System.out.println("-------------------");

        driveInRush();



    }
}
