package com.company;

import java.util.Random;
import java.util.Scanner;

public class Lesson5_18 {

    public static void main(String[] args) {

        //Write a function (takes a number n as input from console) to displays
        //an n-by-n matrix. Initialized randomly by ‘+’ or ‘-’

        Scanner scanner = new Scanner(System.in);

        System.out.print("plz input array lenght: ");
        int userNumber = scanner.nextInt();

        String[][] arr = new String[userNumber][userNumber];

        printArray(randomInitializeSympol(arr));
        //randomInitializeSympol(arr);
        //printArray(arr);

        // String[][] newArray = randomInitializeSympol(arr);
        //  printArray(newArray);

    }

    //Initialized randomly by ‘+’ or ‘-’
    public static String[][] randomInitializeSympol(String[][] arr) {

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (random.nextBoolean()) {
                    arr[i][j] = "+";
                } else {
                    arr[i][j] = "-";
                }
            }
        }

        return arr;

    }

    //print String array
    public static void printArray(String[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
