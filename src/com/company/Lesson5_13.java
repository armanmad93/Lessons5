package com.company;

import java.util.Random;

public class Lesson5_13 {

    public static void main(String[] args) {

        //initialize an array [10] with random numbers
        //write a function that takes as an argument an array and returns the array sorted in desc order
        //print

        int[] array = new int[10];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(89) + 10;
        }

        System.out.println("array: ");
        printArray(array);
        System.out.println();

        System.out.println("sort array: ");
        sortArray(array);
        printArray(array);

    }

    //print array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //sorted Array
    public static int[] sortArray(int[] arr) {

        int box;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    box = arr[j];
                    arr[j] = arr[i];
                    arr[i] = box;
                }
            }
        }
        return arr;
    }

}
