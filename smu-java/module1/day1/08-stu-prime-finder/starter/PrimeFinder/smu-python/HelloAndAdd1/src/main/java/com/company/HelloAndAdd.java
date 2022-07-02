package com.company;

import java.util.Scanner;

public class HelloAndAdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.nextLine();

        System.out.println("Hello, " + name);

        System.out.println("Please enter the first number. ");
        int number1 = Integer.parseInt(scan.nextLine());

        System.out.println("Please enter the second number. ");
        int number2 = Integer.parseInt(scan.nextLine());

        System.out.println("");
    }
}
