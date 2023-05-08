import java.util.Locale;
import java.util.Scanner;

import models.BankAccount;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        String accountNumber = sc.nextLine();
        System.out.println("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.println("Is there na initial deposit? (y/n) ");
        String initialDeposit = sc.nextLine();
        double initialDepositValue = 0;
        if (initialDeposit.equals("y")) {
            System.out.println("Enter initial deposit value: ");
            initialDepositValue = sc.nextDouble();
        }

        BankAccount ba = new BankAccount(holder, accountNumber, initialDepositValue);

        System.out.println();
        System.out.println("Account data:");
        System.out.println(ba);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        ba.deposit(depositValue);
        System.out.println(ba);

        System.out.println();
        System.out.println("Enter a withdraw value");
        double withdrawValue = sc.nextDouble();
        ba.withdraw(withdrawValue);
        System.out.println(ba);

    }
}
