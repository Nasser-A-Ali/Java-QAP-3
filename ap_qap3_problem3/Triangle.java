package ap_qap3_problem3;

public class Triangle extends Shape {
    private double side1, side2, side3;

    // Parameterized constructor
    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Error: Invalid triangle sides.");
        }
    }

    // Methods to calculate perimeter and area
    @Override
    public double getPerimeter() {
        return Math.round((side1 + side2 + side3) * 100.0) / 100.0;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.round(Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)) * 100.0) / 100.0;
    }

}
