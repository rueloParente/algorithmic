package com.rueloparente.bloco1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    void shouldReturnTrueIfNumberIsPalindrome() {
        // Arrange
        int num = 12321;
        boolean expected = true;
        // Act
        boolean actual = Palindrome.verifyIfNumberIsPalindrome(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnFalseIfNumberIsNotPalindrome() {
        // Arrange
        int num = 12345;
        boolean expected = false;
        // Act
        boolean actual = Palindrome.verifyIfNumberIsPalindrome(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnTrueIfNumberIsSingleDigitPalindrome() {
        // Arrange
        int num = 5;
        boolean expected = true;
        // Act
        boolean actual = Palindrome.verifyIfNumberIsPalindrome(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnTrueIfNumberIsNegativePalindrome() {
        // Arrange
        int num = -12321;
        boolean expected = true;
        // Act
        boolean actual = Palindrome.verifyIfNumberIsPalindrome(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnFalseIfNumberIsNegativeNotPalindrome() {
        // Arrange
        int num = -12345;
        boolean expected = false;
        // Act
        boolean actual = Palindrome.verifyIfNumberIsPalindrome(num);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnTrueIfNumberIsZero() {
        // Arrange
        int num = 0;
        boolean expected = true;
        // Act
        boolean actual = Palindrome.verifyIfNumberIsPalindrome(num);
        // Assert
        assertEquals(expected, actual);
    }

}