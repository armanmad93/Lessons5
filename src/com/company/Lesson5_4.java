package com.company;

import java.util.Scanner;

public class Lesson5_4 {

    public static void main(String[] args) {

        //get 3 numbers from console
        //write a function to find the smallest number among the three numbers.
        //print the smallest number

        Scanner scanner = new Scanner(System.in);

        System.out.print("number 1: ");
        int number1 = scanner.nextInt();

        System.out.print("number 2: ");
        int number2 = scanner.nextInt();

        System.out.print("number 3: ");
        int number3 = scanner.nextInt();

        int smallNumber = findSmallNumber(number1, number2, number3);

        System.out.println("small number is: " + smallNumber);

    }

    //find small number
    public static int findSmallNumber(int number1, int number2, int number3) {
        int smallNumber;

        if (number1 < number2) {
            smallNumber = number1;
        } else {
            smallNumber = number2;
        }

        if (smallNumber < number3) {
            return smallNumber;
        } else {
            return number3;
        }

    }

}
