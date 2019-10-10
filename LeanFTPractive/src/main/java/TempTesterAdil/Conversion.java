package TempTesterAdil;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Conversion{
    public static void main(String[] args) {

        double doubleValue = 1_234_567.89;
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        NumberFormat intFormat = NumberFormat.getIntegerInstance();
        System.out.println(numberFormat.format(doubleValue));
        System.out.println(intFormat.format(doubleValue));



        Locale locale = new Locale("de", "DE");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyFormat.format(doubleValue));


    }

}


