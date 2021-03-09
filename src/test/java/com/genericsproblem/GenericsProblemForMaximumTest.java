package com.genericsproblem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenericsProblemForMaximumTest {
    GenericsProblemForMaximum max;

    @Before
    public void set() throws Exception {
        max = new GenericsProblemForMaximum();
    }

    @Test
    public void given_MaxNumberat_FirstPosition_Returns_True_Test() {
        int result = max.getIntMaximum(30,20,10);
        Assert.assertEquals(30, result);
    }

    @Test
    public void given_MaxNumberat_SecondPosition_Returns_True_Test() {
        int result = max.getIntMaximum(20,30,10);
        Assert.assertEquals(30, result);
    }

    @Test
    public void given_MaxNumberat_ThirdPosition_Returns_True_Test() {
        int result = max.getIntMaximum(10,20,30);
        Assert.assertEquals(30,result);
    }
}
