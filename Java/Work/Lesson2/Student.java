package Java.Work.Lesson2;

public class Student {
    // atributes
    private String name;
    private int age;
    private String program;
    private int term;

    // methods (behaivors)
    public void set(String name, int age, String pro, int term){
        this.name = name;
        this.age = age;
        this.program = pro;
        this.term = term;
    }
    public void display(){
        System.out.println(this.name + this.age + this.program + this.term);
    }

}
