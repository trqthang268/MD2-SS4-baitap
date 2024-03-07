package baitap02;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public QuadraticEquation() {

    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void inputData(Scanner scanner) {
        System.out.println("Nhap gia tri a");
        a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap gia tri b");
        b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap gia tri c");
        c = Double.parseDouble(scanner.nextLine());
    }

    public double getDiscriminant() {
        double delta = b * b - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        double r1 = ((-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a));
        return r1;
    }
    public double getRoot2() {
        double r2 = ((-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a));
        return r2;
    }
}
