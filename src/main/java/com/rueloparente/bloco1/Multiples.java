package com.rueloparente.bloco1;

import static java.lang.Double.NaN;

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

    public static int sumOfAllMultiplesWithinRange(int num, int min, int max){
        int sum = 0;
        for (int i = min; i <= max; i++){
            if (trueIfTwoNumbersAreMultiples(num, i)) sum += i;
        }
        return sum;
    }
    public static int productOfAllMultiplesWithinRange (int num, int min, int max){
        int product = 1;
        for (int i = min; i <= max; i++){
            if (trueIfTwoNumbersAreMultiples(num, i)) product *= i;
        }
        return product;
    }
    public static double averageOfAllMultiplesWithinRange (int num, int min, int max){
        int sum = 0;
        int counter = 0;
        for (int i = min; i <= max; i++){
            if (trueIfTwoNumbersAreMultiples(num, i)) {
                sum += i;
                counter ++;
            }
        }
        if (counter == 0) return NaN;
        else return (double) sum / counter;
    }
    public static double averageOfMultiplesOfTwoNumbersWithinRange (int num1, int num2, int min, int max){
        int sum = 0;
        int counter = 0;
        for (int i = min; i <= max; i++){
            if (trueIfTwoNumbersAreMultiples(num1, i) && trueIfTwoNumbersAreMultiples(num2, i)){
                sum += i;
                counter ++;
            }
        }
        if (counter == 0) return NaN;
        else return (double) sum / counter;
    }
}
