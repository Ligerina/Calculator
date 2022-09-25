package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stringInput = scan.nextLine();

        try {
            StringIsOk checker = new StringIsOk();
            checker.checkIfStringOk(stringInput);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        try {
            NumbersOk checker = new NumbersOk();
            checker.checkIfNumbersOk(stringInput);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        Solver solver = new Solver();
        System.out.println(solver.resultOfTheProgram(stringInput));

    }
}