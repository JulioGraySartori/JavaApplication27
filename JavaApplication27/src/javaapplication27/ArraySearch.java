/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication27;

/**
 *
 * @author grays
 */
public class ArraySearch {
    
}
package javaapplication26;

import java.util.HashSet;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

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
