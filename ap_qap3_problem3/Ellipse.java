package ap_qap3_problem3;

public class Ellipse extends Shape {
    private double a; // Major axis
    private double b; // Minor axis

    // Parameterized Constructor
    public Ellipse(double a, double b) {
        super("Ellipse");
        if (a < b) {
            this.a = b;
            this.b = a;
        } else {
            this.a = a;
            this.b = b;
        }
    }

    // Methods to calculate perimeter and area
    @Override
    public double getPerimeter() {
        if (a == b) { // If a = b = r, use the circle perimeter formula
            return Math.round(2 * Math.PI * a * 100.0) / 100.0;
        } else { // Otherwise, use the ellipse perimeter formula
            return Math.round(Math.PI * (2 * (a * a + b * b) - Math.pow((a - b), 2) / 2) * 100.0) / 100.0;
        }
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * a * b * 100.0) / 100.0;
    }

}
