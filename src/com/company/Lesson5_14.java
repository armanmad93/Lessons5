package com.company;

public class Lesson5_14 {

    public static void main(String[] args) {

        //Write a method to print all prime numbers less than 100.
        //Call in in main

        System.out.println("all prime numbers less then 100");
        primeNumbers(100);
    }

    //prime numbers less then 100
    public static void primeNumbers(int number) {

        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }

    }

}
