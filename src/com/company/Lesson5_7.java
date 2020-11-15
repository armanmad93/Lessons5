package com.company;

import java.util.Scanner;

public class Lesson5_7 {

    public static void main(String[] args) {

        //get the year from console (int)
        //write a function to check whether a year entered by the user is a leap year or not.
        //print

        Scanner scanner = new Scanner(System.in);

        System.out.print("plz input year: ");
        int year = scanner.nextInt();

        if (leapYear(year)) {
            System.out.println("year is leap");
        } else {
            System.out.println("year is not leap");
        }

    }

    //find leap year
    public static boolean leapYear(int year) {
        for (int i = 0; i <= year; i += 4) {
            if (i == year) {
                return true;
            }
        }
        return false;
    }

}
