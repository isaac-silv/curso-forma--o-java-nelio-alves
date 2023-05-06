import java.util.Locale;
import java.util.Scanner;

import models.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Informe o nome do produto:");
        product.name = sc.nextLine();
        System.out.println("Informe o preço do produto:");
        product.price = sc.nextDouble();
        System.out.println("Informe a quantidade do produto:");
        product.quantity = sc.nextInt();

        System.out.println("Produto: " + product.name);
        System.out.println("Preço: " + product.price);
        System.out.println("Quantidade: " + product.quantity);

        System.out.println("Informe a quantidade do produtor " + product.name + " que deseja adicionar no estoque:");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println(
                "Produto: " + product.name
                        + ", Quantidade: " + product.quantity
                        + ", Total: " + product.getTotal());

        System.out.println("Informe a quantidade do produtor " + product.name + " que deseja remover do estoque:");
        quantity = sc.nextInt();
        product.removeProduct(quantity);
        System.out.println(
                "Produto: " + product.name
                        + ", Quantidade: " + product.quantity
                        + ", Total: " + product.getTotal());

    }
}
