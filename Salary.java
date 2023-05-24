package com.exam2;

import java.util.Scanner;

class Person1 {
    String name;
    int age;

    void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
    }
}

class Employee extends Person1 {
    String designation;
    double salary;

    void accept() {
        super.accept();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter designation: ");
        designation = scanner.nextLine();
        System.out.print("Enter salary: ");
        salary = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
    }

    boolean hasSalaryGreaterThan(double amount) {
        return salary > amount;
    }
}

public class Salary {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        Scanner scanner = new Scanner(System.in);

        // Accept data for 5 persons
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].accept();
        }

        System.out.println("\nEmployees with salary greater than 5000:");
        for (Employee employee : employees) {
            if (employee.hasSalaryGreaterThan(5000)) {
                System.out.println(employee.name);
            }
        }

        scanner.close();
    }
}
