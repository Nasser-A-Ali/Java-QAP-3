package ap_qap3_problem4;

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

    // Implementation of the scale interface method
    @Override
    public void scale(double factor) {
        double side = super.getPerimeter() / 3;
        side = side * factor;
        super.scale(factor); // Calls the scale method of Triangle parent class
    }
}
