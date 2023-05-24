package com.exam2;
import java.util.Locale;
import java.util.Scanner;
public class VehicleMove {
        static String vehicle;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your vehicle");
         vehicle = sc.nextLine();
        if(vehicle.equalsIgnoreCase("car")){
            System.out.println("Car drives on road");
        } else if (vehicle.equalsIgnoreCase("helicopter")) {
            System.out.println("Helicopter flies in air");

        } else if (vehicle.equalsIgnoreCase("train")) {
            System.out.println("Train runs on track");
        }else{
            System.out.println("Invalid ");
        }

    }

}
