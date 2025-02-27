package ExceptionSpring24;

import java.util.Scanner;

import java.util.Scanner;

public class ExceptionHandling {
    private int[] myArray;

    // Constructor to initialize the array of size n
    public ExceptionHandling(int n) {
        myArray = new int[n];
    }

    // Method to insert value at a given index
    public void insertValue(int index, String value) {
        try {
            // Attempt to insert value at index
            myArray[index] = Integer.parseInt(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle "Type A Exception" - Index out of bounds
            System.out.println("ArrayIndexOutOfBoundsException Occurred!");
        } catch (NumberFormatException e) {
            // Handle "Type B Exception" - Invalid value type
            System.out.println("NumberFormatException Occurred!");
        } catch (Exception e) {
            // Handle any other general exception
            System.out.println("Some other exception occurred: " + e);
        } finally {
            // This block will always execute
            System.out.println("Exception handling is amazing");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get array size from user
            System.out.print("Enter Array Size: ");
            int n = scanner.nextInt();

            // Create an instance of ExceptionHandling
            ExceptionHandling handler = new ExceptionHandling(n);

            // Get the index and value from the user
            System.out.print("Enter index position: ");
            int index = scanner.nextInt();

            System.out.print("Enter value: ");
            String value = scanner.next(); // Get value as a string to handle NumberFormatException

            // Call method to insert value at the given index
            handler.insertValue(index, value);

        } catch (Exception e) {
            // Handle any unexpected exceptions in the main function
            System.out.println("An error occurred: " + e);
        } finally {
            // This block will always execute
            System.out.println("Program finished.");
        }

        // Close the scanner
        scanner.close();
    }
}
