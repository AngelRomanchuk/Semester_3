package Java.Work.LabTasks.Week1;

public class LargestInt {
    public static void main(String[] args) {

        int num1 = 282;
        int num2 = 8;
        int num3 = 45;
        int num4 = 1;
        int num5 = 15;

        // Find the largest number
        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        if (num4 > largest) {
            largest = num4;
        }
        if (num5 > largest) {
            largest = num5;
        }

        System.out.println(largest);
    }
}
