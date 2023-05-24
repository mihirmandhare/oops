package com.exam2;
import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter half no of rows of diamond");
        int row = sc.nextInt();
       for (int i = 0; i <=row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println("");

        }
        for (int i = row-2; i >=0 ; i--) {
            for (int j = i; j >=0 ; j--) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}
