package ap_qap3_problem2;

public class Point {
    private float x;
    private float y;

    // Parameterized constructor
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // No-argument constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Getter methods
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        float[] xy = { x, y };
        return xy;
    }

    // Setter methods
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // toString method
    public String toString() {
        return "Point: (" + x + "," + y + ")";
    }

}
