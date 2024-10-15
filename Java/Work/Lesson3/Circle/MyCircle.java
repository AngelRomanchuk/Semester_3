public class MyCircle {
    private MyPoint center;
    private int radius;
    MyCircle()
    {
        this.center  = new MyPoint(0,0); 
        this.radius = 1;
    }
    MyCircle(int x, int y, int r)
    {
        this.center  = new MyPoint(x,y); 
        this.radius = r;
    }
    MyCircle(MyPoint p,int r)
    {
        this.center = p;
        this.radius = r;
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public MyPoint getCenter() {
        return center;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public int getCenterX()
    {
        return this.center.getX();
    }
    public void setCenterX(int x)
    {
        this.center.setX(x);
    }
    public int getCenterY()
    {
        return this.center.getY();
    }
    public void setCenterY(int y)
    {
        this.center.setY(y);
    }
    public int[] getCenterXY()
    {
        int a[] = new int[2];
        a[0] = this.center.getX();
        a[1] = this.center.getY();

       // int a[] = {this.center.getX(),this.center.getY()};
        return a;
    }

    public void setCenterXY(int x, int y)
    {
        this.center.setXY(x, y);
    }

    public double getArea() {
        return (Math.PI*this.radius * this.radius);
    }
    public double getCircumference() {
        return (2 * Math.PI * this.radius);
    }
    public String toString()
    {

        return ("center = " + this.center.toString() + " and radius = " + this.radius);
    }
    public double distance(MyCircle c)
    {

        return (this.center.distance(c.center));
    }
}
