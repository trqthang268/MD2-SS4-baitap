package baitap02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.inputData(scanner);
        double delta = quadraticEquation.getDiscriminant();
        double r1 = quadraticEquation.getRoot1();
        double r2 = quadraticEquation.getRoot2();
        if (delta>0){
            System.out.println("The equation has two roots:" + r1 +" and "+r2 );
        } else if (delta==0) {
            System.out.println("The equation has one roots:"+ r1);
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
