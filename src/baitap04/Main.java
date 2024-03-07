package baitap04;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan("FAST",false,10,"yellow");
        Fan fan2 = new Fan("MEDIUM", true, 5, "blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
