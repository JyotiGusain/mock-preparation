package com.mock.preparation.ducat.Oops.arrayassignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinMax2DArrayTest {
    private MinMax2DArray minMax2DArray;
    private int a[][];

    @Before
    public void init() {
        a = new int[][]{{41, 32, 13, 24, 55, 67, 45, 23, 68, 89},
                {49, 88, 71, 62, 56, 46, 34, 24, 21, 11}};
        minMax2DArray = new MinMax2DArray();

    }

    @Test
    public void shouldReturnMaxNumberInGivenArray() {
        int expectedMaxNumber = 89;
        int actualMaxNumber = minMax2DArray.findMaxNumber(a);
        Assert.assertEquals(expectedMaxNumber, actualMaxNumber);
    }

    @Test
    public void shouldReturnMinNumberInGivenArray() {
        int expectedMinNumber = 11;
        int actualMinNumber = minMax2DArray.findMinNumber(a);
        Assert.assertEquals(expectedMinNumber, actualMinNumber);
    }

    @Test
    public void shouldReturnMinusOneWhenArrayIsNull() {
        int expectedMinusOne = -1;
        int actual = minMax2DArray.findMaxNumber(null);
        Assert.assertEquals(expectedMinusOne, actual);
    }
}

