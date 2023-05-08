import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import models.Rent;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Rent[] rents = new Rent[10];

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            rents[room - 1] = new Rent(name, email);
        }

        System.out.println("Budy rooms:");
        for (int i = 0; i < rents.length; i++) {
            if (rents[i] != null) {
                System.out.println((i + 1) + ": " + rents[i].getName() + ", " + rents[i].getEmail());
            }
        }
    }
}
