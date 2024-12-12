package Day_25_Cont_Custom_Methods;

public class CurrencyConverter {
    public static void main(String[] args) {

        System.out.println(convertCurrency("euro", 100));
        System.out.println(convertCurrency("rupee", 100));
        System.out.println(convertCurrency("yene", 100));
        System.out.println(convertCurrency("Won", 100));

    }
    // void vs return ------> return ----- > double
    // param vs non-param -----> parameterized -----> (String currencyName, double amount)
    public static double convertCurrency(String currencyName, double dollarAmount){
        double result = 0.0;

        switch (currencyName.toLowerCase()){
            case "euro":
                result = dollarAmount * 0.95;
                break;
           case "yene":
                result = dollarAmount * 150;
                break;
           case "lira":
               result = dollarAmount * 34.88;
               break;
           case "won":
               result = dollarAmount * 1423.00;
               break;
           case "rupee":
               result = dollarAmount * 84.86;
               break;
       }

        return result;
    }
}
