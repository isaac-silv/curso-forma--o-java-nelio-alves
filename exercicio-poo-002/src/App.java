import java.util.Locale;
import java.util.Scanner;

import models.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do produto:");
        String name = sc.nextLine();
        System.out.println("Informe o preço do produto:");
        double price = sc.nextDouble();
        System.out.println("Informe a quantidade do produto:");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println("Dados do produto: " + product);

        System.out.println("Informe a quantidade do produtor " + product.name + " que deseja adicionar no estoque:");
        quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Atualização do produto: " + product);

        System.out.println("Informe a quantidade do produtor " + product.name + " que deseja remover do estoque:");
        quantity = sc.nextInt();
        product.removeProduct(quantity);
        System.out.println("Atualização do produto: " + product);

    }
}
