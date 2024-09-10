package Java.Work.LabTasks.Week1;
import java.util.Scanner;

public class NumArrays {
    public static void main(String[] args) {
        final int SIZE = 100;
        final int MIN = 0;
        final int MAX = 9;
        // Create an array to hold 100 integers
        int[] numbers = new int[SIZE];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 100 integers between 0 and 9:");

        // Read 100 integers from the user
        for (int i = 0; i < SIZE; i++) {
            while (true) {
                int input = scanner.nextInt();
                if (input < MIN || input > MAX) {
                    System.out.println("Number out of range. Please enter a number between 0 and 9:");
                } else {
                    numbers[i] = input;
                    break;
                }
            }
        }

        // Calculate frequencies
        int[] frequencies = new int[MAX + 1];
        for (int number : numbers) {
            frequencies[number]++;
        }

        // Print the frequencies
        System.out.println("Numbers   Frequencies");
        for (int i = MIN; i <= MAX; i++) {
            System.out.println("   " + i + "          " + frequencies[i]);
        }
    }
}
