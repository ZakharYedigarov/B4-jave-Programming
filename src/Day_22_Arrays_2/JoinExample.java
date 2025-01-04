package Day_22_Arrays_2;

public class JoinExample {
    public static void main(String[] args) {
        String [] str = {"a", "b", "c"};

        System.out.println(String.join("_", str));
        System.out.println(String.join("", str).substring(0,1));
        // since this returns you string you can apply other methods like substing or .toUpperCase




    }
}
