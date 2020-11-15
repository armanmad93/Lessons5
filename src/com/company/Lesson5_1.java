package com.company;

import java.util.Random;

public class Lesson5_1 {

    public static void main(String[] args) {

        //generate 2 random numbers
        //write a function to calculate their sum
        //print the sum

        Random random = new Random();

        int[] array = new int[2];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println();

        int sum = calculateSum(array);

        System.out.println("sum array: " + sum);
    }

    //calculate sum
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
