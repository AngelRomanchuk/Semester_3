package Java.Work.Lesson3Week.Aggregation;

public class Demo {
    public static void main(String[] args) {
        TextBook java = new TextBook("Advanced Java 2","Dietel", "Pearson");
       // TextBook java2 = new TextBook(java);

        Instructor Ainee = new Instructor("Qurratulain","Malik","G310");
    
        // System.out.println(java);
        // System.out.println(java2);
        // System.out.println(Ainee);

        Course AdvanceJava = new Course("Advanced Programming", Ainee, java);

        System.out.println(AdvanceJava);
    }
    
}
