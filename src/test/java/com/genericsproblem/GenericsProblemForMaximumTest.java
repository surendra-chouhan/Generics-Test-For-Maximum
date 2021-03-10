package com.genericsproblem;

import org.junit.Assert;
import org.junit.Test;

public class GenericsProblemForMaximumTest {
    @Test
    public void given_MultipleIntegers_as_Input_Returns_Maximum() {
        GenericsProblemForMaximum<Integer> max = new GenericsProblemForMaximum<>(50, 20, 10, 40, 30);
        int result = max.getMaximum();
        Assert.assertEquals(50, result);
    }

    @Test
    public void given_MultipleDoubles_as_Input_Returns_Maximum() {
        GenericsProblemForMaximum<Double> max = new GenericsProblemForMaximum<>(50.00, 20.6, 10.0, 40.55, 30.5);
        double result = max.getMaximum();
        Assert.assertEquals(50.00, result, 0.001);
    }

    @Test
    public void given_MultipleStrings_as_Input_Returns_Maximum() {
        GenericsProblemForMaximum<String> max = new GenericsProblemForMaximum<>("Apple", "Peach", "mango", "pineapple", "Banana");
        String result = max.getMaximum();
        Assert.assertEquals("pineapple", result);
    }
}