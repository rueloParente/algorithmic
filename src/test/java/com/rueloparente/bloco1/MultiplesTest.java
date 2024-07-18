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


}