package baitap1;

public class Circle {
    private double r;String color;

    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public Circle() {
        
    }

    public Circle(double r) {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double dienTich(){
        return Math.PI * (this.r * this.r);
    }
}
