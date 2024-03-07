package baitap05;

import java.util.Scanner;

public class Sinhvien {
    private int idStudent;
    private String nameStudent;
    private int age;
    private boolean sex;
    private String address;
    private String phone;

    public Sinhvien() {

    };
    public Sinhvien(int idStudent, String nameStudent, int age, boolean sex, String address, String phone) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public int getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void inputStudent(Scanner scanner) {
        System.out.println("Nhập id");
        this.idStudent = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        this.nameStudent = scanner.nextLine();
        System.out.println("Nhập tuổi");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập địa chỉ");
        this.address = scanner.nextLine();
        System.out.println("Nhập phone");
        this.phone = scanner.nextLine();
    }

    public void displayStudent() {
        if (sex) {
            System.out.println("Sinhvien{" +
                    "idStudent= " + idStudent +
                    ", nameStudent= '" + nameStudent + "\'" +
                    ", age= " + age +
                    ", sex= Nam" +
                    ", address= '" + address + "\'" +
                    ", phone= '" + phone + "\'" +
                    "}"
            );
        } else {
            System.out.println("Sinhvien{" +
                    "idStudent= " + idStudent +
                    ", nameStudent= '" + nameStudent + "\'" +
                    ", age= " + age +
                    ", sex= Nữ" +
                    ", address= '" + address + "\'" +
                    ", phone= '" + phone + "\'" +
                    "}"
            );
        }
    }
}

