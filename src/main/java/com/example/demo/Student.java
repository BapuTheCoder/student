import java.util.Scanner;

package com.example.demo;

public class Student {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

