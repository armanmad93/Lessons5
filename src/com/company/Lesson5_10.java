package com.company;

import java.util.Scanner;

public class Lesson5_10 {

    public static void main(String[] args) {

        //get sides of the triangle
        //write a function to check if the triangle with those sides is a valid triangle
        //write a function to calculate the perimeter of the triangle
        //write a function to calculate the area of the triangle
        //in case the triangle is valid
        //    - calculate perimeter
        //    - calculate area
        //print both

        Scanner scanner = new Scanner(System.in);

        System.out.print("number 1: ");
        int number1 = scanner.nextInt();

        System.out.print("number 2: ");
        int number2 = scanner.nextInt();

        System.out.print("number 3: ");
        int number3 = scanner.nextInt();

        if (isTriangle(number1, number2, number3)) {
            System.out.println("in this sides we can have triangle");
            System.out.println();

            int trianglePerimeter = trianglePerimeter(number1, number2, number3);
            System.out.println("perimeter triangle: " + trianglePerimeter);

            double areaTriangle = areaTriangle(number1, number2, number3);
            System.out.println("area triangle: " + areaTriangle);

        } else {
            System.out.println("valid triangle");
        }

    }

    //check if the triangle with those sides is a valid triangle
    public static boolean isTriangle(int number1, int number2, int number3) {
        if ((number1 + number2) > number3) {
            if ((number1 + number3) > number2) {
                if ((number2 + number3) > number1) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //calculate the perimeter of the triangle
    public static int trianglePerimeter(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    //calculate the area of the triangle
    public static double areaTriangle(int number1, int number2, int number3) {
        int p = (number1 + number2 + number3) / 2;
        return Math.sqrt(p * (p - number1) * (p - number2) * (p - number3));
    }

}
