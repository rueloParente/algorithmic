package com.rueloparente.bloco1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmstrongTest {
    @Test
    void shouldReturnTrueIfNumberIsArmstrong() {
        // Arrange
        int num = 153;
        boolean expected = true;
        // Act
        boolean actual = Armstrong.verifyIfNumberIsArmstrong(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnFalseIfNumberIsNotArmstrong() {
        // Arrange
        int num = 123;
        boolean expected = false;
        // Act
        boolean actual = Armstrong.verifyIfNumberIsArmstrong(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnTrueIfNumberIsSingleDigitArmstrong() {
        // Arrange
        int num = 0;
        boolean expected = true;
        // Act
        boolean actual = Armstrong.verifyIfNumberIsArmstrong(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnTrueIfNumberIsNegativeArmstrong() {
        // Arrange
        int num = -153;
        boolean expected = true;
        // Act
        boolean actual = Armstrong.verifyIfNumberIsArmstrong(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnFalseIfNumberIsNegativeNotArmstrong() {
        // Arrange
        int num = -123;
        boolean expected = false;
        // Act
        boolean actual = Armstrong.verifyIfNumberIsArmstrong(num);
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnFirstArmstrongNumberInGivenRange() {
        // Arrange
        int min = 2;
        int max = 1000;
        double expected = 153;
        // Act
        double actual = Armstrong.firstArmstrongNumberInGivenRange(min, max);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnFirstArmstrongNumberInGivenRangeIfRangeIsSingleDigit() {
        // Arrange
        int min = 1;
        int max = 9;
        double expected = 1;
        // Act
        double actual = Armstrong.firstArmstrongNumberInGivenRange(min, max);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnFirstArmstrongNumberWhenAtEndOfRange() {
        // Arrange
        int min = 2;
        int max = 153;
        double expected = 153;
        // Act
        double actual = Armstrong.firstArmstrongNumberInGivenRange(min, max);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnNaNIfNoArmstrongNumberInGivenRange() {
        // Arrange
        int min = 2;
        int max = 152;
        double expected = Double.NaN;
        // Act
        double actual = Armstrong.firstArmstrongNumberInGivenRange(min, max);
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnHighestArmstrongNumberInGivenRange() {
        // Arrange
        int min = 1;
        int max = 1000;
        double expected = 407;
        // Act
        double actual = Armstrong.highestArmstrongNumberInGivenRange(min, max);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnNaNIfNoArmstrongNumberInGivenRangeForHighest() {
        // Arrange
        int min = 2;
        int max = 152;
        double expected = Double.NaN;
        // Act
        double actual = Armstrong.highestArmstrongNumberInGivenRange(min, max);
        // Assert
        assertEquals(expected, actual);
    }
}