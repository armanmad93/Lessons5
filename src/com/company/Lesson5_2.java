package com.company;

import java.util.Scanner;

public class Lesson5_2 {

    public static void main(String[] args) {

        //get 2 random numbers from console
        //write a function to calculate their product
        //print the product

        Scanner scanner = new Scanner(System.in);

        System.out.print("input first number: ");
        int number1 = scanner.nextInt();

        System.out.print("input second number: ");
        int number2 = scanner.nextInt();

        int sum = calculateNumbers(number1, number2);

        System.out.println("sum of two numbers is: " + sum);
    }

    //calculate numbers
    public static int calculateNumbers(int number1, int number2) {
        return number1 + number2;
    }

}
