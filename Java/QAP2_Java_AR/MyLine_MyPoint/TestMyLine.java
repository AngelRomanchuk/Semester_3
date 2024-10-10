package MyLine_MyPoint;

public class TestMyLine {
    public static void main(String[] args) {
        // Create points
        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(4, 6);

        // Create MyLine instance
        MyLine line = new MyLine(point1, point2);

        System.out.println();
        // Test getBegin and getEnd
        System.out.println("Begin Point: " + line.getBegin());
        System.out.println("End Point: " + line.getEnd());

        // Test getLength
        System.out.println("Length of the line: " + line.getLength());

        // Test getGradient
        System.out.println("Gradient of the line: " + line.getGradient());

        // toString
        System.out.println(line.toString());

        // Test set and get methods
        line.setBeginXY(2, 3);
        line.setEndXY(5, 7);
        System.out.println();
        System.out.println("After modifying:");
        System.out.println("Begin Point: " + line.getBegin());
        System.out.println("End Point: " + line.getEnd());
        System.out.println("Length of the line: " + line.getLength());
        System.out.println("Gradient of the line: " + line.getGradient());

        // toString
        System.out.println(line.toString());
        System.out.println();
    }
}
