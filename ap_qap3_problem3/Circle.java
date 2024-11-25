package ap_qap3_problem3;

public class Circle extends Shape {
    private double radius;

    // Parameterized constructor
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Methods to calculate perimeter and area
    @Override
    public double getPerimeter() {
        return Math.round(2 * Math.PI * radius * 100.0) / 100.0;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }

}
