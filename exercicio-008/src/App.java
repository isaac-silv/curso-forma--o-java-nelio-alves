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

            emp.add(new Employee(id, name, salary));
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int e = sc.nextInt();
        Integer index = impIndex(emp, e);

        if(index == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double value = sc.nextDouble(); 
            emp.get(index).increaseSalary(value);
        }
                  
        System.out.println("Employees: ");
        for (Employee x : emp) {            
            System.out.println(x);
        }

    }
    private static Integer impIndex(List<Employee> list, int id) {
        for (int i = 0; i< list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }           
        }
        return null;
    }
 }
