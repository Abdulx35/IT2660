//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Abdulrahman Mohamoud
 */

 public class Main {
    public static void main(String[] args) {
        System.out.println("hello, world!");

        Lab1 lab = new Lab1();
        System.out.println(lab.increment(1));

        // Create an array with values
        int[] numbers = {5, 9, 3, 12, 7, 3, 11, 5};

        // Output the array in order using a while loop
        System.out.println("Array in order:");
        int index = 0;
        while (index < numbers.length) {
            System.out.print(numbers[index] + " ");
            index++;
        }
        System.out.println();

        // Output the array in reverse using a for loop
        System.out.println("Array in reverse:");
        for (int k = numbers.length - 1; k >= 0; k--) {
            System.out.print(numbers[k] + " ");
        }
        System.out.println();

        // Output the first and last values of the array
        System.out.println("First value: " + numbers[0]);
        System.out.println("Last value: " + numbers[numbers.length - 1]);

        // Call the methods created in Lab1
        System.out.println("Max of " + numbers[0] + " and " + numbers[1] + ": " + lab.max(numbers[0], numbers[1]));
        System.out.println("Min of " + numbers[0] + " and " + numbers[1] + ": " + lab.min(numbers[0], numbers[1]));
        System.out.println("Sum of array: " + lab.sum(numbers));
        System.out.println("Average of array: " + lab.average(numbers));
        System.out.println("Max value in array: " + lab.max(numbers));
        System.out.println("Min value in array: " + lab.min(numbers));
    }
}

// Add all of the methods here
class Lab1 {
    // Increment method
    public int increment(int num) {
        return num + 1;
    }

    // Return the maximum of two integers
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Return the minimum of two integers
    public int min(int a, int b) {
        return (a < b) ? a : b;
    }

    // Return the sum of all values in the array
    public int sum(int[] arr) {
        int total = 0;
        for (int value : arr) {
            total += value;
        }
        return total;
    }

    // Return the average of the array using a foreach loop
    public double average(int[] arr) {
        int total = 0;
        for (int value : arr) {
            total += value;
        }
        return (double) total / arr.length;
    }

    // Return the maximum value in the array
    public int max(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    // Return the minimum value in the array
    public int min(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
