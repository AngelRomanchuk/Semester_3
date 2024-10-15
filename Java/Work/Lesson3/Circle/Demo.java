public class Demo {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(2,4);
        MyPoint P2 = new MyPoint(6,8);
        MyPoint P3 = new MyPoint(10,5);
        MyTriangle T1 = new MyTriangle(2,2,4,4,6,6);
        MyTriangle T2 = new MyTriangle(p1, P2, P3);


        System.out.println(T1.getPerimeter());
        System.out.println(T2.getPerimeter());
      //  System.out.println(p1);
        // System.out.println(p1.distance(6, 8));
         System.out.println(p1.distance(P2));
        // System.out.println(p1.distance());

        MyCircle C1 = new MyCircle(p1,5);
        MyCircle C2 = new MyCircle(P2, 6);
        System.out.println(C1.distance(C2));
    }
}
