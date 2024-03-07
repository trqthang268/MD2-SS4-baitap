package baitap01;

import java.util.Scanner;

public class Circle {
    private Integer banKinh;
    private String color;

    public Circle(Integer banKinh, String color) {
        this.banKinh = banKinh;
        this.color = color;
    };
    public Circle(){

    };

    public Integer getBanKinh() {
        return banKinh;
    }

    public String getColor() {
        return color;
    }

    public void setBanKinh(Integer banKinh) {
        this.banKinh = banKinh;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double chuvi(){
        double cv = 2*3.14*banKinh;
        System.out.println("Chu vi hình tròn là: "+cv);
        return cv;
    }
    public double dienTich(){
        double dt = 3.14*banKinh*banKinh;
        System.out.println("Diện tích hình tròn là: "+dt);
        return dt;
    }
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn: ");
        banKinh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập màu hình tròn");
        color = scanner.nextLine();
    }
    public void displayData(){
        System.out.println("Bán kính hình tròn là: "+banKinh);
        System.out.println("Màu hình tròn là: "+color);
    }

}
