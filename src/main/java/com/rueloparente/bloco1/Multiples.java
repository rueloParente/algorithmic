package com.rueloparente.bloco1;

public class Multiples {

    //Assumes that zero is a multiple of any number
    public static boolean trueIfTwoNumbersAreMultiples (int divisor, int number){
        if (divisor == 0) return true;
        else if (number < 0 || divisor < 0) return false;
        else return (number%divisor == 0);
    }


    public static int multiplesOfOneNumbersInGivenInterval (int divisor, int lowerBond, int upperBond){
        int result = 0;
        for (int i= lowerBond; i <= upperBond; i++){
            if (trueIfTwoNumbersAreMultiples(divisor, i)) result += 1;
        }
        return result;
    }

    public static int multiplesOfTwoNumbersInGivenInterval(int firstDivisor, int secondDivisor, int lowerBond, int upperBond){
        int result = 0;
        for (int i= lowerBond; i<= upperBond; i++){
            if (trueIfTwoNumbersAreMultiples(firstDivisor, i) && trueIfTwoNumbersAreMultiples(secondDivisor, i)) result += 1;
        }
        return result;
    }
}
