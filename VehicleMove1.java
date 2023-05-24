package com.exam2;
import java.util.Scanner;

abstract class Vehicle {
    public abstract void move();
}

class Helicopter extends Vehicle {
    @Override
    public void move() {
        System.out.println("The Helicopter flies in the air.");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The Car drives on the road.");
    }
}

class Train extends Vehicle {
    @Override
    public void move() {
        System.out.println("The Train runs on the track.");
    }
}

public class VehicleMove1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of vehicle you want to order (Helicopter/Car/Train):");
        String vehicleType = scanner.nextLine().toLowerCase();

        Vehicle vehicle = createVehicle(vehicleType);
        if (vehicle != null) {
            vehicle.move();
        } else {
            System.out.println("Invalid vehicle type entered.");
        }

        scanner.close();
    }

    public static Vehicle createVehicle(String vehicleType) {
        if (vehicleType.equals("helicopter")) {
            return new Helicopter();
        } else if (vehicleType.equals("car")) {
            return new Car();
        } else if (vehicleType.equals("train")) {
            return new Train();
        } else {
            return null;
        }
    }
}

