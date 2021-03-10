package com.genericsproblem;

import java.util.Arrays;

public class GenericsProblemForMaximum<T extends Comparable<T>> {

    T[] values;

    @SafeVarargs
    public GenericsProblemForMaximum(T... values) {
        this.values = values;
    }

    public <T extends Comparable<T>> T getMaximum(){
        T max;
        Arrays.sort(values);
        max = (T) values[values.length - 1];

        printMaximum(max);
        return max;
    }

    public static <T> void printMaximum(T max){
        System.out.println("Maximum is : " + max);
    }
}
