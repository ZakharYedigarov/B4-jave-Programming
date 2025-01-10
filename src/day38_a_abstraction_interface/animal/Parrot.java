package day38_a_abstraction_interface.animal;

// Concrete Class / Non-Abstract Class
public class Parrot extends Bird implements Flyable {

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void useWings() {
        System.out.println("Parrot has wings");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }


    public void sayHello() {
        System.out.println("Gu Gu");
    }


    public void sayGoodbye() {
        System.out.println("Du Du");
    }
}