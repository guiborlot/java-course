package util;

public class CurrencyConverter {

    public static double converter(double dollarPrice, double dollarAmount){
        double dollarIOF = dollarAmount + (dollarAmount * 0.06);
        return dollarPrice * dollarIOF;
    }

}
