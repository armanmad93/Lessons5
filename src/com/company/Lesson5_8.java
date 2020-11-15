package com.company;

import java.util.Scanner;

public class Lesson5_8 {

    public static void main(String[] args) {

        //get the password from console (String)
        //write a function to check whether a string is a valid password or not
        //Password rules:
        //-- A password must have at least ten characters.
        //-- A password consists of only letters and digits.
        //-- A password must contain at least two digits.
        //print isValid or not;

        Scanner scanner = new Scanner(System.in);

        System.out.print("plz input password: ");
        String str = scanner.nextLine();

        if (isValid(str)) {
            System.out.println("password is valid: " + str);
        } else {
            System.out.println("password is not valid: " + str);
        }

    }

    //rule 1
    public static boolean leastTenCharacter(String str) {

        return str.length() > 10;

    }

    //rule 2
    public static boolean lettersAndNumbers(String str) {

        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        for (int i = 0; i < str.length(); i++) {
            boolean answer = false;
            for (int j = 0; j < alphabet.length(); j++) {
                if (alphabet.charAt(j) == str.charAt(i)) {
                    answer = true;
                    break;
                }
            }
            if (!answer) {
                return false;
            }
        }
        return true;

    }

    //rule 3
    public static boolean howMuchNumbers(String str) {

        String numbers = "0123456789";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < numbers.length(); j++) {
                if (str.charAt(i) == numbers.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        return count >= 2;

    }

    //allrules
    public static boolean isValid(String str) {

        if (leastTenCharacter(str)) {
            if (lettersAndNumbers(str)) {
                if (howMuchNumbers(str)) {
                    return true;
                }
            }
        }

        return false;

    }

}
