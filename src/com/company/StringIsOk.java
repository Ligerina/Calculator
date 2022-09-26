package com.company;

public class StringIsOk {
    private final String INCORRECT_MATH_OPERATION = "Неверный формат данных. Строка не является математической операцией.";
    private final String NUMEROUS_OPERATIONS = "Неверный формат данных. Формат математической операции не удовлетворяет заданию - два операнда и один оператор.";
    private final String INCORRECT_OPERATOR = "Неверный формат данных. Неверный оператор.";

    void checkIfStringOk(String input) throws Exception {
        String[] arrayOfSymbols = input.split(" ");
        /*
          Проверяем по формату ввода строки.
          Если строка не удолетворяет формату
          ЦИФРА ПРОБЕЛ ЗНАК ПРОБЕЛ ЦИФРА
          То что-то введено не так
         */
        if (arrayOfSymbols.length < 3) throw new Exception(INCORRECT_MATH_OPERATION);
        if (arrayOfSymbols.length > 3) throw new Exception(NUMEROUS_OPERATIONS);
        if (!arrayOfSymbols[1].equals("-") && !arrayOfSymbols[1].equals("+") && !arrayOfSymbols[1].equals("/") && !arrayOfSymbols[1].equals("*")) {
            throw new Exception(INCORRECT_OPERATOR);
        }

    }

}