package models;

public class Product {
    public String name;
    public double price;
    public int quantity;
    public double total;

    public double getTotal() {
        return price * quantity;
    }

    public double totalValueInStock() {
        return this.quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }
}
