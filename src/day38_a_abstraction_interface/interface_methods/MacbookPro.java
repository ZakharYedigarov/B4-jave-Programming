package day38_a_abstraction_interface.interface_methods;

public class MacbookPro implements Mac {
    @Override
    public void turnOn() {
        System.out.println("Turning on macbook");
    }
}


class Runner{
    public static void main(String[] args) {

        // reaching static member with interface is fine
        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);

        System.out.println();

        // reaching static member with class is fine
        System.out.println(MacbookPro.NAME);
        System.out.println(MacbookPro.OS);

        System.out.println();

        // Reaching abstract method with interface name  -- > not valid
        // Mac.turnOn();

        // Reaching overridden method(instance method) with class name - NOT VALID
        //MacbookPro.turnOn();
        MacbookPro mac = new MacbookPro();
        mac.turnOn();
        mac.faceTime();

        System.out.println();

        //Reaching static member with interface -- > VAlID
        Mac.company();
        // Reaching the static member with class name --> NOTVALID
        // MacbookPro.company(): // ONLY can be called with its own interface name
        // mac.company();  // ONLY can be called with its own interface name

        System.out.println();
        // reaching the default method with interface name --> NOT VALID
        // Mac.faceTime(); // non-static canNOT be ca;;ed by interface name

        // reaching the default method with class name ---> NOT VALID
        //MacbookPro.facetime(): // non - static CanNot be called by class name
        mac.faceTime();

    }
}
