package baitap05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sinhvien[] sinhviens = new Sinhvien[100];
        Scanner scanner = new Scanner(System.in);
        int indexStudent = 0;
        int choise;
        do{
            System.out.println("=========MENU==========");
            System.out.println("1. Xem thông tin sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.println("Nhập số muốn thực thi");
            choise = Integer.parseInt(scanner.nextLine());
            switch (choise){
                case 1:
                    for (int i = 0; i < indexStudent; i++) {
                        sinhviens[i].displayStudent();
                    }
                    break;
                case 2:
                    System.out.println("Nhập số lượng sinh viên cần nhập thông tin");
                    int number = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < number; i++) {
                        sinhviens[indexStudent]= new Sinhvien();
                        sinhviens[indexStudent].inputStudent(scanner);
                        indexStudent++;
                    }
                    break;
                case 3:
                    System.out.println("Nhập id sinh viên cần sửa");
                    int id = Integer.parseInt(scanner.nextLine());
                    for (int i = 0;i< indexStudent;i++){
                        if (sinhviens[i].getIdStudent()==id){
                            sinhviens[i].inputStudent(scanner);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập id sinh viên muốn xóa");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < indexStudent; i++) {
                        if (sinhviens[i].getIdStudent()==idDelete){
                            for (int j = i; j < indexStudent-1; j++) {
                                sinhviens[j]=sinhviens[j+1];
                            }
                            indexStudent--;
                            break;
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Nhập liệu sai, xin hãy nhập lại");
                    break;
            }
        }while (true);

    }
}
