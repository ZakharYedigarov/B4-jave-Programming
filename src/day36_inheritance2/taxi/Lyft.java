package day36_inheritance2.taxi;

public class Lyft {
    String driverName;
    public Lyft(String driverName) {
        this.driverName = driverName;
    }

    //instance method
    public double calculateRate(int miles) {
        return miles * 2.5;
    }
}
