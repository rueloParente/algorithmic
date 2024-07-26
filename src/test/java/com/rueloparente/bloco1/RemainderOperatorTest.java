package com.rueloparente.bloco1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemainderOperatorTest {
    @Test
    void shouldReturnNumberOfDigitsInNegativeInteger() {
        // Arrange
        int num = -123;
        int expected = 3;
        // Act
        int actual = RemainderOperator.digitsOfRealNumber(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnNumberOfDigitsInNegativeSingleDigitInteger() {
        // Arrange
        int num = -5;
        int expected = 1;
        // Act
        int actual = RemainderOperator.digitsOfRealNumber(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnNumberOfDigitsInZero() {
        // Arrange
        int num = 0;
        int expected = 1;
        // Act
        int actual = RemainderOperator.digitsOfRealNumber(num);
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnNumberOfDigitsInInteger() {
        // Arrange
        int num = 123;
        int expected = 3;
        // Act
        int actual = RemainderOperator.digitsOfRealNumber(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnDigitsOfNumberInArray() {
        // Arrange
        int num = 123;
        int[] expected = {3, 2, 1};
        // Act
        int[] actual = RemainderOperator.algorithmsOfNumberIntoArray(num);
        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldReturnDigitsOfNegativeNumberInArray() {
        // Arrange
        int num = -123;
        int[] expected = {3, 2, 1};
        // Act
        int[] actual = RemainderOperator.algorithmsOfNumberIntoArray(num);
        // Assert
        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldReturnDigitsOfSingleDigitNumberInArray() {
        // Arrange
        int num = 5;
        int[] expected = {5};
        // Act
        int[] actual = RemainderOperator.algorithmsOfNumberIntoArray(num);
        // Assert
        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldReturnDigitsOfZeroInArray() {
        // Arrange
        int num = 0;
        int[] expected = {0};
        // Act
        int[] actual = RemainderOperator.algorithmsOfNumberIntoArray(num);
        // Assert
        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldReturnNumberOfEvenDigitsInNumber() {
        // Arrange
        int num = 123;
        int expected = 1;
        // Act
        int actual = RemainderOperator.numberEvenDigitsInNumber(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnNumberOfEvenDigitsInNegativeNumber() {
        // Arrange
        int num = -123;
        int expected = 1;
        // Act
        int actual = RemainderOperator.numberEvenDigitsInNumber(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnNumberOfEvenDigitsInSingleDigitNumber() {
        // Arrange
        int num = 5;
        int expected = 0;
        // Act
        int actual = RemainderOperator.numberEvenDigitsInNumber(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnNumberOfEvenDigitsInZero() {
        // Arrange
        int num = 0;
        int expected = 1;
        // Act
        int actual = RemainderOperator.numberEvenDigitsInNumber(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnNumberOfOddDigitsInNumber() {
        // Arrange
        int num = 123;
        int expected = 2;
        // Act
        int actual = RemainderOperator.numberOddDigitsInNumber(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnNumberOfOddDigitsInNegativeNumber() {
        // Arrange
        int num = -125;
        int expected = 2;
        // Act
        int actual = RemainderOperator.numberOddDigitsInNumber(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnNumberOfOddDigitsInSingleDigitNumber() {
        // Arrange
        int num = 5;
        int expected = 1;
        // Act
        int actual = RemainderOperator.numberOddDigitsInNumber(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnNumberOfOddDigitsInZero() {
        // Arrange
        int num = 0;
        int expected = 0;
        // Act
        int actual = RemainderOperator.numberOddDigitsInNumber(num);
        // Assert
        assertEquals(expected, actual);
    }

}