package com.company;

import java.util.Scanner;

public class Lesson5_6 {

    public static void main(String[] args) {

        //get a sentence from console
        //write a function to count all words in a string.
        //print count;

        Scanner scanner = new Scanner(System.in);

        System.out.print("plz write text: ");
        String str = scanner.nextLine();

        int count = countWords(str);

        System.out.println("in sentence from console we have " + count + " words.");
    }

    //count words
    public static int countWords(String str) {
        String[] strArray = str.split(" ");
        return strArray.length;
    }

}
