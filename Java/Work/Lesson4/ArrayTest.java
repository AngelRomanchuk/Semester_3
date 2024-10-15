package Java.Work.Lesson4;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an array of size 10
        int[] arr = Array.createArray(10);
        
        // Run various tests
        Array.sumAndAverage(arr);
        Array.incrementArray(arr);
        Array.squaresAndCubes(arr);
        Array.largestElement(arr);
        
        // Search number in Array
        System.out.println();
        System.out.print("Enter a number to search: ");
        int key = scanner.nextInt();
        System.out.println("Element found: " + Array.searchElement(arr, key));
        System.out.println();
        
        Array.countOddEven(arr);
        Array.sortArray(arr);
        Array.secondLargestAndSmallest(arr);
        Array.repeatedNumbers(arr);

        // Merge arrays
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] merged = Array.mergeSortedArrays(arr1, arr2);
        System.out.println("Merged Array:");
        Array.printArray(merged);


        // Insert element in a specific position
        int[] insertedArray = Array.insertElement(arr, 25, 5);
        System.out.println("Array after insertion:");
        Array.printArray(insertedArray);

        // Delete specified integer
        int[] deletedArray = Array.deleteElement(arr, key);
        System.out.println("Array after deletion:");
        Array.printArray(deletedArray);
        
        scanner.close();
    }
}
