package com.company;

public class NumbersOk {

    private final String KIND_MISMATCH = "Неверный формат данных. Оба числа должны быть либо арабскими, либо римскими. Или введены числа выходящие за рабочий диапазон";
    private final String NEGATIVE_RESULT = "Результат вычисления либо равен нулю, либо отрицательный ( В римской системе нет отрицательных чисел )";
    private final String INCORRECT_NUMBER = "Неверный формат данных. Помимо арабских и римских цифр в строке есть лишние символы или введены не целые числа";
    private final String OUT_OF_BOUNDS = "Неверный формат данных. Введенные числа не входят в рабочий диапазон";

    RomanNumber romanNumber = new RomanNumber();

    void checkIfNumbersOk(String input) throws Exception {
        String[] arrayOfSymbols = input.split(" ");

        if (romanNumber.isRomanNumber(arrayOfSymbols[0])) {
            if (!romanNumber.isRomanNumberUnderConditions(arrayOfSymbols[0])) throw new Exception(OUT_OF_BOUNDS);
            if (!romanNumber.isRomanNumber(arrayOfSymbols[2])) throw new Exception(KIND_MISMATCH);
            if (!romanNumber.isRomanNumberUnderConditions(arrayOfSymbols[2])) throw new Exception(OUT_OF_BOUNDS);
            //Проверка получается ли число отрицательное в римской системе исчисления
            if (arrayOfSymbols[1].equals("-")) {
                if (romanNumber.numericAction(arrayOfSymbols[0], arrayOfSymbols[1], arrayOfSymbols[2]).equals(""))
                    throw new Exception(NEGATIVE_RESULT);
            }
        } else {
            if (romanNumber.isRomanNumber(arrayOfSymbols[2])) throw new Exception(KIND_MISMATCH);

            if (arrayOfSymbols[0].replaceAll("[0-9]", "").length() != 0
                    ||
                    arrayOfSymbols[2].replaceAll("[0-9]", "").length() != 0) throw new Exception(INCORRECT_NUMBER);

            if (Integer.parseInt(arrayOfSymbols[0]) <= 0 || Integer.parseInt(arrayOfSymbols[0]) > 10)
                throw new Exception(OUT_OF_BOUNDS);
            if (Integer.parseInt(arrayOfSymbols[2]) <= 0 || Integer.parseInt(arrayOfSymbols[2]) > 10)
                throw new Exception(OUT_OF_BOUNDS);

        }


    }
}