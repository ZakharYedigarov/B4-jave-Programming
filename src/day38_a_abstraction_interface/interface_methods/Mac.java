package day38_a_abstraction_interface.interface_methods;

public interface Mac {
    // everything in the interface ---> 'public'
    // all the variables -->'public static final'
    // all the method without the body --> 'public abstract'
    //there us no Constructor at all (including default)
    // cannot have any blocks -->  static
    // possible to have 'default' and 'static' method


    // we can have total 4 things in interface

    // 1 - public static final variables / constant
    String NAME = "Apple";
    String OS = "Ios";

    // 2 - public abstract methods
    void turnOn();

    // 3 - public static method
    static void company(){
        System.out.println("Company name: "+ NAME);
        System.out.println("Operating System: "+ OS);

    };

    // 4 - default method | default is not the access modifier in the interface
    default void faceTime(){
        System.out.println("Calling with FaceTime");
    }
}
