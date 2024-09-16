package Java.Work.LabTasks.Week2.Rectangle;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public double getLength(){
        return length;
    }
    public void setLength(double l){
        this.length = l;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double w){
        this.width = w;
    }

    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return length*2 + width*2;
    }

    public String toString(){
        return "Rectangle[length="+length+", width="+width+"]";
    }
}
