package MyRectangle_MyPoint;

public class TestMyRectangle {
    public static void main(String[] args) {
        // Create points for the rectangle
        MyPoint topLeft = new MyPoint(1, 4);
        MyPoint bottomRight = new MyPoint(5, 1);

        // Create a rectangle using the points
        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        // Display the rectangle details
        System.out.println(rectangle);
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
