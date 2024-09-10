package Java.Work.LabTasks.Week1;
import java.util.Scanner;

public class NumWordProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Enter number from 0-9:");
        if (input.hasNextInt()) {
            number = input.nextInt();
            
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid number!");
                    break;
            }
        } else {
            System.out.println("Please enter a valid integer.");
        }

        input.close();
    }
}
