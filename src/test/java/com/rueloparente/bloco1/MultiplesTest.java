package com.rueloparente.bloco1;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MultiplesTest {
    @Test
    void shouldReturnTrueIfTwoNumbersAreMultiples() {
        // Arrange
        int divisor = 2;
        int number = 4;
        boolean expected = true;
        // Act
        boolean actual = Multiples.trueIfTwoNumbersAreMultiples(divisor, number);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnFalseIfTwoNumbersAreNotMultiples() {
        // Arrange
        int divisor = 2;
        int number = 3;
        boolean expected = false;
        // Act
        boolean actual = Multiples.trueIfTwoNumbersAreMultiples(divisor, number);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnTrueWhenNumberIsEqualDivisor() {
        // Arrange
        int divisor = 2;
        int number = 2;
        boolean expected = true;
        // Act
        boolean actual = Multiples.trueIfTwoNumbersAreMultiples(divisor, number);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnTrueWhenDivisorIsZero() {
        // Arrange
        int divisor = 0;
        int number = 2;
        boolean expected = true;
        // Act
        boolean actual = Multiples.trueIfTwoNumbersAreMultiples(divisor, number);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnFalseWhenNumberIsNegative() {
        // Arrange
        int divisor = 2;
        int number = -2;
        boolean expected = false;
        // Act
        boolean actual = Multiples.trueIfTwoNumbersAreMultiples(divisor, number);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnNumberOfMultiplesOfOneNumberInGivenInterval() {
        // Arrange
        int divisor = 2;
        int lowerBond = 1;
        int upperBond = 10;
        int expected = 5;
        // Act
        int actual = Multiples.multiplesOfOneNumbersInGivenInterval(divisor, lowerBond, upperBond);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnNumberOfMultiplesOfTwoNumbersInGivenInterval() {
        // Arrange
        int firstDivisor = 2;
        int secondDivisor = 3;
        int lowerBond = 1;
        int upperBond = 10;
        int expected = 1;
        // Act
        int actual = Multiples.multiplesOfTwoNumbersInGivenInterval(firstDivisor, secondDivisor, lowerBond, upperBond);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnSumOfAllMultiplesWithinRange() {
        // Arrange
        int num = 2;
        int min = 1;
        int max = 10;
        int expected = 30;
        // Act
        int actual = Multiples.sumOfAllMultiplesWithinRange(num, min, max);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnZeroWhenNoMultiplesWithinRange() {
        // Arrange
        int num = 2;
        int min = 3;
        int max = 3;
        int expected = 0;
        // Act
        int actual = Multiples.sumOfAllMultiplesWithinRange(num, min, max);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnZeroIfRangeIsInverse() {
        // Arrange
        int num = 2;
        int min = 10;
        int max = 1;
        int expected = 0;
        // Act
        int actual = Multiples.sumOfAllMultiplesWithinRange(num, min, max);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnProductOfAllMultiplesWithinRange() {
        // Arrange
        int num = 2;
        int min = 1;
        int max = 10;
        int expected = 3840;
        // Act
        int actual = Multiples.productOfAllMultiplesWithinRange(num, min, max);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnNullWhenNoMultiplesWithinRange() {
        // Arrange
        int num = 2;
        int min = 3;
        int max = 3;
        int expected = 1;
        // Act
        int actual = Multiples.productOfAllMultiplesWithinRange(num, min, max);
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnAverageOfAllMultiplesWithinRange() {
        // Arrange
        int num = 2;
        int min = 1;
        int max = 10;
        double expected = 6.0;
        // Act
        double actual = Multiples.averageOfAllMultiplesWithinRange(num, min, max);
        // Assert
        assertEquals(expected, actual, 0.0001);
    }
    @Test
    void shouldReturnNaNWhenNoMultiplesWithinRange() {
        // Arrange
        int num = 2;
        int min = 3;
        int max = 3;
        double expected = Double.NaN;
        // Act
        double actual = Multiples.averageOfAllMultiplesWithinRange(num, min, max);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnAverageOffAllMultiplesWhenResultInNotInteger() {
        // Arrange
        int num = 3;
        int min = 1;
        int max = 7;
        double expected = 4.5;
        // Act
        double actual = Multiples.averageOfAllMultiplesWithinRange(num, min, max);
        // Assert
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void shouldReturnAverageOfMultiplesOfTwoNumbersWithinRange() {
        // Arrange
        int num1 = 2;
        int num2 = 3;
        int min = 1;
        int max = 10;
        double expected = 6.0;
        // Act
        double actual = Multiples.averageOfMultiplesOfTwoNumbersWithinRange(num1, num2, min, max);
        // Assert
        assertEquals(expected, actual, 0.0001);
    }
    @Test
    void shouldReturnNaNWhenNoMultiplesOfTwoNumbersWithinRange() {
        // Arrange
        int num1 = 2;
        int num2 = 3;
        int min = 4;
        int max = 4;
        double expected = Double.NaN;
        // Act
        double actual = Multiples.averageOfMultiplesOfTwoNumbersWithinRange(num1, num2, min, max);
        // Assert
        assertEquals(expected, actual);
    }

}