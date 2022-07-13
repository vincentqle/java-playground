package com.galvanize;

import java.util.HashMap;

public class RomanToDecimal {

    public static void main(String[] args) {
        System.out.println(romanToDecimal("I"));
        System.out.println(romanToDecimal("V"));
        System.out.println(romanToDecimal("IV"));
        System.out.println(romanToDecimal("MMVI"));
        System.out.println(romanToDecimal("MCMXLIV"));
    }

    private static int romanToDecimal(String input){
        int result = 0;
        String prev = "";
        String letter = "";

        // Create hashmap called numerals
        HashMap<String, Integer> numerals = new HashMap<String, Integer>();

        // add keys and values (numeral, decimal)
        numerals.put("I", 1);
        numerals.put("V", 5);
        numerals.put("X", 10);
        numerals.put("L", 50);
        numerals.put("C", 100);
        numerals.put("D", 500);
        numerals.put("M", 1000);

        for (int i = 0; i < input.length(); i++){
            letter = Character.toString(input.charAt(i));
            result += numerals.get(letter);
            if (prev.equals("I") && (letter.equals("V") || letter.equals("X"))){
                result -= 2;
            } else if (prev.equals("X") && (letter.equals("L") || letter.equals("C"))){
                result -= 20;
            } else if (prev.equals("C") && (letter.equals("D") || letter.equals("M"))){
                result -= 200;
            }
            prev = letter;
        }
        return result;
    }
}
