package day36_inheritance2.app;

public class App {
    // Instance variables --> based on the access modifier, they inherit the child class if there is inheritance
    String name;
    double version;



    public App(String name, double version) {
        this.name = name;
        this.version = version;
    }

    // Instance method --> based on the access modifier, they inherit the child class if there is inheritance
    public void download(){
        System.out.println("Downloading " + name + " version " + version);
    }
}
