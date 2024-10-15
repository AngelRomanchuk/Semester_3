package Java.Work.Lesson4;
import java.util.Scanner;

public class Array {
    // Method to create an array of specified size and input values
    public static int[] createArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    
    // Method 1: Calculate Sum & Average of all elements of an integer Array size 10
    public static void sumAndAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;
        System.out.println("Sum: " + sum + ", Average: " + average);
    }

    // Method 2: Increment Every Element of the Array by One & Print Incremented Array
    public static void incrementArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
        printArray(arr);
    }

    // Method 3: Store the Squares and Cubes of elements in new Arrays & Print those
    public static void squaresAndCubes(int[] arr) {
        int[] squares = new int[arr.length];
        int[] cubes = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            squares[i] = arr[i] * arr[i];
            cubes[i] = arr[i] * arr[i] * arr[i];
        }
        printArray(squares);
        printArray(cubes);
    }

    // Method 4: Find largest element and its index
    public static void largestElement(int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Largest Element: " + max + " at Index: " + index);
    }

    // Method 5: Search for an Element
    public static boolean searchElement(int[] arr, int key) {
        for (int num : arr) {
            if (num == key) {
                return true;
            }
        }
        return false;
    }

    // Method 6: Count Odd & Even Numbers
    public static void countOddEven(int[] arr) {
        int oddCount = 0, evenCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Odd Count: " + oddCount + ", Even Count: " + evenCount);
    }

    // Method 7: Sort the Array in Ascending & Descending Order
    public static void sortArray(int[] arr) {
        int[] ascending = arr.clone();
        int[] descending = arr.clone();
        java.util.Arrays.sort(ascending);
        java.util.Arrays.sort(descending);
        for (int i = 0; i < descending.length / 2; i++) {
            int temp = descending[i];
            descending[i] = descending[descending.length - i - 1];
            descending[descending.length - i - 1] = temp;
        }
        System.out.println("Ascending Order: ");
        printArray(ascending);
        System.out.println("Descending Order: ");
        printArray(descending);
    }

    // Method 8: Find the Second Largest & Smallest Elements
    public static void secondLargestAndSmallest(int[] arr) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        System.out.println("Second Largest: " + secondLargest + ", Second Smallest: " + secondSmallest);
    }

    // Method 9: Print Repeated Numbers with Frequency
    public static void repeatedNumbers(int[] arr) {
        java.util.Map<Integer, Integer> frequencyMap = new java.util.HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (java.util.Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Number: " + entry.getKey() + " occurs " + entry.getValue() + " times.");
            }
        }
    }

    // Method 10: Merge Elements of 2 Sorted Arrays
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        java.util.Arrays.sort(merged);
        return merged;
    }

    // Method 11: Insert an Element in a Specified Position
    public static int[] insertElement(int[] arr, int element, int position) {
        if (position < 0 || position > arr.length) {
            System.out.println("Invalid position");
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }
        newArr[position] = element;
        for (int i = position + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }

    // Method 12: Delete the Specified Integer from an Array
    public static int[] deleteElement(int[] arr, int element) {
        int count = 0;
        for (int num : arr) {
            if (num == element) {
                count++;
            }
        }
        int[] newArr = new int[arr.length - count];
        int index = 0;
        for (int num : arr) {
            if (num != element) {
                newArr[index++] = num;
            }
        }
        return newArr;
    }

    // Helper method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

