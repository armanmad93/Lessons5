package com.company;

import java.util.Random;
import java.util.Scanner;

public class Lesson5_20 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //( USE  FUNCTIONS FOR ROTATION!! )
        //Write a function (takes a number N as input from console) creates N x N matrix
        //And initializes it with random numbers in range 27 - 78
        //print it
        //Display a menu like this
        //———————- MENU —————-
        //Press 1 For rotating 90*
        //Press 2 For rotating 180*
        //Press 3 For rotating 270*
        //Press 4 to Exit
        //————————————————
        //( USE  FUNCTIONS FOR ROTATION!! )
        //After each operation program should show the menu… !!!!!!!!!
        //DO NOT EXIT THE PROGRAM IF THE INPUT IS NOT 4 !!!!!!!!!


        System.out.print("plz input number array lenght: ");
        int userNumber = scanner.nextInt();

        int[][] arr = new int[userNumber][userNumber];

        initializesArray(arr);
        printArray(arr);
        menu(arr);

    }

    //initializes array
    public static void initializesArray(int[][] arr) {

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(51) + 27;
            }
        }

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

    //Menu
    public static void menu(int[][] arr) {

        //role 90*
        int[][] arrayRole90 = arrayRole90(arr);

        //role 180*
        int[][] arrayRole180 = arrayRole90(arrayRole90);

        //role 270*
        int[][] arrayRole270 = arrayRole90(arrayRole180);

        boolean answer = false;

        while (true) {

            System.out.println("———————- MENU —————-");
            System.out.println("Press 1 For rotating 90*");
            System.out.println("Press 2 For rotating 180*");
            System.out.println("Press 3 For rotating 270*");
            System.out.println("Press 4 to Exit");
            System.out.println("————————————————");

            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    printArray(arrayRole90);
                    break;
                case 2:
                    printArray(arrayRole180);
                    break;
                case 3:
                    printArray(arrayRole270);
                    break;
                case 4:
                    answer = true;
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("press 1,2 or 3 ");
            }
            if (answer) {
                break;
            }
        }

    }

}
