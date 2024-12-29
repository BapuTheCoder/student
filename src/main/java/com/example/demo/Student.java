package com.example.demo;

import java.util.Scanner;

public class Student {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for input

        // Prompt user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Validate age input to ensure it's an integer
        int age = 0;
        boolean validAge = false;
        while (!validAge) {
            System.out.print("Enter your age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();  // Read age if it's an integer
                validAge = true;
            } else {
                System.out.println("Invalid input! Please enter a valid age.");
                scanner.next();  // Clear the invalid input
            }
        }

        // Print out the student's name and age
        System.out.println("\n--- Student Information ---");
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);

        // Close the scanner object
        scanner.close();
    }
}
