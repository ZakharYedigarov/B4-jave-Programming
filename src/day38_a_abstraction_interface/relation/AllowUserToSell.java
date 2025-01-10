package day38_a_abstraction_interface.relation;

import day38_a_abstraction_interface.shopping.Shipping;

public interface AllowUserToSell {

    void sell(); // By default ---> this is public abstract

    // Going from Interface to Interface is still INHERITANCE. so we use 'extends'
    // Interface can extend multiple interface
    interface Consumer extends AllowUserToSell {




    }

    class runner{
        public static void main(String[] args) {



        }
    }

    // going from interface to class(is the one that gets additional info from the interface), we use 'implements'
    abstract class Test implements AllowUserToSell, Shipping {

    }
}
