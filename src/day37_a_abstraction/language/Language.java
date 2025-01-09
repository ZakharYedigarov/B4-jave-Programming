package day37_a_abstraction.language;

public interface Language {
    // by default, it is  ' Public Static Final '
    String PLANET = "Earth";
    // by default these are public abstract methods
    void sayHello();
    void sayGoodbye();

    //Default method
    public default void sayBye() {

    }
    // this is a static method - since we have static variable, it is possible to have a static method using static
    public static void sayHelloWorld() {

    }
}
