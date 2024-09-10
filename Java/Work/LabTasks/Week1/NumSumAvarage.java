package Java.Work.LabTasks.Week1;
import java.util.Scanner;

public class NumSumAvarage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        while (true){
            System.out.println("Enter number (-999 to stop): ");
            double number = input.nextDouble();

            if (number == -999){
                break;
            }

            sum += number;
            count ++;
        }

        if (count>0){
            double avarage = sum/count;
            System.err.println("Sum of numbers  " + sum);
            System.err.println("Avarage of numbers  " + avarage);
        }
        
    }
}
