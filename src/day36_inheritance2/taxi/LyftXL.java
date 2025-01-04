package day36_inheritance2.taxi;

public class LyftXL extends Lyft{
    public LyftXL(String driverName) {
        super(driverName);
    }
    @Override
    public double calculateRate(int miles){
        return super.calculateRate(miles) * 1.20;
    }
}
