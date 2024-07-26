package com.rueloparente.bloco1;

public class Palindrome {

    public static boolean verifyIfNumberIsPalindrome (int num){
        num = Math.abs(num);

        int originalNumber = num;
        int reversedNumber = 0;

        while (num >0){
        int digit = num % 10;
        reversedNumber = (reversedNumber * 10) + digit;
        num /= 10;
        }

        return reversedNumber == originalNumber;
    }
}
