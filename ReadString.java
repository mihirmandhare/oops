package com.exam2;
import java.util.Arrays;
import java.util.Scanner;
public class ReadString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextLine();

        }

        Arrays.sort(arr);
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println("");
        System.out.println("Enter string 1");
        String str = sc.nextLine();
        System.out.println("Enter string 2");
        String str1 = sc.nextLine();
        String cs = str +" " +str1;
        System.out.println(cs);

        StringBuffer sb =new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);

    }
}
