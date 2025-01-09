package day37_a_abstraction.book;

public class Runner {
    public static void main(String[] args) {
        Book obj = new Book();
        obj.read();
        obj.write();
        System.out.println(obj.NAME); // not good way to call the object
        System.out.println(Book.NAME);
        System.out.println(Create.NAME);
    }
}
