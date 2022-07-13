package com.galvanize;

public class Fibonacci {
    public static void main(String[] args) {
//        System.out.println("fib: " + fib(8));
//        System.out.println("fibRec: "+ fibRec(8));
//        System.out.println(fibBool(21));
//        System.out.println(fibBool(20));
//        System.out.println(fibBool(34));
//        System.out.println(fibBool(30));
//        System.out.println(fibBool2(12586269025L));
//        System.out.println(fibBool2(20));
//        System.out.println(fibBool2(34));
        System.out.println(fibBool3(21));
        System.out.println(fibBool3(7778742049L));
        System.out.println(fibBool3(12586269025L));

    }

    public static long fib(long num){
        long result = 0;

        if (num == 1){
            return 1;
        }
        if (num == 2) {
            return 1;
        }
        long prev1 = 1;
        long prev2 = 1;
        for (int i = 3; i <= num; i++) {
            result = prev1 + prev2;
            prev1 = prev2;
            prev2 = result;
        }

        return result;
    }

    public static long fibRec(long n) {
        if (n < 2) {
            return n;
        }
        return fibRec(n-1) + fibRec(n-2);
    }

    public static boolean fibBool(long input){
        int i = 1;
        while(input >= fib(i)){
            if(input == fib(i)){
                return true;
            }
            i++;
        }

//        for (int j = 0; j < input; j++) {
//            if (fib(j) == input){
//                return true;
//            }
//        }
        return false;
    }

    public static boolean fibBool2(long num){
        long result = 0;

        if (num == 1){
            return true;
        }

        long prev1 = 1;
        long prev2 = 1;
        while (result <= num) {
            result = prev1 + prev2;
            if (result == num){
                return true;
            }
            prev1 = prev2;
            prev2 = result;
        }

        return false;
    }

    public static boolean squareTest(long input) {
        double n = Math.sqrt(input);
        return (n*n == input);
    }

    public static boolean fibBool3(long num){
        long val1 = 5*(num*num) + 4;
        long val2 = 5*(num*num) - 4;
        return squareTest(val1) || squareTest(val2);
    }
}


