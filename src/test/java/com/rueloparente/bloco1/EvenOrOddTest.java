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
}