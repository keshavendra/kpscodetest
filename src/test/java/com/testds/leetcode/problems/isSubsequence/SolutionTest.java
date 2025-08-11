package com.testds.leetcode.problems.isSubsequence;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp(){
        solution = new Solution();
    }

    @Test
    public void testIsSubsequence_EmptyString_ReturnsTrue() {
        // Arrange
        String s = "";
        String t = "abc";

        // Act
        boolean result = solution.isSubsequence(s, t);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void testIsSubsequence_SingleCharacterString_ReturnsTrueIfFoundInT() {
        // Arrange
        String s = "a";
        String t = "abc";

        // Act
        boolean result = solution.isSubsequence(s, t);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void testIsSubsequence_SingleCharacterString_ReturnsFalseIfNotFoundInT() {
        // Arrange
        String s = "d";
        String t = "abc";

        // Act
        boolean result = solution.isSubsequence(s, t);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void testIsSubsequence_MultipleCharactersString_ReturnsTrueIfAllCharactersFoundInOrder() {
        // Arrange
        String s = "ab";
        String t = "ahbgdc";

        // Act
        boolean result = solution.isSubsequence(s, t);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void testIsSubsequence_MultipleCharactersString_ReturnsFalseIfNotAllCharactersFoundInOrder() {
        // Arrange
        String s = "axc";
        String t = "ahbgdc";

        // Act
        boolean result = solution.isSubsequence(s, t);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void testIsSubsequence_LongerStringThanT_ReturnsFalse() {
        // Arrange
        String s = "abcd";
        String t = "abc";

        // Act
        boolean result = solution.isSubsequence(s, t);

        // Assert
        Assert.assertFalse(result);
    }

    @Test(expected = NullPointerException.class)
    public void testIsSubsequence_NullInput_ThrowsNullPointerException() {
        // Arrange
        String s = null;
        String t = "abc";

        // Act
        solution.isSubsequence(s, t);
    }

    @Test(expected = NullPointerException.class)
    public void testIsSubsequence_TNull_ThrowsNullPointerException() {
        // Arrange
        String s = "abc";
        String t = null;

        // Act
        solution.isSubsequence(s, t);
    }
}
