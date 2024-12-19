/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication27;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author grays
 */
public class JavaApplication27 {

    public static void main(String[] args) {
        System.out.println("Welcome to JavaApplication27!");

        // Uncomment the following lines to test individual tasks:
        // ArraySearch.main(args);
        // MultiplicationTable.main(args);
        // DiagonalSum.main(args);
        // SpiralTraversal.main(args);
        // BubbleSort.main(args);
    }
}

// Task 1: Array Search - Find the First Repeated Element
class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size and elements
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the first repeated element
        HashSet<Integer> seen = new HashSet<>();
        boolean found = false;
        for (int num : array) {
            if (seen.contains(num)) {
                System.out.println("First repeated element: " + num);
                found = true;
                break;
            }
            seen.add(num);
        }

        if (!found) {
            System.out.println("No repeated elements found.");
        }
    }
}

// Task 2: Multiplication Table Using 2D Array
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the multiplication table
        System.out.print("Enter size of multiplication table: ");
        int n = scanner.nextInt();

        // Create and populate the 2D array
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        // Display the multiplication table
        System.out.println("Multiplication Table:");
        for (int[] row : table) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}

// Task 3: Diagonal Sum of a Matrix
class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the matrix
        System.out.print("Enter size of matrix: ");
        int n = scanner.nextInt();

        // Create and populate the matrix
        int[][] matrix = new int[n][n];
        System.out.println("Enter elements row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate diagonal sums
        int mainDiagonalSum = 0, secondaryDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][n - 1 - i];
        }

        // Display the sums
        System.out.println("Main diagonal sum: " + mainDiagonalSum);
        System.out.println("Secondary diagonal sum: " + secondaryDiagonalSum);
    }
}

// Task 4: Spiral Traversal of a Matrix
class SpiralTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter rows and columns of matrix: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Create and populate the matrix
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Perform spiral traversal
        System.out.println("Spiral Traversal:");
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) System.out.print(matrix[top][i] + " ");
            top++;
            for (int i = top; i <= bottom; i++) System.out.print(matrix[i][right] + " ");
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) System.out.print(matrix[bottom][i] + " ");
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) System.out.print(matrix[i][left] + " ");
                left++;
            }
        }
    }
}

// Task 5: Bubble Sort - Sorting an Array
class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size and elements
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Perform bubble sort
        int swaps = 0;
        System.out.println("Array before sorting:");
        for (int num : array) System.out.print(num + " ");
        System.out.println();

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swaps++;
                }
            }
        }

        // Display results
        System.out.println("Array after sorting:");
        for (int num : array) System.out.print(num + " ");
        System.out.println();
        System.out.println("Total number of swaps: " + swaps);
    }
}
