import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        System.out.print("Numeros: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", numeros[i]);
        }

        System.out.println();
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += numeros[i];
        }
        System.out.println("Soma = " + soma);

        double media = soma / n;
        System.out.println("Media = " + media);

    }
}
