package day37_a_abstraction.language;

public class Translator {
    public static void main(String[] args) {
        Spanish spanish = new Spanish();
        spanish.sayHello();
        spanish.sayGoodbye();

        Turkish turkish = new Turkish();
        turkish.sayHello();
        turkish.sayGoodbye();
        System.out.println(Turkish.PLANET);
    }
}
