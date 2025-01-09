package day37_a_abstraction.book;

// Interface is another way of achieving ABSTRACTION
public interface Create {
    // Variable - > by default it is public static final - Constant - has to be initialized
    // public static final  String NAME = "java";
    String NAME = "Java"; // same as the above no need to declare 'public static final'

    // methods with return type and name and () - is by default it is public abstract
    // public abstract read(); // same as the below no need to declare 'public static final'
    void read();

    void write();


}
