package com.company;

import java.util.Scanner;

public class testMain {
    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);
        String input = st.nextLine();
        String[] array = input.split(" ");
        RomanNumber romanNumber = new RomanNumber();
        while (!input.equals("&")){
            System.out.println("1Roman: " + romanNumber.isRomanNumber(array[0]));
            System.out.println("1RomanUnderCond: " + romanNumber.isRomanNumberUnderConditions(array[0]));
            System.out.println("2Roman: " + romanNumber.isRomanNumber(array[2]));
            System.out.println("2RomanUnderCond: " + romanNumber.isRomanNumberUnderConditions(array[2]));

            System.out.println();
            input = st.nextLine();
            array = input.split(" ");
       }

    }
}