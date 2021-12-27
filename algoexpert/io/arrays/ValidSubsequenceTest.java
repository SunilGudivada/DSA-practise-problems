package algoexpert.io.arrays;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// https://www.algoexpert.io/questions/Validate%20Subsequence

public class ValidSubsequenceTest {

    @Test
    public void TestCase1() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
        assertTrue(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase2() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        assertTrue(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase3() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 22, 6, -1, 8, 10);
        assertTrue(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase4() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(22, 25, 6);
        assertTrue(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase5() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, 10);
        assertTrue(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase6() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 22, 10);
        assertTrue(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase7() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, -1, 8, 10);
        assertTrue(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase8() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Collections.singletonList(25);
        assertTrue(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase9() {
        List<Integer> array = Arrays.asList(1, 1, 1, 1, 1);
        List<Integer> sequence = Arrays.asList(1,1,1);
        assertTrue(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase10() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10, 12);
        assertFalse(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase11() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(4, 5, 1, 22, 25, 6, -1, 8, 10);
        assertFalse(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase12() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 22, 23, 6, -1, 8, 10);
        assertFalse(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase13() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 22, 22, 25, 6, -1, 8, 10);
        assertFalse(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase14() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 22, 22, 6, -1, 8, 10);
        assertFalse(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase15() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, -1);
        assertFalse(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase16() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, -1, 10);
        assertFalse(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase17() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, -2);
        assertFalse(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase18() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(26);
        assertFalse(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase19() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 25, 22, 6, -1, 8, 10);
        assertFalse(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase20() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 26, 22, 8);
        assertFalse(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase21() {
        List<Integer> array = Arrays.asList(1, 1, 6, 1);
        List<Integer> sequence = Arrays.asList(1, 1, 1, 6);
        assertFalse(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase22() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10, 11, 11, 11, 11);
        assertFalse(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase23() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10, 10);
        assertFalse(ValidSubsequence.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase24() {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 5);
        assertFalse(ValidSubsequence.isValidSubsequence(array, sequence));
    }
}
