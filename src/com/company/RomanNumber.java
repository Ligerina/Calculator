package com.company;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    private final HashMap<String, Integer> RomanNumbersUnits = new HashMap<>();
    private final HashMap<String, Integer> RomanNumbersTens = new HashMap<>();
    private final HashMap<String, Integer> RomanNumbersHundreds = new HashMap<>();

    RomanNumber() {
        RomanNumbersUnits.put("I", 1);
        RomanNumbersUnits.put("II", 2);
        RomanNumbersUnits.put("III", 3);
        RomanNumbersUnits.put("IV", 4);
        RomanNumbersUnits.put("V", 5);
        RomanNumbersUnits.put("VI", 6);
        RomanNumbersUnits.put("VII", 7);
        RomanNumbersUnits.put("VIII", 8);
        RomanNumbersUnits.put("IX", 9);
        RomanNumbersUnits.put("X", 10);
        RomanNumbersTens.put("X", 10);
        RomanNumbersTens.put("XX", 20);
        RomanNumbersTens.put("XXX", 30);
        RomanNumbersTens.put("XL", 40);
        RomanNumbersTens.put("L", 50);
        RomanNumbersTens.put("LX", 60);
        RomanNumbersTens.put("LXX", 70);
        RomanNumbersTens.put("LXXX", 80);
        RomanNumbersTens.put("XC", 90);
        RomanNumbersHundreds.put("C", 100);
    }

    boolean isRomanNumberUnderConditions(String number) {
        return RomanNumbersUnits.containsKey(number);
    }

    boolean isRomanNumber(String number) {
        if (RomanNumbersUnits.containsKey(number)) return true;
        if (RomanNumbersTens.containsKey(number)) return true;
        if (RomanNumbersHundreds.containsKey(number)) return true;
        return false;
    }

    String numericAction(String firstOp, String action, String secondOp) {
        int result = 0;
        switch (action) {
            case "-":
                result = RomanNumbersUnits.get(firstOp) - RomanNumbersUnits.get(secondOp);
                break;
            case "+":
                result = RomanNumbersUnits.get(firstOp) + RomanNumbersUnits.get(secondOp);
                break;
            case "/":
                result = RomanNumbersUnits.get(firstOp) / RomanNumbersUnits.get(secondOp);
                break;
            case "*":
                result = RomanNumbersUnits.get(firstOp) * RomanNumbersUnits.get(secondOp);
                break;
        }

        String resultOfNumericAction = calcUnits(result % 10);
        result = result / 10;
        resultOfNumericAction = calcTens(result * 10) + resultOfNumericAction;
        result = result / 10;
        resultOfNumericAction = calcHundreds(result * 100) + resultOfNumericAction;

        return resultOfNumericAction;
    }

    private String calcUnits(int number) {
        for (Map.Entry<String, Integer> pair : RomanNumbersUnits.entrySet()) {
            if (pair.getValue() == number) return pair.getKey();
        }
        return "";
    }

    private String calcTens(int number) {
        for (Map.Entry<String, Integer> pair : RomanNumbersTens.entrySet()) {
            if (pair.getValue() == number) return pair.getKey();
        }
        return "";
    }

    private String calcHundreds(int number) {
        for (Map.Entry<String, Integer> pair : RomanNumbersHundreds.entrySet()) {
            if (pair.getValue() == number) return pair.getKey();
        }
        return "";
    }

}