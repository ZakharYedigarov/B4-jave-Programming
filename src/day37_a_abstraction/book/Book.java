package day37_a_abstraction.book;

public class Book implements Create{

    @Override
    public void read() {
        System.out.println("Book reading");

    }

    @Override
    public void write() {
        System.out.println("Book written");
    }
}
