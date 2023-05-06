import java.util.Locale;
import java.util.Scanner;

import models.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.name = sc.nextLine();
        student.n1 = sc.nextDouble();
        student.n2 = sc.nextDouble();
        student.n3 = sc.nextDouble();

        double calc = student.calc();
        System.out.println("FINAL GRADE = " + String.format("%.2f", calc));
        if (calc > 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f", student.missingNote()) + " POINTS");
        }
    }
}
