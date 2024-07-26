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

}