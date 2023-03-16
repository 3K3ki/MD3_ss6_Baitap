package baitap2;

public class Main {
    public static void main(String[] args) {
        Point2D pnt = new Point2D();
        System.out.println(pnt);
        Point2D pnt1 = new Point2D(10, 20);
        System.out.println(pnt1);

        System.out.println("----Test Point 3d-------");
        Point3D pnt2 = new Point3D();
        System.out.println(pnt2);
        Point3D pnt3 = new Point3D(10,20,30);
        System.out.println(pnt3);
    }
}
