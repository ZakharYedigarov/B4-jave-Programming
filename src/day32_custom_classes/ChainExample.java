package day32_custom_classes;

public class ChainExample {
    //first constructor non parameterized
    public ChainExample (){
        System.out.println("First");
    }
    // 2nd Constructor - parameterized (int)
    public ChainExample(int i){
        this();
        System.out.println("Second");

    }
    // 3rd Constructor - parameterized (String)
    public ChainExample(String str){
        this(4);
        System.out.println("Third");

    }
}

/* Constructors
  Rules for Constructor Chaining
   1 - this() should always be first
   2 - only one constructor can be called in the same constructor
   3 - constructor should not call itself
   4 - Constructors should not contain itself in the chaining with multiple constructors

 */
