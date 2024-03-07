package baitap06;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private boolean gen;
    private double rate;
    private double salary;
    public Employee(){

    }

    public Employee(int employeeId, String employeeName, int age, boolean gen, double rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = salary;
    }
    public void inputData(Scanner scanner){
        System.out.println("Enter Employee ID");
        this.employeeId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Employee Name");
        this.employeeName= scanner.nextLine();
        System.out.println("Enter Employee Age");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Employee Gender");
        this.gen = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Enter Employee Rate");
        this.rate = Double.parseDouble(scanner.nextLine());
        this.salary = calSalary();
    }
    public void displayData(){
        if(gen){
        System.out.println("Employee{"+
                "employeeId="+employeeId+
                ", employeeName='"+employeeName+"\'"+
                ", age="+age+
                ", gen='male'"+
                ", rate="+rate+
                ", salary="+salary+
                "}"
        );
        }else {
            System.out.println("Employee{"+
                    "employeeId="+employeeId+
                    ", employeeName='"+employeeName+"\'"+
                    ", age="+age+
                    ", gen='female'"+
                    ", rate="+rate+
                    ", salary="+salary+
                    "}"
            );
        }
    }
    public double calSalary(){
        return this.rate*1300000;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getAge() {
        return age;
    }

    public boolean isGen() {
        return gen;
    }

    public double getRate() {
        return rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGen(boolean gen) {
        this.gen = gen;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
