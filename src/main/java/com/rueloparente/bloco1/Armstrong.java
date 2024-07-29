package com.rueloparente.bloco1;

import static java.lang.Double.NaN;

public class Armstrong {
    public static boolean verifyIfNumberIsArmstrong (int num) {
        num = Math.abs(num);
        int originalNumber = num;
        int resultingNumber = 0;

        while (num > 0){
            int digit = num % 10;
            resultingNumber += (int) Math.pow(digit, 3);
            num /= 10;
        }
        return originalNumber == resultingNumber;
    }

    public static double firstArmstrongNumberInGivenRange (int min, int max){
        for (int i = min; i <= max; i++){
            if (verifyIfNumberIsArmstrong(i)) return i;
        }
        return NaN;
    }

    public static double highestArmstrongNumberInGivenRange (int min, int max){
        for (int i=max; i >= min; i--){
            if (verifyIfNumberIsArmstrong(i)) return i;
        }
        return NaN;
    }
}
