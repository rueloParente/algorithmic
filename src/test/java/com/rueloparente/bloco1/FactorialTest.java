package com.rueloparente.bloco1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    void shouldReturnOneWhenFactorialOfZero() {
        // Arrange
        int n = 0;
        long expected = 1;
        // Act
        long actual = Factorial.factorialOfNumber(n);
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnOneWhenFactorialOfOne() {
        // Arrange
        int n = 1;
        long expected = 1;
        // Act
        long actual = Factorial.factorialOfNumber(n);
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnTwoWhenFactorialOfTwo() {
        // Arrange
        int n = 2;
        long expected = 2;
        // Act
        long actual = Factorial.factorialOfNumber(n);
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnSixWhenFactorialOfThree() {
        // Arrange
        int n = 3;
        long expected = 6;
        // Act
        long actual = Factorial.factorialOfNumber(n);
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnFactorialOfTwenty() {
        // Arrange
        int n = 20;
        long expected = 2432902008176640000L;
        // Act
        long actual = Factorial.factorialOfNumber(n);
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnNegativeWhenFactorialAboveRange() {
        // Arrange
        int n = 21;
        long expected = -1;
        // Act
        long actual = Factorial.factorialOfNumber(n);
        // Assert
        assertEquals(expected, actual);
    }

}