package Day_33_Static;
// Template class - send the instruction for each object of this class
public class Song {
    // Instance variable - each object has its own set of copies - no Static

    String name;
    double length;
    String singer;
    String genre;
    //CONSTRUCTOR - special method, used to initialize the instance variable


    public Song (String name) {
        //name=name Here compl
        this.name = name; // we can use "this." to make the difference
    }

    @Override
    public String toString() {
        return "Song" +
                "\nname: " + name +
                "\nlength: " + length +
                "\nsinger: " + singer +
                "\ngenre: " + genre;
    }

    public Song(String name, double length) {
        this(name);
        this.length = length;
    }

    public Song(String name, double length, String singer, String genre) {
        this(name, length);
        this.singer = singer;
        this.genre = genre;
    }
}
