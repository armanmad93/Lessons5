package com.company;

import java.util.Scanner;

public class Lesson5_3 {

    public static void main(String[] args) {

        //get 2 numbers from console
        //write a function to calculate their product
        //write a function to calculate cube of the product
        //print the cube of the product

        Scanner scanner = new Scanner(System.in);

        System.out.print("input firts number: ");
        int number1 = scanner.nextInt();

        System.out.print("input second number: ");
        int number2 = scanner.nextInt();

        int sumNumbers = sumNumbers(number1, number2);
        int cubeNumbers = cubeNumbers(number1, number2);

        System.out.println("calculate of the numbers is: " + sumNumbers);
        System.out.println("cube of the sum numbers is: " + cubeNumbers);

    }

    //calculate numbers
    public static int sumNumbers(int number1, int number2) {
        return number1 + number2;
    }

    //calculate cube of the numbers
    public static int cubeNumbers(int number1, int number2) {
        int sum = number1 + number2;
        return (int) Math.pow(sum, 3);
    }

}
