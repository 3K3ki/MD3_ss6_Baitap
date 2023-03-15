package baitap1;

public class Cylinder extends Circle{
    private double height; double R;
    public Cylinder(double r, String color,int height, double R) {
        super(r, color);
        this.height=height;
        this.R = R;
    }

    public Cylinder() {

    }

    public Cylinder(double R) {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double theTich(){
        return this.height * (this.R * this.R)*Math.PI;
    }
}
