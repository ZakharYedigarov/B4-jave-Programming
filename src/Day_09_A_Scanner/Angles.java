package Day_09_A_Scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isTriangle, isCircle;

        System.out.println("Enter 3 angles (In decimals): ");
        double angle1 = input.nextDouble();
        double angle2 = input.nextDouble();
        double angle3 = input.nextDouble();

        isTriangle = angle1 +angle2 + angle3 == 180;
        isCircle = angle1 + angle2 + angle3 == 360;

        System.out.println("It is triangle: " + isTriangle);
        System.out.println("It is a circle: " + isCircle);



    }
}
