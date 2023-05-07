import java.util.Locale;
import java.util.Scanner;

import models.CurrencyConverter;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.println("What is the dollar price? ");
        currencyConverter.currentValue = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        currencyConverter.quantityToBuy = sc.nextDouble();
        System.out.println(currencyConverter);
    }
}