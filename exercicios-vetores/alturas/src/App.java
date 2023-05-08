import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        double somaAltura = 0;
        double idadeAbaixo = 0;
        List<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            somaAltura += pessoas[i].getAltura();

            if (pessoas[i].getIdade() < 16) {
                idadeAbaixo++;
                names.add(pessoas[i].getName());
            }
        }

        double mediaAltura = somaAltura / n;
        double menorDezesseis = idadeAbaixo / n * 100;
        System.out.println("Altura média: " + String.format("%.2f", mediaAltura));
        System.out.println("Pessoas com menos de 16 anos: " + menorDezesseis + "%");
        System.out.println(names.toString());

    }
}
