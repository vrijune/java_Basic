package ictgradschool.industry.arrays.morearrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMoreArrays {
    MoreArrays moreArrays;
    @BeforeEach
    void setUp() throws Exception {
        moreArrays = new MoreArrays();
    }

    @Test
    public void testGetPairSumTo() {
        assertEquals("4, 6", moreArrays.getPairSumTo(new int[] {1, 2, 3, 4, 5, 6}, 10));
        assertEquals("0", moreArrays.getPairSumTo(new int[] {1, 2, 3, 4, 5}, 10));
        assertEquals("0", moreArrays.getPairSumTo(new int[] {8}, 8));
        assertEquals("-10, 2", moreArrays.getPairSumTo(new int[] {-10, 2, 39, 14, 70, 5}, -8));
        assertEquals("2, 3", moreArrays.getPairSumTo(new int[] {2, 3}, 5));
        assertEquals("0, 3", moreArrays.getPairSumTo(new int[] {0, 1, 3}, 3));
    }

    @Test
    public void testRemoveDuplicates() {
        assertArrayEquals(new String[] {"abc", "123"}, moreArrays.removeDuplicates(new String[] {"abc", "123"}));
        assertArrayEquals(new String[] {"abc"}, moreArrays.removeDuplicates(new String[] {"abc"}));
        assertArrayEquals(new String[] {"hello", "goodbye"}, moreArrays.removeDuplicates(new String[] {"hello", "goodbye", "hello", "hello"}));
        assertArrayEquals(new String[] {"blah"}, moreArrays.removeDuplicates(new String[] {"blah", "blah", "blah", "blah"}));
    }

    @Test
    public void testFindCommonNumbers() {
        assertArrayEquals(new int[] {2, 4}, moreArrays.findCommonNumbers(new int[] {1, 2, 3, 4, 5}, new int[] {6, 7, 8, 9, 2, 4}));
        assertArrayEquals(new int[] {}, moreArrays.findCommonNumbers(new int[] {1, 2, 3, 4, 5}, new int[] {6, 7, 8, 9, 10}));
        assertArrayEquals(new int[] {43}, moreArrays.findCommonNumbers(new int[] {-1, 79, 43, 5}, new int[] {6, -79, 1, -5, 43}));
        assertArrayEquals(new int[] {}, moreArrays.findCommonNumbers(new int[] {1}, new int[] {2}));
        assertArrayEquals(new int[] {100, 2}, moreArrays.findCommonNumbers(new int[] {100, 2}, new int[] {2, 100}));
    }

    @Test
    public void testConvertIntToBinary() {
        assertEquals("100", moreArrays.convertIntToBinary(4));
        assertEquals("0", moreArrays.convertIntToBinary(0));
        assertEquals("1100100", moreArrays.convertIntToBinary(100));
        assertEquals("11", moreArrays.convertIntToBinary(3));
        assertEquals("1000", moreArrays.convertIntToBinary(8));
    }
}