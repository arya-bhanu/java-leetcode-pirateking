package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void Test() {
        assertEquals(3, Solution.romanToInt("III"));
        assertEquals(58, Solution.romanToInt("LVIII"));
        assertEquals(1994, Solution.romanToInt("MCMXCIV"));
    }

    @Test
    public void Test_Valid_Parentheses(){
        assertTrue(Solution.isValid("()"));
        assertTrue(Solution.isValid("()[]{}"));
        assertFalse(Solution.isValid("(]"));
        assertTrue(Solution.isValid("([])"));
        assertFalse(Solution.isValid("([)]"));
        assertFalse(Solution.isValid("["));
        assertFalse(Solution.isValid("]"));
    }
}