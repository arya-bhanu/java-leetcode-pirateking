package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void Test() {
        assertArrayEquals(new int[]{1, 3}, Solution.extraPerfect(3));
        assertArrayEquals(new int[]{1, 3, 5}, Solution.extraPerfect(5));
        assertArrayEquals(new int[]{1, 3, 5, 7}, Solution.extraPerfect(8));
    }
}