package day36_inheritance2.app;

public class Instagram extends App {
    public Instagram( double version) {
        super("Instagram", version);

    }

    public void postPicture() {
        System.out.println("Posting picture to "+ name);

    }


}
