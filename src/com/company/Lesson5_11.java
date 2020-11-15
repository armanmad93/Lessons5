package com.company;

import java.util.Random;

public class Lesson5_11 {

    public static void main(String[] args) {

        //Create int array [10]
        //write a function that takes as a parameter array and initializes that array with random numbers
        //write a function that takes as a parameter array and prints it
        //Call them in main.

        int[] arr = new int[10];

        arrayInitialize(arr);

        arrayPrint(arr);

    }

    //initialize array
    public static void arrayInitialize(int[] arr) {

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(99);
        }

    }

    //print array
    public static void arrayPrint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

}
