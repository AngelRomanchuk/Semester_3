package Java.Work.LabTasks.Week1;
import java.util.Scanner;

public class NumConvert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the menu
            System.out.println("Menu:");
            System.out.println("1. Convert Decimal to Binary");
            System.out.println("2. Convert Binary to Decimal");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Convert Decimal to Binary
                    System.out.print("Enter a decimal number: ");
                    int decimalNumber = scanner.nextInt();
                    String binaryRepresentation = decimalToBinary(decimalNumber);
                    System.out.println("Binary representation: " + binaryRepresentation);
                    break;

                case 2:
                    // Convert Binary to Decimal
                    System.out.print("Enter a binary number: ");
                    scanner.nextLine(); // Clear the newline character
                    String binaryNumber = scanner.nextLine();
                    try {
                        int decimalValue = binaryToDecimal(binaryNumber);
                        System.out.println("Decimal representation: " + decimalValue);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid binary number format.");
                    }
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
                    break;
            }
        }
    }

    // Method to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    // Method to convert binary to decimal
    public static int binaryToDecimal(String binary) throws NumberFormatException {
        return Integer.parseInt(binary, 2);
    }
}

