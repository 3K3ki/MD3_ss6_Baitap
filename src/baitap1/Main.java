package baitap1;

public class Main {
    public static void main(String[] args) {
        //kiểm thử Class Circle
        System.out.println("-------Cricle----------");
        Circle circle = new Circle();
        System.out.println(circle);


        circle = new Circle(3.5);
        System.out.println(circle);


        circle = new Circle(3.5, "indigo");
        System.out.println(circle);

        //kiểm thử Class Circle
        System.out.println("---------Cylinder----------");


        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);


        cylinder = new Cylinder(3.5);
        System.out.println(cylinder);


        cylinder = new Cylinder(3.5, "orange", 3,3.5);
        System.out.println(cylinder);

    }
}
