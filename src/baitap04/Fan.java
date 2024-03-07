package baitap04;

public class Fan {
    private  String speed = "SLOW";
    private boolean isOn = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(String speed, boolean isOn, double radius, String color) {
        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }
    public Fan(){

    }

    public String getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if (isOn){
            return "Radius is "+radius +" Fan is off"+" Color is "+color;
        }else {
            return "Speed is "+speed+" Radius is "+radius +" Fan is on"+" Color is "+color;

        }
    }
}
