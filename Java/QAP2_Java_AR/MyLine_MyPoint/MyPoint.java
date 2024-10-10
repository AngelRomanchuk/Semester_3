package MyLine_MyPoint;

public class MyPoint {
    private int x;
    private int y;

    // Constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters and Setters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    // Method to calculate distance to another MyPoint
    public double distance(MyPoint other) {
        return Math.hypot(other.x - this.x, other.y - this.y);
    }

    // To String/Overide
    public String toString() {
        return "MyPoint[" + "x=" + x + ", y=" + y + "]";
    }
}
