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
        int result = max.getIntMaximum(30, 20, 10);
        Assert.assertEquals(30, result);
    }

    @Test
    public void given_MaxNumberat_SecondPosition_Returns_True_Test() {
        int result = max.getIntMaximum(20, 30, 10);
        Assert.assertEquals(30, result);
    }

    @Test
    public void given_MaxNumberat_ThirdPosition_Returns_True_Test() {
        int result = max.getIntMaximum(10, 20, 30);
        Assert.assertEquals(30, result);
    }


    @Test
    public void given_MaxDoubleat_FirstPosition_Returns_True_Test() {
        double result = max.getDoubleMaximum(10.55, 6.5, 8.5);
        Assert.assertEquals(10.55, result, 0.001);
    }

    @Test
    public void given_MaxDoubleat_SecondPosition_Returns_True_Test() {
        double result = max.getDoubleMaximum(8.5, 10.55, 6.5);
        Assert.assertEquals(10.55, result, 0.001);
    }

    @Test
    public void given_MaxDoubleat_ThirdPosition_Returns_True_Test() {
        double result = max.getDoubleMaximum(8.5, 6.5, 10.55);
        Assert.assertEquals(10.55, result, 0.001);
    }


    @Test
    public void given_MaxStringat_FirstPosition_Returns_True_Test() {
        String result = max.getStringMaximum("Peach", "Banana", "Apple");
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void given_MaxStringat_SecondPosition_Returns_True_Test() {
        String result = max.getStringMaximum("Apple","Peach","Banana");
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void given_MaxStringat_ThirdPosition_Returns_True_Test() {
        String result = max.getStringMaximum("Apple", "Peach", "banana");
        Assert.assertEquals("banana", result);
    }
}
