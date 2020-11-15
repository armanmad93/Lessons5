package com.company;

import java.util.Scanner;

public class Lesson5_9 {

    public static void main(String[] args) {
        //get radius from console
        //write a function to calculate the area of the circle
        //write a function to calculate the perimeter of the circle

        Scanner scanner = new Scanner(System.in);

        System.out.print("plz input number: ");
        int radius = scanner.nextInt();

        System.out.println("area of the circle is: " + findAreaCircle(radius));
        System.out.println("perimeter of the circle is: " + findPerimeterCircle(radius));

    }

    //find area of the circle
    public static double findAreaCircle(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    //find perimeter of the circle
    public static double findPerimeterCircle(int radius) {
        return 2 * Math.PI * radius;
    }


}
