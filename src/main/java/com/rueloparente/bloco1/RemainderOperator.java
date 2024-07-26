package com.rueloparente.bloco1;

public class RemainderOperator {


    public static int digitsOfRealNumber (int num){
        if (num == 0) return 1;

        num = Math.abs(num);
        return (int) (Math.log10(num) + 1);
    }

    public static int[] algorithmsOfNumberIntoArray (int num){
        int numberDigits = digitsOfRealNumber(num);
        int[] digitsInArray = new int[numberDigits];

        for (int i = 0; i < numberDigits; i++){
            digitsInArray[i] = Math.abs(num % 10);
            num = num/10;
        }
        return digitsInArray;
    }

    public static int numberEvenDigitsInNumber (int num){
        int[] digits =  algorithmsOfNumberIntoArray(num);
        int counter = 0;
        for (int i = 0; i<digits.length; i++){
            if (EvenOrOdd.checksIfNumberIsPair(digits[i])) counter ++;
        }
        return counter;
    }

    public static int numberOddDigitsInNumber (int num){
        int[] digits =  algorithmsOfNumberIntoArray(num);
        int counter = 0;
        for (int i = 0; i<digits.length; i++){
            if (!EvenOrOdd.checksIfNumberIsPair(digits[i])) counter ++;
        }
        return counter;
    }

    public static int sumOfDigitsInNumber (int num){
        int sum = 0;
        num = Math.abs(num);
        while (num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    public static int sumOfEvenDigitsInNumber (int num){
        int sum = 0;
        num = Math.abs(num);
        while (num >0){
            int digit = num % 10;
            if (EvenOrOdd.checksIfNumberIsPair(digit)) sum += digit;
            num /= 10;
        }
        return sum;
    }
}
