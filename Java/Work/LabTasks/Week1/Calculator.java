package Java.Work.LabTasks.Week1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first operand
        System.out.print("Enter the first operand: ");
        double operand1 = input.nextDouble();

        // Prompt the user to enter the second operand
        System.out.print("Enter the second operand: ");
        double operand2 = input.nextDouble();

        // Prompt the user to enter the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
            // Handle division by zero
            if (operand2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
            result = operand1 / operand2;
            break;
        default:
            System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
            return;
        }

        // Output the result
        System.out.println("The result is: " + result);
    }
}