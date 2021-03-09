package com.genericsproblem;

public class GenericsProblemForMaximum {
    public <T extends Comparable<T>> T getMaximum(T x, T y, T z) {
        if (x.compareTo(y) > 0 && x.compareTo(z) > 0)
            return x;
        else if (y.compareTo(z) > 0 && y.compareTo(x) > 0)
            return y;
        else
            return z;
    }

}
