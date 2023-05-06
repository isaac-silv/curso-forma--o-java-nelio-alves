import java.util.Locale;
import java.util.Scanner;

import models.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Name: ");
        employee.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();

        System.out.println("Employee: " + employee);
        System.out.println();

        System.out.println("Which percentage to increase salary?");
        double increase = sc.nextDouble();
        employee.increaseSalary(increase);
        System.out.println();

        System.out.println("Updated data: " + employee);
    }
}
