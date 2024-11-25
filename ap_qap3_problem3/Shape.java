package ap_qap3_problem3;

public abstract class Shape {
    protected String shapeName;

    // Base constructor
    public Shape(String name) {
        this.shapeName = name;
    }

    // Abstract methods to get perimeter and area
    public abstract double getPerimeter();

    public abstract double getArea();

    // toString method to display the shape name, area, and perimeter
    public String toString() {
        return "\u001B[32mShape: " + shapeName + "\u001B[0m \nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
