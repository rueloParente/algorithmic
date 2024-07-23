package com.rueloparente.bloco1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {
    @Test
    void shouldReturnTrueIfNumberIsPair() {
        // Arrange
        int num = 4;
        boolean expected = true;
        // Act
        boolean actual = EvenOrOdd.checksIfNumberIsPair(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnFalseIfNumberIsNotPair() {
        // Arrange
        int num = 3;
        boolean expected = false;
        // Act
        boolean actual = EvenOrOdd.checksIfNumberIsPair(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnTrueWhenNumberIsZero() {
        // Arrange
        int num = 0;
        boolean expected = true;
        // Act
        boolean actual = EvenOrOdd.checksIfNumberIsPair(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnTrueWhenNumberIsNegativeAndEven() {
        // Arrange
        int num = -2;
        boolean expected = true;
        // Act
        boolean actual = EvenOrOdd.checksIfNumberIsPair(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnFalseWhenNumberIsNegativeAndOdd() {
        // Arrange
        int num = -3;
        boolean expected = false;
        // Act
        boolean actual = EvenOrOdd.checksIfNumberIsPair(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnSumOfAllEvenNumbersInGivenRangeWhenMultipleNumbersAreEven() {
        // Arrange
        int min = 1;
        int max = 10;
        int expected = 30;
        // Act
        int actual = EvenOrOdd.sumAllEvenNumbersInGivenRange(min, max);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnZeroWhenNoNumbersAreEven() {
        // Arrange
        int min = 3;
        int max = 3;
        int expected = 0;
        // Act
        int actual = EvenOrOdd.sumAllEvenNumbersInGivenRange(min, max);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnZeroWhenMinIsGreaterThanMax() {
        // Arrange
        int min = 10;
        int max = 1;
        int expected = 0;
        // Act
        int actual = EvenOrOdd.sumAllEvenNumbersInGivenRange(min, max);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnOneWhenMinAndMaxAreBothEven() {
        // Arrange
        int min = 2;
        int max = 2;
        int expected = 2;
        // Act
        int actual = EvenOrOdd.sumAllEvenNumbersInGivenRange(min, max);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnQuantityOfEvenNumbersInGivenRangeWhenMultipleNumbersAreEven() {
        // Arrange
        int min = 1;
        int max = 10;
        int expected = 5;
        // Act
        int actual = EvenOrOdd.quantityOfEvenNumbersInGivenRange(min, max);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnZeroWhenNoNumbersAreEvenInQuantity() {
        // Arrange
        int min = 3;
        int max = 3;
        int expected = 0;
        // Act
        int actual = EvenOrOdd.quantityOfEvenNumbersInGivenRange(min, max);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnZeroWhenMinIsGreaterThanMaxInQuantity() {
        // Arrange
        int min = 10;
        int max = 1;
        int expected = 0;
        // Act
        int actual = EvenOrOdd.quantityOfEvenNumbersInGivenRange(min, max);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnOneWhenMinAndMaxAreBothEvenInQuantity() {
        // Arrange
        int min = 2;
        int max = 2;
        int expected = 1;
        // Act
        int actual = EvenOrOdd.quantityOfEvenNumbersInGivenRange(min, max);
        // Assert
        assertEquals(expected, actual);
    }
}