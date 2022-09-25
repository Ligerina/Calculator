package com.company;

public class Solver {

    String resultOfTheProgram(String input) {
        String[] arrayOfSymbols = input.split(" ");
        RomanNumber romanNumber = new RomanNumber();
        if (romanNumber.isRomanNumberUnderConditions(arrayOfSymbols[0])) {
            return romanNumber.numericAction(arrayOfSymbols[0], arrayOfSymbols[1], arrayOfSymbols[2]);
            //Проверка на то является ли римским числом и вычисление его
        } else {
            switch (arrayOfSymbols[1]) {
                case "-":
                    return Integer.toString(Integer.parseInt(arrayOfSymbols[0]) - Integer.parseInt(arrayOfSymbols[2]));
                case "+":
                    return Integer.toString(Integer.parseInt(arrayOfSymbols[0]) + Integer.parseInt(arrayOfSymbols[2]));
                case "/":
                    return Integer.toString(Integer.parseInt(arrayOfSymbols[0]) / Integer.parseInt(arrayOfSymbols[2]));
                case "*":
                    return Integer.toString(Integer.parseInt(arrayOfSymbols[0]) * Integer.parseInt(arrayOfSymbols[2]));
            }
        }
        return "Указанный операнд не верный";
    }
}
