package com.exam2;
import java.util.*;
public class RemoveDupliinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter element at " + i + " index :");
            a[i] = sc.nextInt();

        }
        Set<Integer> set = new HashSet<>();

        // Iterate over the original array
        for (int i = 0; i < a.length; i++) {

            // Add the current element to the set
            set.add(a[i]);
        }
        System.out.println(set);
        // Create a new array to store the unique elements
        int[] newArr = new int[set.size()];

        // Get the elements from the set and store them in the new array
        int j = 0;
        for (int i : set) {
            newArr[j++] = i;
        }

        // Print the new array
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
