package Java.Work.LabTasks.Week2.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(5.0, 2.5);
        Rectangle R2 = new Rectangle(10.5, 3.3);

        System.out.println("Rectangle 1: ");
        System.out.println("Area: " + R1.getArea());
        System.out.println("Perimeter: " + R1.getPerimeter());

        System.out.println("\nRectangle 2: ");
        System.out.println("Area: " + R2.getArea());
        System.out.println("Perimeter: " + R2.getPerimeter());
    }
}
