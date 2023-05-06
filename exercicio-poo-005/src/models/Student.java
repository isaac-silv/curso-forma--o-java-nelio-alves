package models;

public class Student {

    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double calc() {
        return n1 + n2 + n3;
    }

    public double missingNote() {
        return 60.00 - calc();
    }
}