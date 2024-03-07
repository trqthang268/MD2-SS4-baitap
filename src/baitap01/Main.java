package baitap01;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(9,"Xanh");
        Circle circle2 = new Circle();

        circle1.chuvi();
        circle1.dienTich();

        circle2.inputData();
        circle2.displayData();
        circle2.chuvi();
        circle2.dienTich();
    }
}
