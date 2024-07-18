package com.rueloparente.bloco1;

public class Factorial {

    public static long factorialOfNumber(int n) {
        if (n > 20 || n < 0) return -1;

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
