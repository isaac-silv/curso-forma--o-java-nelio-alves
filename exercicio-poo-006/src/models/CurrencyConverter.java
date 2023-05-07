package models;

public class CurrencyConverter {
    public double currentValue;
    public double quantityToBuy;

    public double converter() {
        return currentValue * quantityToBuy + currentValue * quantityToBuy * 0.06;
    }

    public String toString() {
        System.out.println("Tax IOF = 6%");
        return "Amount to be paid in reais = " + String.format("%.2f", converter());
    }
}
