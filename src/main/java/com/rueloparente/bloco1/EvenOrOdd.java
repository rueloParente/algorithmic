package com.rueloparente.bloco1;

public class EvenOrOdd {
    public static boolean checksIfNumberIsPair (int num){
        return num % 2 == 0;
    }

    public static int sumAllEvenNumbersInGivenRange (int min, int max){
        int sum = 0;
        for (int i = min; i<=max; i++){
            if (checksIfNumberIsPair(i)) sum += i;
        }
        return sum;
    }

    public static int quantityOfEvenNumbersInGivenRange (int min, int max){
        int quantity = 0;
        for (int i = min; i<=max; i++){
            if (checksIfNumberIsPair(i)) quantity++;
        }
        return quantity;
    }


}
