import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        List<Employee> emp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Emplyoee #" + i + ": ");
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            emp.add(new Employee(null, name, null));
        }

        System.out.print("Enter the employee id that will have salary increase :");
        int e = sc.nextInt();
        System.out.print("Enter the percentage: ");
        double value = sc.nextDouble();

        emp.stream().filter(x -> x.getId() == e)
    }
}
