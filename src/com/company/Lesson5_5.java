package com.company;

import java.util.Scanner;

public class Lesson5_5 {

    public static void main(String[] args) {

        //get a string from console
        //write a function to display the middle character of a string.

        Scanner scanner = new Scanner(System.in);

        System.out.print("input String text. ");
        String str = scanner.nextLine();

        char sympol = middleSympol(str);

        if (sympol == 0) {
            System.out.println("dont have middle number");
        } else {
            System.out.print("middle sympol is: " + sympol);
        }


    }

    //display middle character
    public static char middleSympol(String str) {

        int middle = str.length() / 2;

        if (str.length() % 2 == 0) {
            return 0;
        } else {
            return str.charAt(middle);
        }

    }

}
