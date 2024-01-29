package org.example.leetcode_task.l01_two_pointers.l013_ordered_squares;

import org.junit.Assert;
import org.junit.Test;

public class OrderedSquaresArrayTest {
    @Test
    public void testMakeOrderedSquaresWithMiddleCase () {
        OrderedSquaresArray arr = new OrderedSquaresArray();
        int[] actualArr = arr.makeOrderedSquares(new int[]{-4,-1,0,3,10});
        Assert.assertArrayEquals(new int[]{0,1,9,16,100}, actualArr);
    }

    @Test
    public void testMakeOrderedSquaresWithSimpleCase () {
        OrderedSquaresArray arr = new OrderedSquaresArray();
        int[] actualArr = arr.makeOrderedSquares(new int[]{5});
        Assert.assertArrayEquals(new int[]{25}, actualArr);
    }

    @Test
    public void testMakeOrderedSquaresWithEmptyCase () {
        OrderedSquaresArray arr = new OrderedSquaresArray();
        int[] actualArr = arr.makeOrderedSquares(new int[]{});
        Assert.assertArrayEquals(new int[]{}, actualArr);
    }
}