package com.rueloparente.bloco1;

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
}
