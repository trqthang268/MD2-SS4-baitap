package baitap06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];
        for (int i = 0; i < 5; i++) {
            employees[i]=new Employee();
            employees[i].inputData(scanner);
        }
        for (int i = 0; i < 5; i++) {
            employees[i].displayData();
        }
    }
}
