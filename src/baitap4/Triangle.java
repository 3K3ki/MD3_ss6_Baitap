package baitap4;

import java.util.Scanner;

public class Triangle extends Shape{
    private double side1=1.0, side2=1.0,side3 = 1.0;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public Triangle(){

    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
    public double getArea(){
        double p = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }
    public double getPerimeter(){
        return (this.side1+this.side2+this.side3)/2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập cạnh 1");
        double side1 = input.nextDouble();
        System.out.println("Nhập cạnh 2");
        double side2 = input.nextDouble();
        System.out.println("Nhập cạnh 3");
        double side3 = input.nextDouble();
        System.out.println("Nhập color");
        String color = input.nextLine();
        input.nextLine();
        Triangle dt = new Triangle(side1,side2,side3);
        System.out.println("Diện tích là:" +dt.getArea());
        System.out.println("Chu vi la: "+dt.getPerimeter());
        System.out.println("color" + color);
    }
}
