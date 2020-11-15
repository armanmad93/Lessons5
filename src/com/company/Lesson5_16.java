package com.company;

import java.util.Scanner;

public class Lesson5_16 {

    public static void main(String[] args) {

        //Palindrome Check
        //A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
        //Write a boolean returning method that detects if a string is a palindrome.
        //Hint: Use word.charAt(i) to get the character at position i.

        Scanner scanner = new Scanner(System.in);

        System.out.print("plz input word: ");
        String str = scanner.nextLine();

        System.out.println();

        if (palindromeWord(str)) {
            System.out.println("this word is palindrom");
        } else {
            System.out.println("this word is not palindrom");
        }

    }

    //palindrome metod
    public static boolean palindromeWord(String str) {

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;

    }

}
