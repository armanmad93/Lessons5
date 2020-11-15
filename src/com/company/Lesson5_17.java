package com.company;

import java.util.Scanner;

public class Lesson5_17 {

    public static void main(String[] args) {

        //write a function that takes as an argument int number and calculates its factorial
        //print

        Scanner scanner = new Scanner(System.in);

        System.out.print("plz input number: ");
        int userNumber = scanner.nextInt();

        int factorialUserNumber = calculateFactorial(userNumber);

        System.out.println("factorial of " + userNumber + " is: " + factorialUserNumber);

    }

    //factorial method
    public static int calculateFactorial(int number) {

        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;

    }

}
