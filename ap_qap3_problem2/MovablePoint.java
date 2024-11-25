package ap_qap3_problem2;

public class MovablePoint extends Point {
    protected float xSpeed;
    protected float ySpeed;

    // Parameterized constructors
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // No-argument constructor
    public MovablePoint() {
        super();
        this.xSpeed = 0;
        this.ySpeed = 0;
    }

    // Getter methods
    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public float[] getSpeed() {
        float[] speed = { xSpeed, ySpeed };
        return speed;
    }

    // Setter methods
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // toString method
    public String toString() {
        return super.toString() + ", speed: (" + xSpeed + "," + ySpeed + ")";
    }

    // Move the point by the xSpeed and ySpeed
    public MovablePoint move() {
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        return this;
    }
}
