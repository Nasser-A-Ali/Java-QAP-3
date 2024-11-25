package ap_qap3_problem4;

public class Demo {
    public static void main(String[] args) {
        // Initializes an array of different shape objects
        Shape[] shapes = {
                new Circle(5),
                new Ellipse(6, 4),
                new Triangle(3, 4, 5),
                new EquilateralTriangle(6)
        };

        // Iterate over the array and print each shape's details before scaling
        System.out.println("-------------------------");

        System.out.println("\u001B[31mBefore Scaling:\u001B[0m");
        System.out.println("-------------------------");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("-------------------------");
        }

        // Scale all shapes by a factor of 2
        for (Scalable scalable : shapes) {
            scalable.scale(2.0);
        }

        // Iterate over the array and print each shape's details before scaling
        System.out.println("\u001B[31mAfter Scaling:\u001B[0m");
        System.out.println("-------------------------");

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("-------------------------");
        }
    }

}
