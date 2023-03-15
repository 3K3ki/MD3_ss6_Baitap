package baitap2;

public class Point3D extends Point2D{
    private float z;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void seXYZ(float x, float y, float z){

    }
    public void getXYZ(){

    }

    @Override
    public String toString() {
        return "Point3D{}";
    }
}
