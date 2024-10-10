package MyRectangle_MyPoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight; 

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // To calculate Area and Perimeter get width and height
    public int getWidth() {
        return bottomRight.getX() - topLeft.getX();
    }
    public int getHeight() {
        return bottomRight.getY() - topLeft.getY();
    }


    // Calculate and get Area and Perimeter
    public int getArea() {
        return getWidth() * getHeight();
    }
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // To String Overide
    public String toString() {
        return "Rectangle [Top Left: " + topLeft + ", Bottom Right: " + bottomRight + "]";
    }
}