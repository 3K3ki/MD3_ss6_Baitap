package baitap3;

public class MoveablePoint extends Point{
    private float xSpeed = 0.0f, ySpeed = 0.0f;


    public MoveablePoint(float x, float y,float xSpeed,float ySpeed) {
        super(x, y);
       this.xSpeed = xSpeed;
       this.ySpeed = ySpeed;
    }

    public MoveablePoint() {

    }

    public void MoveablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setSpeed( float ySpeed, float xSpeed){
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;

    }
    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" +  xSpeed +
                ", ySpeed=" + ySpeed +
                '}' +super.toString();
    }
}

