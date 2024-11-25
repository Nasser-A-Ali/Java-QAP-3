package ap_qap3_problem2;

public class Demo {
    public static void main(String[] args) {
        System.err.println();

        // Create a point
        Point p1 = new Point(1, 2);
        System.out.println(p1);
        System.out.println();

        // Change the point's x and y coordinates
        p1.setXY(3, 4);
        System.out.println(p1);
        System.out.println();

        // Create a movable point
        MovablePoint mp1 = new MovablePoint(1, 2, 3, 4);
        System.out.println(mp1);
        System.out.println();

        // Move the movable point
        mp1.move();
        System.out.println(mp1);
        System.out.println();

    }
}
