package day36_inheritance2.taxi;

import Day_24_Methods.Car;

import java.util.ArrayList;

public class CarRider {
    public static void main(String[] args) {
        Lyft l = new Lyft("Feyruz");
        System.out.println("cost: $"+ l.calculateRate(10));


        LyftXL xl = new LyftXL("Feyruz");
        System.out.println("cost: $"+ xl.calculateRate(10));



    }
}
