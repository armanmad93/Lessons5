package com.company;

import java.util.Random;

public class Lesson5_15 {

    public static void main(String[] args) {

        //initialize an array [10] with random numbers
        //write a function that takes as an argument an array and returns the reversed array
        //print

        int[] arr = new int[10];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(89) + 10;
        }

        System.out.println("array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int[] newArray = reversArray(arr);

        System.out.println("revers array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(newArray[i] + " ");
        }

    }

    //reversed array
    public static int[] reversArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[arr.length - i - 1];
        }
        return newArray;
    }

}
