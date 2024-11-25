package ap_qap3_problem3;

public class EquilateralTriangle extends Triangle {
    // Parameterized constructor
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    // Methods to calculate perimeter and area
    @Override
    public double getPerimeter() {
        return Math.round(super.getPerimeter() * 100.0) / 100.0;
    }

    @Override
    public double getArea() {
        double side = super.getPerimeter() / 3;
        return Math.round((Math.sqrt(3) / 4 * side * side) * 100.0) / 100.0;
    }
}
