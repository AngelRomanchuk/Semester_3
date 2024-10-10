package MyLine_MyPoint;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    // Constructors
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getters and Setters
    public MyPoint getBegin() {
        return begin;
    }
    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public MyPoint getEnd() {
        return end;
    }
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    

    public int getBeginX() {
        return begin.getX();
    }
    public void setBeginX(int x) {
        begin.setX(x);
    }
    public int getBeginY() {
        return begin.getY();
    }
    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int x) {
        end.setX(x);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getBeginXY() {
        return new int[]{begin.getX(), begin.getY()};
    }
    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    public int[] getEndXY() {
        return new int[]{end.getX(), end.getY()};
    }
    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    // Get Length and Gradient
    public double getLength() {
        return begin.distance(end);
    }
    public double getGradient() {
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    }

    // To String/Overide
    public String toString() {
        return "MyLine[begin=(" + begin.getX() + "," + begin.getY() + "), end=(" + end.getX() + "," + end.getY() + ")]";
    }
}