package MyRectangle_MyPoint;

public class MyPoint {
    private int x;
    private int y; 

    // Constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Gets and Sets
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
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // To String Overide
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
