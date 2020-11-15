package com.company;

import java.util.Random;

public class Lesson5_12 {

    public static void main(String[] args) {

        //initialize an array [10] with random numbers
        //write a function that takes as an argument an array and returns the array sorted in asc order
        //print

        int[] arr = new int[10];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(89) + 10;
        }

        System.out.println("array:");
        printArray(arr);
        
        System.out.println();

        sortArray(arr);

        System.out.println("sort array: ");
        printArray(arr);
    }

    //sorted array
    public static int[] sortArray(int[] arr) {
        int box;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    box = arr[i];
                    arr[i] = arr[j];
                    arr[j] = box;
                }
            }
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
