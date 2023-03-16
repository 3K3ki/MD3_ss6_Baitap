package baitap4;

import baitap1.Circle;
import baitap1.Cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập cạnh 1");
        double side1 = input.nextDouble();
        System.out.println("Nhập cạnh 2");
        double side2 = input.nextDouble();
        System.out.println("Nhập cạnh 3");
        double side3 = input.nextDouble();
        input.nextLine();
        Triangle dt = new Triangle(side1,side2,side3);
        System.out.println("Diện tích là:" +dt.getArea());
        System.out.println("Chu vi la: "+dt.getPerimeter());
        System.out.println("color: " + dt.getColor());
    }
}
