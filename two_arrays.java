package com.exam2;
import java.util.*;
public class two_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array 1 : ");
        int s1 = sc.nextInt();
        System.out.println("Enter size for array 2: ");
        int s2 = sc.nextInt();
        int[] a1 =new int[s1];
        int[] a2 = new int[s2];
        for (int i = 0; i < s1; i++) {
            System.out.println("Element for array 1 at index "+i+" :");
            a1[i]= sc.nextInt();
        }
        for (int i = 0; i < s2; i++) {
            System.out.println("Element for array 2 at index "+i+" :");
            a2[i]= sc.nextInt();
        }
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < s2; j++) {
                if(a1[i]==a2[j]){
                    s.add(a1[i]);
                }

            }

        }
        System.out.println("Common elements are: ");
        System.out.println(s);
    }
}
