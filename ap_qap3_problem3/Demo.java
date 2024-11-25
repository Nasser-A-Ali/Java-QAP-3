package ap_qap3_problem3;

public class Demo {
    public static void main(String[] args) {
        // Initializes an array of different shape objects
        Shape[] shapes = {
                new Circle(5),
                new Ellipse(6, 4),
                new Triangle(3, 4, 5),
                new EquilateralTriangle(6)
        };

        // Iterate over the array and print each shape's details
        System.out.println("-------------------------");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("-------------------------");
        }
    }
}
