package baitap3;

public class Main {
    public static void main(String[] args) {
        Point pt1 = new Point();
        System.out.println(pt1);
        Point pt2 = new Point(10, 20);
        System.out.println(pt2);

        MoveablePoint mv1 = new MoveablePoint();
        System.out.println(mv1);
        MoveablePoint mv2 = new MoveablePoint(10, 20, 30, 40);
        System.out.println(mv2);

    }
}
