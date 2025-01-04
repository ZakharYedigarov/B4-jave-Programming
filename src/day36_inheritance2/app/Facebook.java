package day36_inheritance2.app;

public class Facebook extends App{
    public Facebook(double version){
        super("Facebook", version);
    }
    public void watchVideo(){
        System.out.println("Watching video on " + name);
    }
}
