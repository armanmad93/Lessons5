package com.company;

import java.util.Random;
import java.util.Scanner;

public class Lesson5_19 {

    public static void main(String[] args) {

        //Write a function (takes a number N as input from console) creates N x N matrix
        //And initializes it with random numbers in range 27 - 78
        //Write a function to rotate that matrix 90*
        //Write a function to rotate that matrix 180*
        //Write a function to rotate that matrix 270*

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.print("plz input number array lenght: ");
        int userNumber = scanner.nextInt();

        int[][] arr = new int[userNumber][userNumber];

        //initializes array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(51) + 27;
            }
        }

        //print array
        printArray(arr);
        System.out.println();

        //role 90*
        System.out.println("role 90*");
        int[][] arrayRole90 = arrayRole90(arr);
        printArray(arrayRole90);
        System.out.println();

        //role 180*
        System.out.println("role 180*");
        int[][] arrayRole180 = arrayRole90(arrayRole90);
        printArray(arrayRole180);
        System.out.println();

        //role 270*
        System.out.println("role 270*");
        int[][] arrayRole270 = arrayRole90(arrayRole180);
        printArray(arrayRole270);

    }

    //print array
    public static void printArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    //role 90*
    public static int[][] arrayRole90(int[][] arr) {

        int[][] newArray = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                newArray[i][j] = arr[arr.length - 1 - j][i];

            }
        }
        return newArray;
    }

}
