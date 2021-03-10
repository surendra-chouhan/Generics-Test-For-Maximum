package com.genericsproblem;

import java.util.Arrays;

public class GenericsProblemForMaximum<T extends Comparable<T>> {

    T[] values;

    @SafeVarargs
    public GenericsProblemForMaximum(T... values) {
        this.values = values;
    }

    public <T extends Comparable<T>> T getMaximum(){
        Arrays.sort(values);
        return (T) values[values.length - 1];
    }
}
