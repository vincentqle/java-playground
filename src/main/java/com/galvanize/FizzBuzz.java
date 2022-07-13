package com.galvanize;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(7));
    }

    private static String fizzBuzz(int input){
        if ((input % 3 == 0) && (input % 5 == 0)) {
            return "FizzBuzz";
        } else if (input % 5 == 0) {
            return "Buzz";
        } else if (input % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(input);
        }
    }
}
